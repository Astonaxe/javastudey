package Chap01_ForStudy;
import java.util.*;

public class No06_Star_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		
		for(int i = 0; i<=Num; i++){
			for(int s =1; s<=Num-i; s++){
				System.out.print(" ");
			}
			for(int st=0; st<2*i+1; st++){
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
	}

}
