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
			System.out.println("��� ���� �����ϱ� ");
			System.out.println("----------------------------");
			System.out.print("�Է� :");
			save=scan.nextInt();
		
			if(save>0){
			System.out.println(" ����Դϴ�.");

			}else if(save==0){
			System.out.println(" 0 �Դϴ�.");

			}else {
			System.out.println(" �����Դϴ�.");
			}

			}		
		}

}
