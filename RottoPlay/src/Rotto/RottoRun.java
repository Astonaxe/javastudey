package Rotto;
import java.util.*;


public class RottoRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RottoPlay Play= new RottoPlay();
		Scanner sc = new Scanner(System.in);
		boolean play = true;
		int money = 0;
		int Moneyimport =0;
		int Reter = 0;
		
		while(play) {
			System.out.println(" ********** �ູ�� �ζ� �ڵ� ��±� **********");
			System.out.println("-------------------------------------------");
			System.out.println("  1.�Ա� | 2.��� | 3.�ܰ� | 4.�ζ���� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("�����ϱ� > ");
			
			int choice = sc.nextInt();
			
			switch(choice){
			
			case 1: 
				System.out.print("���ݾ� : ");
				Moneyimport =sc.nextInt();
				money=money+Moneyimport;
				System.out.println("�����ܰ�� : "+money+"��");
				break;
			
			case 2: 
				System.out.print("��ݾ� : ");
				Reter = sc.nextInt();
				
				if(money>Reter){
				System.out.println("��ݾ� : "+Reter);
				money = money - Reter;
				System.out.println("����ܰ� : "+money);
					
				}else if(money < Reter){
					System.out.print("�ܾ��� �����մϴ�.");
					System.out.println("�����ܰ�� : "+money);
					System.out.println("�ٽ� �Է����ּ��� ");
					System.out.println();
				}
				break;
			
			case 3:
				System.out.println("�����ܰ�� : "+money);
				break;
				
			case 4:
				System.out.println("-------------------------------------------");
				System.out.println("  ***** ����� ���� ��ȣ�� �غ� �߽��ϴ�. *****");
				System.out.println("-------------------------------------------");
				System.out.println("�̿��� : �Ա��� 1,000������ ���� �ּ��� ^^ ");
				System.out.println("�̿��� : 1,000��  > 1ȸ  ");
				System.out.println("�����ܰ�� : "+money);
				System.out.println("-------------------------------------------");
				System.out.print("ȸ���� �Է��ϼ��� : ");
				
				
				Reter =sc.nextInt();
				Reter = Reter*1000;
				
				if(1000>Reter|| Reter%2!=0 ||Reter%1000!=(int)0){
					
					System.out.println(" 1,000�������� ���� �ּ��� ");

				}else if (Reter%2!=0 || Reter%1000!=(int)0){
					
					System.out.println(" 1,000�������� ���� �ּ��� ");
			
				}else if(money<Reter){
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("��ݱݾ� : -"+Reter+"��");
					System.out.println("�����ܰ�� : "+money+"��");
					System.out.println("�ٽ��Է� ���ּ���");
					
				}else {
					System.out.println("��ݱݾ� : "+Reter+"��");
					
					money=money-Reter;
					Reter = Reter/1000;
					System.out.println();
					for(int i = 0; i<Reter; i++) {
					Play.PlayNormal();
					System.out.println();
					}
					System.out.println("");
					System.out.println("�����ܰ�� : "+money);
					System.out.println("-------------------------------------------");
					
				}
				
				break;
			
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				play = false;
				break;
			}		
		}
		sc.close();

	}
}
