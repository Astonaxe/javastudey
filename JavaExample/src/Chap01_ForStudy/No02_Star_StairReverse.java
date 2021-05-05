package Chap01_ForStudy;
import java.util.*;
public class No02_Star_StairReverse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i =1; i<=Num; i++){
			for(int k=0; k<=Num-i; k++){
				System.out.print("*");
			}
				System.out.println("");
		}
		
	}

}
