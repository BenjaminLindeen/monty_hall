public class stayPrize {
    /**
     * @description Returns true if the player wins by staying with their first choice.
     * @return boolean stayWin
     */
    public static boolean stayWin() {
        boolean[] doors = game.doors();
        int chooseDoor = game.chooseDoor();
        boolean door1 = doors[0];
        boolean door2 = doors[1];
        boolean door3 = doors[2];

        if (chooseDoor == 0 && door1) {
            return true;
        } else if (chooseDoor == 1 && door2) {
            return true;
        } else if (chooseDoor == 2 && door3) {
            return true;
        } else {
            return false;
        }
    }
}