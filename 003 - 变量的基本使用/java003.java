public class java003 {
	public static void main (String[] args)
	{
		// ����һ������
		// ��ʽ�� �������� ������
		// int - 1 Byte
		int i_num;
		i_num = 1;
		System.out.println(i_num);

		i_num = 10;
		System.out.println(i_num);

		int i_num2 = 20;
		System.out.println(i_num2);


		// Byte ռ��һ�ֽ� [-128, 127]
		byte b_num = 127;
		// byte b_num = 400; ���������÷�Χ���󣡣�
		System.out.println(b_num);


		// short ռ��2�ֽ� [-32768, 32767]
		short s_num = 50;
		System.out.println(b_num);


		// long - 8 Byte
		// �����long���ͣ�Ҫ�ں����һ��L����Сд������
		long l_num = 3000000000L;
		System.out.println(l_num);


		// float - 4 Byte
		// �����float���ͣ�Ҫ�ں����һ��F����Сд������
		float f_num = 23.3F;
		System.out.println(f_num);


		// double - 8 Byte
		double d_num = 234.23432;
		System.out.println(d_num);


		// char - 2 Byte
		// Java �� char ����ռ�������ֽڣ����Կ�����ʾ����
		char c_char = '��', c_char2 = '��';
		System.out.println(c_char);
		System.out.println(c_char2);


		// boolean - 1 Byte
		boolean b_bool = true;
		// boolean b_bool2 = 4; ����Java�е�booleanֻ���� true ���� false
		System.out.println(b_bool);

	}
}