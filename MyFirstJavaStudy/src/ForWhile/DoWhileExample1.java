package ForWhile;
import java.util.Scanner;


public class DoWhileExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ran= (int)(Math.random()*100)+1;
		int cnt = 0; // ������� ���ƴ��� Ȯ���ϴ� ���� 
		int inNum = 0; // sc.nextlnt () �� ���� �ֿܼ��� ���� �Է� �޾� �����ϴ� ����  
		
		
		do{
		 System.out.println("1���� 100���� ���ڸ� �Է��ϼ��� ");
		 inNum=sc.nextInt();
		 if(inNum > ran) {
			 System.out.println("�Է��Ͻ� ���� Ů�ϴ�.");
		 }else if(inNum <ran){
			 System.out.println("�Է��Ͻ� ���� �۽��ϴ�.");
		 }
		 cnt++;
		}while(ran != inNum );
		System.out.println(cnt+"���� ���ƽ��ϴ�.");
		sc.close();
	}

}
