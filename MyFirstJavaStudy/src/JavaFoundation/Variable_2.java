package JavaFoundation;

import java.awt.Canvas;

/*
  Variable 변수란, 단 하나의 갑을 저장할 수 있는 메모리 공간을 말 한다. 
   	기본적인 작성 
   	int name = 0 ; 
   변수타입 변수이름 =  0 <- 값  
 */
public class Variable_2 {
	public static void main(String[] args) {
		
		// 기본적인 연산자 학습 
		
		/*
		 Variable 변수
		  int a;
		  int b;
		  int x = 0;
		  int y = 0; 
		    |
		    v 
		 변수 간략 사용 가능 
		 
		 */	
		
		int a, b; // 지역 변수 
		int x=10, y=5;
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
		System.out.println(x%y); 
		
		/*
		 변수와 텍스트 같이 사용하기 
		 + 기호를 넣으면 가능 
		  Spting "당신의 나이는 몇살입니까?" +age 
		 */
		
		int DayNew = 2021; 
		int age = 30; 
		
		age+=1;
		System.out.println(age);
		
		System.out.println("당신의 나이는 몇살입니까? "+"제 현재 나이는"+age+"입니다.");
		System.out.println("오늘의 날짜는 몇일입니까?" +" 현재는"+DayNew+"입니다.");
		
		/*
		 * 변수는 기본형과 참조형으로 나눈다.  
		 * 기본형( Primitive type )은 크게 8개로 나누어 지며 아래와 같이 사용된다. 
		 	$ 논리(boolean)  
		 		논리 연산자로 true와 false 중 하나의 값을 가지면 주로 조건문과 같이 사용 된다. _ 1byte 메모리 크기 8 bit      
		 	$ 정수형(byte, short, char, int, long) 
		 	  - 정수만을 담을 수 있는 공간으로 크기에 따라 사용자가 선언한 자료의 크기에 해당하는 공간이 메모리에 할당된다. 
		 		byte _ 1byte / 8 bit
		 		char _ 문자를 담을 수 있는 변 2byte / 16 bit 
		 		short _ 2byte / 16 bit
		 		int _  4byte / 32 bit  
		 		long _ 8byte / 64 bit
		 	$ 실수(float double)
		 		float _ 4byte / 32bit 
		 		double _ 8byte / 64bit 
		 
		 *참조형( Reference Type )
		 	
		 */
		// println 안에 변수 종류.SIZE 넣으며 변수의 크기를 확인 할 수 있음 
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		
		
		// 정수 실습 
			byte var1=1; 
			char text = 'k';
			short var2 = 12313; 
			int var3 = 100;
			long var4 = 10000000000000L;// 	길게 작성하려면 L 을 붙어야 한다. 그렇지 않으면 int 형식으로 인식한다. 
		// 실수 를 사용하려면 뒤에 f 를 넣어야 한다. 
			float var5 = 0.2131f;
			double var6 = 0.2313135153d;
		
		// 그 외 
			char text2 = 'B';
			String text1 ="안녕하세요! 뚱이에요 사랑해요 ~ ";
			System.out.println(text1);
			System.out.println(text2);
			
		/*
		 * 상수와 리터널(constant & literal)
			 상수(constant)는 변수와 마찬가지로 값을 저장할 수 있는 공간이지만, 변수와 달리 한 번 값을 저장하면 다른값으로 변강 할 수 없다. 
			 상수는 변수와 동일하며, 단지 변수의 타입 앞에 키워드 'final'을 붙여주기만 하면 된다.  
		 */
		
		final int Max_speed = 10; // 상수 Max_speed를 선언
		System.out.println(Max_speed);
		
		
		/*
		 * 타입 변환 강제(명시적) 타입 변환: Casting (다운케스팅
		
		 */
		// 자동 타입 
		byte byteValue1 = 10;
		int intValue = byteValue1;
		// 강제 타입   앞에 () 가로 안에 낮은 타입 명을 작성하면 된다.  
		int intVar = 101021020;
		byte bytevar = (byte) intVar;
		
		/*
		 * 형식화된 출력 printf()는 지시자를 통해 변수의 값을 여러 가지 혈식으로 변환하여 출력하는 기능을 가지고 있다. 
		   System.out.printf("age: %d", 14);
		   결과 -> age : 14
		
		
		 지시자  | 설명 
		 %b    : 불리언 (boolean) 형식으로 출력 
		 %d    : 10진 (decimal) 정수의 형식으로 출력
		 %o    : 8진 (octal) 정수의 형식으로 출력
		 %x,%X : 16진 (hexa- decimal) 정수의 형식으로 출력
		 %f    : 부동 소수점의 형식으로 출력 
		 %e,%E : 지수 표식의 형식으로 출력 
		 %c    : 문자로 출력 
		 %s    : 문자열로 출력 
		  
		 */
		
	 }
}

