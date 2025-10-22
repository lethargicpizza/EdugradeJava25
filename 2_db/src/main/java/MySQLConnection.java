

import java.sql.*;
import java.time.LocalDateTime;

public class MySQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wardrobe?serverTimezone=UTC";
        String user = "root";
        String password = "rootpass";

        System.out.println("=== Example 01: MySQL Connection ===\n");
        System.out.println("Försöker ansluta till MySQL...");
        System.out.println("URL: " + url);
        System.out.println("Användare: " + user);
        System.out.println();

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            System.out.println("✅ Anslutning lyckades!");
            System.out.println();

            // ============================================================
            // Hämta metadata om anslutningen
            // ============================================================

            System.out.println("=== Anslutningsinformation ===");
            System.out.println("Databas: " + conn.getCatalog());
            System.out.println("Server: " + conn.getMetaData().getDatabaseProductName());
            System.out.println("Version: " + conn.getMetaData().getDatabaseProductVersion());
            System.out.println("Driver: " + conn.getMetaData().getDriverName());
            System.out.println("Driver-version: " + conn.getMetaData().getDriverVersion());
            System.out.println("JDBC-version: " + conn.getMetaData().getJDBCMajorVersion() + "."
                    + conn.getMetaData().getJDBCMinorVersion());
            System.out.println();

            // ============================================================
            // Kontrollera anslutningsstatus
            // ============================================================

            if (!conn.isClosed()) {
                System.out.println("Anslutningen är öppen och redo att användas.");
            }

            selectAllGarments(conn);
            insertGarment(conn);

        } catch (SQLException e) {
            // ============================================================
            // Felhantering
            // ============================================================
            System.out.println("❌ Anslutning misslyckades!");
            System.out.println();
            System.out.println("Felmeddelande: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Felkod: " + e.getErrorCode());
            System.out.println();

            // ============================================================
            // Vanliga fel och lösningar
            // ============================================================
            System.out.println("=== Felsökning ===");
            System.out.println("Vanliga fel:");
            System.out.println("1. Communications link failure");
            System.out.println("   → MySQL-container körs inte. Kör: docker ps");
            System.out.println();
            System.out.println("2. Access denied for user");
            System.out.println("   → Fel användarnamn eller lösenord");
            System.out.println();
            System.out.println("3. Unknown database 'company_db'");
            System.out.println("   → Databasen finns inte. Kör demo_02_docker_init.sql");
            System.out.println();
            System.out.println("4. ClassNotFoundException: com.mysql.cj.jdbc.Driver");
            System.out.println("   → MySQL-dependency saknas i pom.xml. Kör: mvn clean install");
            System.out.println();

            // Skriv ut hela stack trace för debugging
            e.printStackTrace();
        }

        System.out.println("\n=== Exempel avslutat ===");
    }

    private static void insertGarment(Connection conn) throws SQLException {
        // SQL med platshållare (?)
        // Varje ? ersätts med ett värde via setString/setInt/etc.
        String sql = "INSERT INTO Garment (caption, purchased, washrecommendationid, color, comments) VALUES (?, ?, ?, ?, ?)";

        // try-with-resources stänger PreparedStatement automatiskt
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // ============================================================
            // Klädesplagg
            // ============================================================

            // pstmt.setString(index, value)
            // Index börjar på 1 (inte 0!)
            pstmt.setString(1, "SunTrip");
            pstmt.setString(2, LocalDateTime.now().toString());
            pstmt.setInt(3, 3);
            pstmt.setString(4, "Vit");
            pstmt.setString(5, "SunTrips trevliga tröja för bara 20 kronor");

            // executeUpdate() returnerar antal påverkade rader
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Infogade IT-avdelning: " + rowsAffected + " rad påverkad");
        }
    }

    private static void selectAllGarments(Connection conn) throws SQLException {
        String sql = "SELECT * FROM Garment";

        // PreparedStatement även för queries utan parametrar (god vana)
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // ResultSet är som en "iterator" över resultatet
            // rs.next() returnerar true om det finns fler rader
            while (rs.next()) {
                // Hämta kolumnvärden (kan använda index eller kolumnnamn)
                int id = rs.getInt("garmentId");           // eller rs.getInt(1)
                String caption = rs.getString("Caption");           // eller rs.getString(2)
                String purchased = rs.getString("Purchased");
                int washRecommendationID = rs.getInt("WashRecommendationID");
                String color = rs.getString("Color");

                System.out.printf("ID: %d | Caption: %-20s | Purchased: %-30s | WashRecommendationID: %d | Color: %-40s%n",
                        id, caption, purchased, washRecommendationID, color);
            }
        }
    }
}
