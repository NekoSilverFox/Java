public class Demo034Break {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            if (i == 100) {
                System.out.println("BREAK");
                break;
            }
        }
    }
}
