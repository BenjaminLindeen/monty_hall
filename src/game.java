import java.util.Random;

public class game {
    private static final Random random = new Random();
    public static boolean[] doors() {
        boolean[] doors = {false, false, false};
        doors[random.nextInt(3)] = true;
        return doors;
    }

    public static int chooseDoor(boolean[] doors) {
        return random.nextInt(3);
    }

    public static int openDoor(boolean[] doors, int chooseDoor) {
        if (chooseDoor == 0) {
            return random.nextInt(2) + 1;
        } else if (chooseDoor == 1) {
            int rand = random.nextInt(2);
            return (rand == 0) ? 0 : 2;
        } else if (chooseDoor == 2) {
            return random.nextInt(2);
        }
        return - 1;
    }
}