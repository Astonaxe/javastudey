package JavaFoundation;
import java.util.*;

public class IfSeitch {

	public static void main(String[] args) {
		/*
		 * ���ǹ� if / switch
		 	������ ���� ���α׷��� �����ϰų� ������ �� �ִ�. 
		 */
		// If ���ǹ� ��� 
		int bus = 10; 
		float BusSpeed = 51.31f;
		int motocycle =1;
		
		if(BusSpeed > 60) {
			
		 System.out.println("�����ϼ̽��ϴ�.");
		 
			
		}else if(BusSpeed >=50 && BusSpeed <= 60){ // ���� ��� ���� �� ���ǽ� 2  
			System.out.println("���");
			
		}else if(motocycle>0){
			System.out.println("������̴� �����Ͻ� �� �����ϴ�.");
		}
		else{  //������ 
			System.out.println("����� 500���Դϴ�. ");
		}
		
		/*
		 *Switch���� �������� 
		 *�ڹ�6������ switch���� ��ȣ���� ���� Ÿ��(byte, char, short, int, long) ������ �������� �����ϴ� ����ĸ� �� �� �־���. �ڹ�7���ʹ� String Ÿ���� ������ �� �� �ִ�.
 
		 */
		
		
	}

}
