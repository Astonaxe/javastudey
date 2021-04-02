package sec07.exam02_field_initialize;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("홍길동","010-2222-3333"); // 객체를 만들고 매개 변수를 초기화 시켜준다. 
		System.out.println("k1.name = " + k1.name);
		System.out.println("k1.ssn = " +k1.ssn);
		
		Korean k2 = new Korean("반박자","930130-029139");
		System.out.println("k2.name = " +k2.name);
		System.out.println("k2.ssn = " +k2.ssn);
		
	}

}
