package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("Car.company");
		
		Car car2 = new Car("�ڰ���");
		System.out.println(car2.model);
		
		Car car3 = new Car("�׽���","");
	}

}
