public class Keyboard implements USB {
    @Override
    public void powerON() {
        System.out.println("Open Keyboard");
    }

    @Override
    public void powerOFF() {
        System.out.println("Close Keyboard");
    }

    public void type() {
        System.out.println("Input.......");
    }
}
