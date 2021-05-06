package sec02.exam03_abstract_method;

public interface RemoteControl {
	//상수 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 10;
	
	//추상메소드 
	void turnOff();
	void setVolume(int volumne);

}
