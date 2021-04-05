package javaTest1;
import java.util.*;

public class ExitGame {

	public static void main(String[] args) {
		

			 // TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			boolean play = true;
			int sum =0;
			int save=0;
			int count = 0;
			int number = 5;
				
			while(play) {
				System.out.println("당신이 입력한 정수의 합 구하기");
				System.out.println("----------------------------");
				System.out.println("이용방법1 : 총 5회만 입력 ");
				System.out.println("이용방법2 : 합이 100이상이면 종료 ");
				System.out.println("현재 회수 : "+count+" 남은 횟수 : "+number);
				System.out.println("----------------------------");

				System.out.print("입력 :");
				count++;
				number--;
				save=scan.nextInt();
				sum = save+sum;
				System.out.print("현재 합 : "+sum);
				System.out.println();
				System.out.println("----------------------------");


				if(sum>=100||count>=5){
					play =false; 
					System.out.println("프로그램 종료!");

				}
				
				}		
			}

	}


