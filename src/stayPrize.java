public class stayPrize {
    public static boolean stayWin() {
        boolean[] doors = game.doors();
        int chooseDoor = game.chooseDoor();
        int openDoor = game.openDoor(doors, chooseDoor);
        return doors[chooseDoor];
    }
}
