public class Test {
    public static void main(String[] args) {
        Room room1 = new Room(20, 25.8, true);
        Room room2 = new Room(13, 89, false);
        Room room3 = new Room(23, 89, false);
        Room room4 = new Room(13, 89, true);


        System.out.println("pokój nr 1: temp. poczatkowa="+room1.temp);
        room1.ACunit();
        room1.ACunit();
        System.out.println("po dwukrotnym wywołaniu metody="+room1.temp);

        System.out.println("pokój nr 2: temp. poczatkowa="+room2.temp);
        room1.ACunit();
        room1.ACunit();
        System.out.println("po dwukrotnym wywołaniu metody="+room2.temp);

        System.out.println("pokój nr 3: temp. poczatkowa="+room3.temp);
        room1.ACunit();
        room1.ACunit();
        System.out.println("po dwukrotnym wywołaniu metody="+room3.temp);

        System.out.println("pokój nr 4: temp. poczatkowa="+room4.temp);
        room1.ACunit();
        room1.ACunit();
        System.out.println("po dwukrotnym wywołaniu metody="+room4.temp);



    }
}
