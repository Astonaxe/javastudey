package Chap01_ForStudy;
import java.util.*;

public class No05_Star_StairRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i = 1; i<=Num; i++){
			for(int s =1; s<=Num-i; s++){
				System.out.print(" ");
			}
			for(int st=1; st<=i; st++){
				System.out.print("*");
			}
		
			System.out.println("");
		
		}
		
	}

}
