public class Task161LaptopUSB {
    public static void main(String[] args) {
        // 创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerON();

        // 准备鼠标
//        Mouse mouse = new Mouse();

        // 首先进行向上转型
        USB usbMouse = new Mouse();
        // 参数是usb类型
        computer.useUSB(usbMouse);

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard();
        // 方法是USB类型，传递进去的是实现类对象
        computer.useUSB(keyboard);// 正确写法，进行了向上转型
        computer.useUSB(new Keyboard()); // 正确写法，使用了匿名对象

        computer.powerOFF();
    }
}
