package Chap01_ForStudy;
import java.util.*;

public class No04_Star_Stair_StairReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i = 1; i<=Num; i++){
			for(int k = 1; k<=i; k++){
				System.out.print("*");
			}
				System.out.println("");
		}
		
		for(int i = 1; i<=Num; i++){
			for(int k =1; k<=Num-i; k++){
				System.out.print("*");
			}
				System.out.println("");
		}
	}
}
