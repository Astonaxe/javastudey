package Chap01_ForStudy;
import java.util.*;

public class No03_Star_Farm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i = 1; i <=Num; i++){
			for(int k = 1; k<=Num; k++) {
				System.out.print(" * ");
			}
			System.out.println("");
			System.out.println("");
		}
		
	}

}
