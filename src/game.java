import java.util.Random;

public class game {
    /**
     * @return boolean[] doors
     * @description Returns an array of three doors, one of which is true.
     * true = prize, false = no prize
     */
    private static final Random random = new Random();
    public static boolean[] doors() {
        boolean[] doors = {false, false, false};
        doors[random.nextInt(3)] = true;
        return doors;
    }

    /**
     * @return int chooseDoor
     * @description Returns a random number between 0 and 2.
     * 0 = door 1, 1 = door 2, 2 = door 3
     */
    public static int chooseDoor() {
        return random.nextInt(3);
    }

    public static int openDoor(boolean[] doors, int chooseDoor) {
        boolean[] gameDoors = doors;
        int openDoor = chooseDoor;


    }
}