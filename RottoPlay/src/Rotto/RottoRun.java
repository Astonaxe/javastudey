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
			System.out.println(" ********** 행복한 로또 자동 출력기 **********");
			System.out.println("-------------------------------------------");
			System.out.println("  1.입금 | 2.출금 | 3.잔고 | 4.로또출력 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택하기 > ");
			
			int choice = sc.nextInt();
			
			switch(choice){
			
			case 1: 
				System.out.print("예금액 : ");
				Moneyimport =sc.nextInt();
				money=money+Moneyimport;
				System.out.println("현재잔고액 : "+money+"원");
				break;
			
			case 2: 
				System.out.print("출금액 : ");
				Reter = sc.nextInt();
				
				if(money>Reter){
				System.out.println("출금액 : "+Reter);
				money = money - Reter;
				System.out.println("출금잔고 : "+money);
					
				}else if(money < Reter){
					System.out.print("잔액이 부족합니다.");
					System.out.println("현재잔고액 : "+money);
					System.out.println("다시 입력해주세요 ");
					System.out.println();
				}
				break;
			
			case 3:
				System.out.println("현재잔고액 : "+money);
				break;
				
			case 4:
				System.out.println("-------------------------------------------");
				System.out.println("  ***** 당신을 위한 번호를 준비 했습니다. *****");
				System.out.println("-------------------------------------------");
				System.out.println("이용밥법 : 입금은 1,000단위로 끊어 주세요 ^^ ");
				System.out.println("이용요금 : 1,000원  > 1회  ");
				System.out.println("현재잔고액 : "+money);
				System.out.println("-------------------------------------------");
				System.out.print("회수로 입력하세요 : ");
				
				
				Reter =sc.nextInt();
				Reter = Reter*1000;
				
				if(1000>Reter|| Reter%2!=0 ||Reter%1000!=(int)0){
					
					System.out.println(" 1,000원단위로 끊어 주세요 ");

				}else if (Reter%2!=0 || Reter%1000!=(int)0){
					
					System.out.println(" 1,000원단위로 끊어 주세요 ");
			
				}else if(money<Reter){
					System.out.println("잔액이 부족합니다.");
					System.out.println("출금금액 : -"+Reter+"원");
					System.out.println("현재잔고액 : "+money+"원");
					System.out.println("다시입력 해주세요");
					
				}else {
					System.out.println("출금금액 : "+Reter+"원");
					
					money=money-Reter;
					Reter = Reter/1000;
					System.out.println();
					for(int i = 0; i<Reter; i++) {
					Play.PlayNormal();
					System.out.println();
					}
					System.out.println("");
					System.out.println("현재잔고액 : "+money);
					System.out.println("-------------------------------------------");
					
				}
				
				break;
			
			case 5:
				System.out.println("프로그램을 종료합니다.");
				play = false;
				break;
			}		
		}
		sc.close();

	}
}
