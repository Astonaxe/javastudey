package sec07.exam03_constructor_overloading;

public class Car {
	String company ="현대자동차";
	String model ;
	String color;
	int maxSpeed;
	
	// 기본 생성자 
	Car(){
		
	}
	// 생성자오버로딩 
	Car(String model){
		this.model =model;
		
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
		
		
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		
	}
	
}
