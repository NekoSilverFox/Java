import java.util.ArrayList;

public class Task125RedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member mem_1 = new Member("A", 0);
        Member mem_2 = new Member("B", 0);
        Member mem_3 = new Member("C", 0);

        manager.showMoney();
        mem_1.showMoney();
        mem_2.showMoney();
        mem_3.showMoney();

        System.out.println("=====================");

        ArrayList<Integer> redList = manager.send(20, 3);
        mem_1.receive(redList);
        mem_3.receive(redList);
        mem_2.receive(redList);

        System.out.println("=====================");

        manager.showMoney();
        mem_1.showMoney();
        mem_2.showMoney();
        mem_3.showMoney();
    }
}
