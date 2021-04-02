package sec07.exam04_other_constructor;

public class Car {
	String company ="현대자동차";
	String model ;
	String color;
	int maxSpeed;
	
	// 기본 생성자 
	Car(){
		
	}
	// 생성자오버로딩 
	// this.()다른 
	// this(): 자신의 생성자를 호출한다.
	
	Car(String model){
		//this.model =model;
		this(model, null, 0);
	}
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, null, 0);
		
	}
	Car(String model, String color, int maxSpeed){
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = maxSpeed;

		
	}
	
}
