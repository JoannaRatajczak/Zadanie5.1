public class Room {
    double temp;
    double meterage;
    boolean AC;

    boolean ACunit() {
        if (AC && temp > 18) {
            temp = temp - 1;
            return true;
        }
        else return false;

    }

    public Room(double temp, double meterage, boolean AC) {
        this.temp = temp;
        this.meterage = meterage;
        this.AC = AC;
    }
}

