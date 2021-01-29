public class Mouse implements USB {
    @Override
    public void powerON() {
        System.out.println("Open Mouse");
    }

    @Override
    public void powerOFF() {
        System.out.println("Close Mouse");
    }

    public void click() {
        System.out.println("Click!!!!");
    }
}
