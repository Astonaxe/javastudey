package javaTest1;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 // TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean play = true;
		float save=0;
	
			
		while(play) {
			System.out.println("----------------------------");
			System.out.println("양수 음수 구분하기 ");
			System.out.println("----------------------------");
			System.out.print("입력 :");
			save=scan.nextInt();
		
			if(save>0){
			System.out.println(" 양수입니다.");

			}else if(save==0){
			System.out.println(" 0 입니다.");

			}else {
			System.out.println(" 음수입니다.");
			}

			}		
		}

}
