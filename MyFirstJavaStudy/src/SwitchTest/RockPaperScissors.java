package SwitchTest;
import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		Scanner scanner = new Scanner (System.in);
		int user = scanner.nextInt();
		
		Random random = new Random();
		
		int com = random.nextInt(3);
		
		System.out.println("당신은"+user+"입니다.");
		System.out.println("컴퓨터"+(com+1)+"입니다.");
		
		switch(user-(com+1)) {    
			case 2: case -1:  // 보3 -1가위 = 2 / 바위 2 - 3 보 = -1 
				System.out.println("컴퓨터가 이겼습니다. 당신이 졌습니다.");
				break;
			case 1: case -2: // 보3 -2 바위 = 1 / 가위 1 - 3 보 = -2 	 
				System.out.println("당신이 이겼습니다.");
				break;
			case 0: 
				System.out.println("비겼습니다.");
			
			 
			
		
		}
		


	}

}
