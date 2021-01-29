import java.security.Key;

public class Computer {
    public void powerON() {
        System.out.println("笔记本开机");
    }

    public void powerOFF() {
        System.out.println("笔记本关机");
    }

    // 使用USB设备的方法，使用接口作为方法
    public void useUSB(USB usb) {
        usb.powerON(); // 打开设备

        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb; //向下转型
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = new Keyboard();  //向下转型
            keyboard.type();
        }

        usb.powerOFF(); // 关闭设备
    }
}
