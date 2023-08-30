public class switchPrize {
    public static boolean switchWin() {
        boolean[] doors = game.doors();
        int chooseDoor = game.chooseDoor();
        int openDoor = game.openDoor(doors, chooseDoor);
        if (openDoor == 0) {
            chooseDoor = (chooseDoor == 1) ? 2 : 1;
        } else if (openDoor == 1) {
            chooseDoor = (chooseDoor == 0) ? 2 : 0;
        } else if (openDoor == 2) {
            chooseDoor = (chooseDoor == 0) ? 1 : 0;
        }
        return doors[chooseDoor];
    }
}
