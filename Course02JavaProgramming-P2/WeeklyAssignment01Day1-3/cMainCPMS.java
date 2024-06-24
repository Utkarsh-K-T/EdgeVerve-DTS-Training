// Batsman interface
interface Batsman {
    void bat();
}

// Bowler interface
interface Bowler {
    void bowl();
}

// AllRounder class implementing both Batsman and Bowler interfaces
class AllRounder implements Batsman, Bowler {
    private String name;
    private int battingSkill;
    private int bowlingSkill;

    public AllRounder(String name, int battingSkill, int bowlingSkill) {
        this.name = name;
        this.battingSkill = battingSkill;
        this.bowlingSkill = bowlingSkill;
    }

    public String getName() {
        return name;
    }

    public int getBattingSkill() {
        return battingSkill;
    }

    public int getBowlingSkill() {
        return bowlingSkill;
    }

    @Override
    public void bat() {
        System.out.println(name + " is batting with a skill level of " + battingSkill);
    }

    @Override
    public void bowl() {
        System.out.println(name + " is bowling with a skill level of " + bowlingSkill);
    }
}

// Main class to test the implementation
public class cMainCPMS {
    public static void main(String[] args) {
        // Creating instances of AllRounder
        AllRounder player1 = new AllRounder("Player One", 85, 75);
        AllRounder player2 = new AllRounder("Player Two", 78, 82);

        // Displaying the actions performed by each player along with their properties
        System.out.println("Player: " + player1.getName());
        System.out.println("Batting Skill: " + player1.getBattingSkill());
        System.out.println("Bowling Skill: " + player1.getBowlingSkill());
        player1.bat();
        player1.bowl();

        System.out.println();

        System.out.println("Player: " + player2.getName());
        System.out.println("Batting Skill: " + player2.getBattingSkill());
        System.out.println("Bowling Skill: " + player2.getBowlingSkill());
        player2.bat();
        player2.bowl();
    }
}
