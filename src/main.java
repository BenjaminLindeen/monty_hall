public class Main {
    public static void main(String[] args) {
        int stayWins = 0;
        int switchWins = 0;
        int iterations = 1000000;
        for (int i = 0; i < iterations; i++) {
            if (stayPrize.stayWin()) {
                stayWins++;
            }
            if (switchPrize.switchWin()) {
                switchWins++;
            }
        }
        System.out.println("Stay wins: " + stayWins);
        System.out.println("Switch wins: " + switchWins);
        System.out.println("Stay win percentage: " + (double) stayWins / iterations * 100 + "%");
        System.out.println("Switch win percentage: " + (double) switchWins / iterations * 100 + "%");
    }
}