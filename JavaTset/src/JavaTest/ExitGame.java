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
				System.out.println("����� �Է��� ������ �� ���ϱ�");
				System.out.println("----------------------------");
				System.out.println("�̿���1 : �� 5ȸ�� �Է� ");
				System.out.println("�̿���2 : ���� 100�̻��̸� ���� ");
				System.out.println("���� ȸ�� : "+count+" ���� Ƚ�� : "+number);
				System.out.println("----------------------------");

				System.out.print("�Է� :");
				count++;
				number--;
				save=scan.nextInt();
				sum = save+sum;
				System.out.print("���� �� : "+sum);
				System.out.println();
				System.out.println("----------------------------");


				if(sum>=100||count>=5){
					play =false; 
					System.out.println("���α׷� ����!");

				}
				
				}		
			}

	}


