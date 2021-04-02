package Enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today=Week.SUNDAY;
		
		//Enum.name(): 열거 형 상수의 이름을 반환다. 
		String name = today.name();
		System.out.println(name);
		
		//Enun.ordinal() : 열거형 상수의 순서를 반환한다. 
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 =day1.compareTo(day2);
		int result2 =day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
	}	
	
}


