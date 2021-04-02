package sec07.exam02_field_initialize;

public class Korean {
	// 필드 
	String nation = "대한민국" ; 
	String name; 
	String ssn; 
	
	// 생성자 
	/*
	public Korean(String n, String s){
		name = n; 
		ssn = s; 
		
		
	}
	*/
	
	
	// Overloading vs Overriding
	//	1. Overloading : 생성자 이름은 같지만 매개 변수가 다르기 때문에 생성자 오버로딩이라 한다.같은 이름으로 여러 개을 선언 
	//	2. Overriding : 재정의 
	public Korean(String name, String ssn){
		this.name = name; 
		this.ssn = ssn;  // 기본적으로 이렇게 쓴다.  자신의 생성자를 호출한다. 
		
		
		
	}

}
