package Chap01;
import java.util.*;

public class No06AMinusB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A,B 값을 입력하고 그값이 A와 B 뺀 = 1이 출력되게 하시오");
		System.out.println("0<A, B<10");

		System.out.println();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println("A-B = "+(A-B));
		
	}

}
