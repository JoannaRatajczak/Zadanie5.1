public class Room {
    double temp;
    double meterage;
    boolean AC;

    void ACunit() {
        if (AC && temp > 18) {
            temp = temp - 1;
        }
    }

    public Room(double meterage, boolean AC) {
        this.meterage = meterage;
        this.AC = AC;
    }
}

