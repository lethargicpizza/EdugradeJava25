import java.util.Scanner;

public class Loopar  {
        public static void main(String[] args) {

            // Uppgift 1.1
            for (int i=0; i<11; i++) {
                System.out.println(i);
            }

            System.out.println("-------");
            // Uppgift 1.2
            int summa = 0;
            for (int i=1; i<=100; i++) {
                summa  +=i;

            }
            System.out.println(summa);

            System.out.println("-------");
            // Uppgift 1.3
            int produkt = 1, tabell = 5;
            for (int i=1; i<=10; i++) {
                produkt = i* tabell;
                System.out.println(i + " * " + tabell + " = " + produkt);
            }

            System.out.println("-------");
            // Uppgift 2.1

            int tal = 0;
            while (tal <= 20) {
                System.out.println(tal);
                tal += 2;
            }

            System.out.println("-------");
            // Uppgift 2.2

            int correctInt = 52;
            boolean correct = false;

            Scanner scanner = new Scanner(System.in);

            while (!correct) {

                System.out.print("Ange ett heltal: ");
                int guess = scanner.nextInt();
                correct = guess == correctInt;

                System.out.println("Gissning: " + guess);

                if (guess > correctInt) {
                    System.out.println("För stort!");
                }
                else if (guess < correctInt) {
                    System.out.println("För litet!");
                }
                else  {
                    System.out.println("Korrekt!");
                    correct = true;
                }
            }


            System.out.println("-------");
            // Uppgift 3.1
            int uppgift31 = 0;
            do {
                System.out.print("Ett tal tack: ");
                uppgift31 = scanner.nextInt();
            } while (uppgift31 >= 0 );

            System.out.println("-------");
            // Uppgift 3.2
            int choice = 5;
            do {


                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("0. Quit");



                System.out.print("Välj: ");
                switch (choice) {
                    case 0: System.out.println("Hejdå!"); break;
                    case 1: System.out.println("Du har valt addition"); break;
                    case 2: System.out.println("Du har valt subtraktion"); break;
                    case 3: System.out.println("Du har valt multiplikation"); break;
                    case 4: System.out.println("Du har valt division"); break;
                }
                choice = scanner.nextInt();
            } while (choice != 0 );
        }
}
