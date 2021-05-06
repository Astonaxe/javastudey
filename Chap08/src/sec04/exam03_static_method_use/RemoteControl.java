package sec04.exam03_static_method_use;

public interface RemoteControl {
	
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}

}
