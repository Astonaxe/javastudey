package JavaFoundation;
import java.util.*;

public class IfSeitch {

	public static void main(String[] args) {
		/*
		 * 조건문 if / switch
		 	조건의 따라 프로그램을 실행하거나 변경할 수 있다. 
		 */
		// If 조건문 사용 
		int bus = 10; 
		float BusSpeed = 51.31f;
		int motocycle =1;
		
		if(BusSpeed > 60) {
			
		 System.out.println("과속하셨습니다.");
		 
			
		}else if(BusSpeed >=50 && BusSpeed <= 60){ // 또한 라는 조건 즉 조건식 2  
			System.out.println("통과");
			
		}else if(motocycle>0){
			System.out.println("오토바이는 진입하실 수 없습니다.");
		}
		else{  //하지만 
			System.out.println("요금은 500원입니다. ");
		}
		
		/*
		 *Switch문의 제약조건 
		 *자바6까지는 switch문의 괄호에는 정수 타입(byte, char, short, int, long) 변수나 정수값을 산출하는 연산식만 올 수 있었다. 자바7부터는 String 타입의 변수도 올 수 있다.
 
		 */
		
		
	}

}
