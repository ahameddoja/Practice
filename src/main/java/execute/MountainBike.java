package execute;

public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newHeight) {
        seatHeight = newHeight;
    }

    public void printData() {
        super.showData();
        System.out.println("Seat height is: " + seatHeight);
    }

    public void showData() {
        System.out.println("Seat height is: " + seatHeight);
    }

}
