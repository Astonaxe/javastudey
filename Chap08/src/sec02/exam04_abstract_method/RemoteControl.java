package sec02.exam04_abstract_method;

public interface RemoteControl {
	//��� 
	//�߻�޼ҵ� 
	abstract void turnOn();
	void turnOff();
	void setVolume();
	//����Ʈ�޼ҵ� 
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("����ó���մϴ�.");
			
		}else {
			System.out.println("���������մϴ�.");
			
		}
	}
	//���� �޼ҵ� 
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");

	}
	
}
