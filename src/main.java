public class main {
    /**
     * @description Used to test the Monty Hall problem.
     * The Monty Hall problem is a probability puzzle that goes like this:
     * You are on a game show. There are three doors. Behind one of the doors is a prize.
     * Behind the other two doors are nothing. You choose a door. The host, who knows
     * where the prize is, opens one of the other doors, revealing nothing. The host then
     * asks you if you want to switch your choice to the other door. Should you switch?
     * Main runs the game ten million times, and prints the results.
     * @param args
     */
    public static void main(String[] args) {
        int stayWins = 0;
        int switchWins = 0;
        int iterations = 10000000;
        for (int i = 0; i < iterations; i++) {
            if (stayPrize.stayWin()) {
                stayWins++;
            }
            if (switchPrize.switchWin()) {
                switchWins++;
            }
        }
        System.out.println("Stay win percentage: " + (double) stayWins / iterations * 100 + "%");
        System.out.println("Switch win percentage: " + (double) switchWins / iterations * 100 + "%");
    }
}