public class Bowler {
    // Instance variables
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    // Default constructor
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method to compute bowling average
    public void computeBowlingAverage() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.out.println("Error");
            return;
        }
        if ((runsConceded > 0 || ballsBowled > 0) && matches == 0) {
            System.out.println("Error");
            return;
        }
        double bowlingAvg = (double) runsConceded / wickets;
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + bowlingAvg);
    }

    // Method to show statistics
    public void showStatistics() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.out.println("Error");
            return;
        }
        if ((runsConceded > 0 || ballsBowled > 0) && matches == 0) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + ballsBowled);
        System.out.println("runs_conceded=" + runsConceded);
    }

    // Method to compute strike rate
    public void computeStrikeRate() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.out.println("Error");
            return;
        }
        if ((runsConceded > 0 || ballsBowled > 0) && matches == 0) {
            System.out.println("Error");
            return;
        }
        double strikeRate = (double) runsConceded / ballsBowled;
        System.out.println("Name: " + name);
        System.out.println("Strike_rate=" + strikeRate);
    }

    public static void main(String[] args) {
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);
        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
    }
}