package JavaFoundation;

import java.awt.Canvas;

/*
  Variable ������, �� �ϳ��� ���� ������ �� �ִ� �޸� ������ �� �Ѵ�. 
   	�⺻���� �ۼ� 
   	int name = 0 ; 
   ����Ÿ�� �����̸� =  0 <- ��  
 */
public class Variable_2 {
	public static void main(String[] args) {
		
		// �⺻���� ������ �н� 
		
		/*
		 Variable ����
		  int a;
		  int b;
		  int x = 0;
		  int y = 0; 
		    |
		    v 
		 ���� ���� ��� ���� 
		 
		 */	
		
		int a, b; // ���� ���� 
		int x=10, y=5;
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
		System.out.println(x%y); 
		
		/*
		 ������ �ؽ�Ʈ ���� ����ϱ� 
		 + ��ȣ�� ������ ���� 
		  Spting "����� ���̴� ����Դϱ�?" +age 
		 */
		
		int DayNew = 2021; 
		int age = 30; 
		
		age+=1;
		System.out.println(age);
		
		System.out.println("����� ���̴� ����Դϱ�? "+"�� ���� ���̴�"+age+"�Դϴ�.");
		System.out.println("������ ��¥�� �����Դϱ�?" +" �����"+DayNew+"�Դϴ�.");
		
		/*
		 * ������ �⺻���� ���������� ������.  
		 * �⺻��( Primitive type )�� ũ�� 8���� ������ ���� �Ʒ��� ���� ���ȴ�. 
		 	$ ��(boolean)  
		 		�� �����ڷ� true�� false �� �ϳ��� ���� ������ �ַ� ���ǹ��� ���� ��� �ȴ�. _ 1byte �޸� ũ�� 8 bit      
		 	$ ������(byte, short, char, int, long) 
		 	  - �������� ���� �� �ִ� �������� ũ�⿡ ���� ����ڰ� ������ �ڷ��� ũ�⿡ �ش��ϴ� ������ �޸𸮿� �Ҵ�ȴ�. 
		 		byte _ 1byte / 8 bit
		 		char _ ���ڸ� ���� �� �ִ� �� 2byte / 16 bit 
		 		short _ 2byte / 16 bit
		 		int _  4byte / 32 bit  
		 		long _ 8byte / 64 bit
		 	$ �Ǽ�(float double)
		 		float _ 4byte / 32bit 
		 		double _ 8byte / 64bit 
		 
		 *������( Reference Type )
		 	
		 */
		// println �ȿ� ���� ����.SIZE ������ ������ ũ�⸦ Ȯ�� �� �� ���� 
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		
		
		// ���� �ǽ� 
			byte var1=1; 
			char text = 'k';
			short var2 = 12313; 
			int var3 = 100;
			long var4 = 10000000000000L;// 	��� �ۼ��Ϸ��� L �� �پ�� �Ѵ�. �׷��� ������ int �������� �ν��Ѵ�. 
		// �Ǽ� �� ����Ϸ��� �ڿ� f �� �־�� �Ѵ�. 
			float var5 = 0.2131f;
			double var6 = 0.2313135153d;
		
		// �� �� 
			char text2 = 'B';
			String text1 ="�ȳ��ϼ���! ���̿��� ����ؿ� ~ ";
			System.out.println(text1);
			System.out.println(text2);
			
		/*
		 * ����� ���ͳ�(constant & literal)
			 ���(constant)�� ������ ���������� ���� ������ �� �ִ� ����������, ������ �޸� �� �� ���� �����ϸ� �ٸ������� ���� �� �� ����. 
			 ����� ������ �����ϸ�, ���� ������ Ÿ�� �տ� Ű���� 'final'�� �ٿ��ֱ⸸ �ϸ� �ȴ�.  
		 */
		
		final int Max_speed = 10; // ��� Max_speed�� ����
		System.out.println(Max_speed);
		
		
		/*
		 * Ÿ�� ��ȯ ����(�����) Ÿ�� ��ȯ: Casting (�ٿ��ɽ���
		
		 */
		// �ڵ� Ÿ�� 
		byte byteValue1 = 10;
		int intValue = byteValue1;
		// ���� Ÿ��   �տ� () ���� �ȿ� ���� Ÿ�� ���� �ۼ��ϸ� �ȴ�.  
		int intVar = 101021020;
		byte bytevar = (byte) intVar;
		
		/*
		 * ����ȭ�� ��� printf()�� �����ڸ� ���� ������ ���� ���� ���� �������� ��ȯ�Ͽ� ����ϴ� ����� ������ �ִ�. 
		   System.out.printf("age: %d", 14);
		   ��� -> age : 14
		
		
		 ������  | ���� 
		 %b    : �Ҹ��� (boolean) �������� ��� 
		 %d    : 10�� (decimal) ������ �������� ���
		 %o    : 8�� (octal) ������ �������� ���
		 %x,%X : 16�� (hexa- decimal) ������ �������� ���
		 %f    : �ε� �Ҽ����� �������� ��� 
		 %e,%E : ���� ǥ���� �������� ��� 
		 %c    : ���ڷ� ��� 
		 %s    : ���ڿ��� ��� 
		  
		 */
		
	 }
}

