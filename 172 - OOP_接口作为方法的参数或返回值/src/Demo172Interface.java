import java.util.ArrayList;
import java.util.List;
// 172 - OOP_接口作为方法的参数或返回值
public class Demo172Interface {
    public static void main(String[] args) {
        // 左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("Nick");
        list.add("Wilde");
        list.add("Juddy");

        return list;
    }
}
