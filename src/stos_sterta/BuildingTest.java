package stos_sterta;

public class BuildingTest {
    public static void main(String[] args) {
        Door door1 = new Door(true, 80,200);
        Window window1 = new Window(false, 120,120);
        Door door2 = new Door(true, 80,200);
        Window window2 = new Window(false, 180,120);

        Room room1 = new Room(door1, window1);
        Room room2 = new Room(door2, window2);

        Building bulding = new Building(room1,room2);
        BuildingController control = new BuildingController();

        System.out.println(bulding.firstRoom.window.open);
        System.out.println(bulding.secondRoom.window.open);
        control.openWindows(bulding);
        System.out.println(bulding.firstRoom.window.open);
        System.out.println(bulding.secondRoom.window.open);
    }
}
