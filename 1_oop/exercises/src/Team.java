public class Team {
    private Player[] members;
    private int playerCount;

    public Team(int size) {
        members = new Player[size];
        playerCount = 0;
    }
    public Player[] getMembers() {
        return members;
    }

    public void addMember(Player player) {
        if (playerCount < members.length) {
            members[playerCount] = player;
            playerCount++;
        }
        else {
            System.out.println("Team is already full");
        }
    }
}
