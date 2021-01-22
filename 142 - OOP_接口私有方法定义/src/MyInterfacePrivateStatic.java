public interface MyInterfacePrivateStatic {
    public static void methodDefaultA() {
        System.out.println("默认方法A");
        methodDefaultCommand();
    }

    public static void methodDefaultB() {
        System.out.println("默认方法B");
        methodDefaultCommand();
    }

    private static void methodDefaultCommand() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
