/**
 * class prizeBool
 * chooses from the prize object for the monty hall problem.
 */

public class prizeBool {
    /**
     * chooses from the prize object for the monty hall problem.
     */
    public static void main(String[] args) {
        if (Math.random() < 0.5) {
            prize.whichPrize = true;
        }
        else {
            prize.whichPrize = false;
        }
    }
}