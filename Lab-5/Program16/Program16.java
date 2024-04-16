// WAP in Java to implement Single Inheritence (area of a floor -> volume of a room)

public class Program16 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        double l = Double.parseDouble(ui.input("Enter length: "));
        double b = Double.parseDouble(ui.input("Enter breadth: "));
        double h = Double.parseDouble(ui.input("Enter heigth: "));
        RoomVolume r1 = new RoomVolume(l, b, h);
        System.out.println("Volume of the room: " + r1.getVolume());
    }
}
