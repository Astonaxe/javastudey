package sec07.exam04_other_constructor;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("Car.company");
		
		Car car2 = new Car("�ڰ���");
		System.out.println(car2.model);
		
		Car car3 = new Car("�׽���","");
	}

}
