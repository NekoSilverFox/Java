/*
常量：在程序运行期间，固定不变的量。

常量的分类：
1. 字符串常量：凡是用双引号引起来的部分，叫做字符串常量。例如："abc"、"Hello"、"123"
2. 整数常量：直接写上的数字，没有小数点。例如：100、200、0、-250
3. 浮点数常量：直接写上的数字，有小数点。例如：2.5、-3.14、0.0
4. 字符常量：凡是用单引号引起来的单个字符，就做字符常量。例如：'A'、'b'、'9'、'中'
5. 布尔常量：只有量中取值。true、false。
6. 空常量：null。代表没有任何数据。
*/

public class DamoConst {
	public static void main(String[] args) {
		// 字符串常量
		System.out.println("Print Const String");
		System.out.println("");
		System.out.println("==================");

		// 整数常量
		System.out.println(30);
		System.out.println(-268);

		// 浮点数常量（小数）
		System.out.println(246.1560);
		System.out.println(0.52486);

		// 字符常量（只能有单个字符）
		System.out.println('A');
		System.out.println('&');

		// 布尔常量
		System.out.println(true);
		System.out.println(false);

		// 空常量，不能直接用来打印输出！！
		// System.out.println(null);

	}
}