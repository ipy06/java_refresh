public class ScoreBoard {
    private int numEntries = 0;     // number of entries
    private GameEntry[] board;      // array of game entries (names & scores)

    /* Constructs an empty scoreboard with the given capacity for storing entries. */
    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry element) {
        int newScore  = element.getScore();

        // check if the score is a new high score before adding to the Scoreboard
        // if full else just add the number to the score board
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            
            // If there are still empty fields, shift the indexer 1 to the right
            if (numEntries < board.length) { numEntries++; }

            // Set to the variable j or indexer to the last element of the Scoreboard
            int j = numEntries - 1;

            // Shift the elements to the right while sorting
            while (j > 0 && board[j -1].getScore() < newScore) {
                board[j] = board[j -1];
                j--;
            }

            // enter the new score
            board[j] = element; 
        }
    }

    public GameEntry remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid Index: " + index);
        }
        GameEntry temp = board[index];      // save the object to be removed
        for (int j = index; j < numEntries - 1; j++) // count up fron the index to be removed
            board[j] = board[j + 1];          // move one cell to the left
        board[numEntries - 1] = null;       // null out the old last score 
        numEntries--;       
        return temp;    // return the removed object
    }
}
