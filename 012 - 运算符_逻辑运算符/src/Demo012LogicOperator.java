// 012 - 运算符_逻辑运算符

/*
与（并且）	&&	全都是true，才是true；否则就是false
或（或者）	||	至少一个是true，就是true；全都是false，才是false
非（取反）	!	本来是true，变成false；本来是false，变成true

与“&&”，或“||”，具有短路效果：如果根据左边已经可以判断得到最终结果，那么右边的代码将不再执行，从而节省一定的性能。

注意事项：
    1. 逻辑运算符只能用于boolean值。
    2. 与、或需要左右各自有一个boolean值，但是取反只要有唯一的一个boolean值即可。
    3. 与、或两种运算符，如果有多个条件，可以连续写。
    两个条件：条件A && 条件B
    多个条件：条件A && 条件B && 条件C

TIPS：
    对于1 < x < 3的情况，应该拆成两个部分，然后使用与运算符连接起来：
    int x = 2;
    1 < x && x < 3
*/

public class Demo012LogicOperator {
    public static void main(String[] args) {
        System.out.println(true && false); // false
        // true && true --> true
        System.out.println(3 < 4 && 10 > 5); // true
        System.out.println("============");

        System.out.println(true || false); // true
        System.out.println(true || true); // true
        System.out.println(false || false); // false
        System.out.println("============");

        System.out.println(true); // true
        System.out.println(!true); // false
        System.out.println("============");

        int a = 10;
        // false && ...                                              重点！！！
        System.out.println(3 > 4 && ++a < 100); // false
        System.out.println(a); // 10
        System.out.println("============");

        int b = 20;
        // true || ...
        System.out.println(3 < 4 || ++b < 100); // true
        System.out.println(b); // 20
    }
}
