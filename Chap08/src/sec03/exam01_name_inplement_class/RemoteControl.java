package sec03.exam01_name_inplement_class;

public interface RemoteControl {
	//��� 
	//�߻�޼ҵ� 
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
