package JavaFoundation;

public class Operator {

	public static void main(String[] args) {
		/*
		 * 연산을 수행하는 기호를 말한다. 예를 들어 '+','-' 등 수행하는 방식 
			연산자 / 피연산자 
			연산자 (operator) 연산을 수행하는 기호 (-,+,*)
			피연산자 (operand) 연산자의 작업 대상 (변수,상수,리터널)
			
		 */
		// 연산자 종류 
		int a = 1;
		int b = 3;
		int c = 5;
		// 산술연산 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b); // 나누셈에 나머지 
		System.out.println(a>>b);
		//비교연산
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b); // 이것은 거짓이다 부정문 ! 의미로 사용
		System.out.println(a^b); //  두 수가 달라야지 true
		//논리연산자
		System.out.println(a>b&&a<c);
		System.out.println(a>c||b<c);
	
		int pencils = 534; int students = 30;
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils/students);
			System.out.println(pencilsPerStudent); // 17
		// 남은 연필 수
		int pencilsLeft = ( pencils % students); 
		System.out.println(pencilsLeft); // 24
		

		int value = 356; 
		System.out.println(value - 56); // 300
		int x = 10; 
		int y = 5;
		System.out.println((x > 7) && (y <= 5)); 
		System.out.println((x % 3 == 2) || (y % 2 != 1)); // ( #2 )
		float lengthTop = 5.0f;
		float lengthBottom = 10.0f;
		float height = 7.0f;
		double area = ((lengthTop+lengthBottom)/2*height);
		System.out.println(area); // 52.5
		
		//증감 연산자 
		int result1 = ++x;
		int result2 = y++;
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
