/*
赋值运算符分为：

基本赋值运算符：就是一个等号“=”，代表将右侧的数据交给左侧的变量。
	int a = 30;

复合赋值运算符：
	+=		a += 3		相当于		a = a + 3
	-=		b -= 4		相当于		b = b - 4
	*=		c *= 5		相当于		c = c * 5
	/=		d /= 6		相当于		d = d / 6
	%=		e %= 7		相当于		e = e % 7

注意事项：
	1. 只有变量才能使用赋值运算符，常量不能进行赋值。
	2. 复合赋值运算符其中隐含了一个强制类型转换。
*/

public class Demo010Operator {
    public static void main(String[] args) {

        int a = 5;
        a += 5;
        System.out.println(a); // 10

        a %= 3;
        System.out.println(a); // 1

        // =========================================
        // 复合赋值运算符其中隐含了一个强制类型转换。
        byte b = 30;
        b += 5;
        // byte = byte + int
        // byte = int + int
        // byte = int
        // 编译器自动进行了强制类型转换
        // byte = (byte)int
        System.out.println(b); // 35
    }
}
