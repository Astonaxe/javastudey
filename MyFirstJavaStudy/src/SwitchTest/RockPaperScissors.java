package SwitchTest;
import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
		Scanner scanner = new Scanner (System.in);
		int user = scanner.nextInt();
		
		Random random = new Random();
		
		int com = random.nextInt(3);
		
		System.out.println("�����"+user+"�Դϴ�.");
		System.out.println("��ǻ��"+(com+1)+"�Դϴ�.");
		
		switch(user-(com+1)) {    
			case 2: case -1:  // ��3 -1���� = 2 / ���� 2 - 3 �� = -1 
				System.out.println("��ǻ�Ͱ� �̰���ϴ�. ����� �����ϴ�.");
				break;
			case 1: case -2: // ��3 -2 ���� = 1 / ���� 1 - 3 �� = -2 	 
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0: 
				System.out.println("�����ϴ�.");
			
			 
			
		
		}
		


	}

}
