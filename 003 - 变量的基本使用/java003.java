public class java003 {
	public static void main (String[] args)
	{
		// 创建一个变量
		// 格式： 数据类型 变量名
		// int - 1 Byte
		int i_num;
		i_num = 1;
		System.out.println(i_num);

		i_num = 10;
		System.out.println(i_num);

		int i_num2 = 20;
		System.out.println(i_num2);


		// Byte 占用一字节 [-128, 127]
		byte b_num = 127;
		// byte b_num = 400; 超出了作用范围错误！！
		System.out.println(b_num);


		// short 占用2字节 [-32768, 32767]
		short s_num = 50;
		System.out.println(b_num);


		// long - 8 Byte
		// 如果是long类型，要在后面加一个L，大小写都可以
		long l_num = 3000000000L;
		System.out.println(l_num);


		// float - 4 Byte
		// 如果是float类型，要在后面加一个F，大小写都可以
		float f_num = 23.3F;
		System.out.println(f_num);


		// double - 8 Byte
		double d_num = 234.23432;
		System.out.println(d_num);


		// char - 2 Byte
		// Java 中 char 类型占用两个字节，所以可以显示中文
		char c_char = '国', c_char2 = 'П';
		System.out.println(c_char);
		System.out.println(c_char2);


		// boolean - 1 Byte
		boolean b_bool = true;
		// boolean b_bool2 = 4; 错误，Java中的boolean只能是 true 或者 false
		System.out.println(b_bool);

	}
}