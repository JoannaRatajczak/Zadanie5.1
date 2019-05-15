import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(25.8, true);
        Room room2 = new Room(89, false);

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj temperaturę w pokoju 1");
        room1.temp = scan.nextDouble();
        room1.ACunit();

        if (room1.temp > 18 && room1.AC)
            System.out.println("AC obniżyło temperatu do " + room1.temp + "stopni.");
        else System.out.println("Temperatur w pokoju jest równa " + room1.temp);

        System.out.println("Podaj temperaturę w pokoju 2");
        room2.temp = scan.nextDouble();
        room2.ACunit();

        if (room1.temp > 18 && room1.AC)
            System.out.println("AC obniżyło temperatu do " + room2.temp + "stopni.");
        else System.out.println("Temperatur w pokoju jest równa " + room2.temp);


    }
}
