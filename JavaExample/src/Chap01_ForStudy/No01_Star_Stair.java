package Chap01_ForStudy;
import java.util.*;

public class No01_Star_Stair {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i =1; i<=Num; i++ ){  
			for(int x =1; x<=i; x++){   
				System.out.print("*"); 
				// i�� �����ϸ� i ������ ŭ * ��µȴ�.    
			}
				System.out.println(""); // �ٹٲ� 
		}
		
	}

}
