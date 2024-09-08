public class GameEntry {
    private String name;    // name of the person earning the score
    private int score;      // the score value

    /* Constructor for a game entry with given parameters. */
    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    /* Return the name Field when called. */
    public String getName() { return name; }

    /* Return the score Field when called. */
    public int getScore() { return score; }

    /* Return a string representation of this entry by method overriding. */
    public String toString() {
        return "(" + name + ", " + score + ")";
    }

    // Test
    public static void main(String[] args) {
        GameEntry entry = new GameEntry("John", 100);
        System.out.println(entry.getName());  // prints: John
        System.out.println(entry.getScore()); // prints: 100
        System.out.println(entry); // prints: (John, 100)
    }
}






