package ForWhile;
import java.util.Scanner;


public class DoWhileExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ran= (int)(Math.random()*100)+1;
		int cnt = 0; // 몇번만에 맞쳤는지 확인하는 변수 
		int inNum = 0; // sc.nextlnt () 를 통해 콘솔에서 값을 입력 받아 저장하는 변수  
		
		
		do{
		 System.out.println("1부터 100사이 숫자를 입력하세요 ");
		 inNum=sc.nextInt();
		 if(inNum > ran) {
			 System.out.println("입력하신 값이 큽니다.");
		 }else if(inNum <ran){
			 System.out.println("입력하신 값이 작습니다.");
		 }
		 cnt++;
		}while(ran != inNum );
		System.out.println(cnt+"번에 맞쳤습니다.");
		sc.close();
	}

}
