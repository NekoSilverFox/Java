
/*
使用变量的注意事项：

1. 不能有重名变量
2. 对于 float 和 long 来说，字母后缀 F 和 L 不能丢掉
3. 如果使用byte或者short类型的变量，那么右侧的数据值不能超过类型允许的最大值
4. 变量一定要赋值后使用
5. 变量的使用不能超过作用域的范围
*/

public class Demo004VariableNotice {
	public static void main(String[] args) {

		int num1 = 1;
		System.out.println(num1);

		int num2;
		System.out.println(num2);	// Error


		int num2 = 1;		// Error


		System.out.println(num3);	// Error
		int num3 = 3;


		{
			int num4 = 4;
			System.out.println(num4);
		}
			System.out.println(num4);	// Error 超出作用域

		int num4;
		System.out.println(num4);	// OK

		// 一次性定义多个，并同时复制
		int a = 100, b = 200, c = 300;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}