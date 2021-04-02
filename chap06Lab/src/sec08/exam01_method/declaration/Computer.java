package sec08.exam01_method.declaration;

public class Computer {
	// 클래스의 구성 멤버 
	//1. 필드 
	//2. 생성자 
	//3. 메소드 
	
	int sum1(int[] values){
		int sum =0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		return sum; // 메소드 실행을 중지하고 리던 값 지정하 역할 
		
	}
	int sum2(int...values) {
		int sum = 0; 
		for(int i : values){
			sum += i;
		}
		return sum;
	}
	
}
