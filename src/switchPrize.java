public class switchPrize {
    /**
     * @description Returns true if the player wins by switching to another door.
     * @return boolean switchWin
     */
    public static boolean switchWin() {
        boolean[] doors = game.doors();
        int chooseDoor = game.chooseDoor();
        boolean door1 = doors[0];
        boolean door2 = doors[1];
        boolean door3 = doors[2];

        if (chooseDoor == 0 && door1) {
            return false;
        } else if (chooseDoor == 1 && door2) {
            return false;
        } else if (chooseDoor == 2 && door3) {
            return false;
        } else {
            return true;
        }
    }
}