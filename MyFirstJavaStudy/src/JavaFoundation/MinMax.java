package JavaFoundation;
import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("3개의 정수를 입력 하세요?"); 
		int n1, n2, n3, max, min;
		Scanner sc = new Scanner(System.in); 
		n1 = sc.nextInt(); // 첫번째 입력값 
		n2 = sc.nextInt(); // 둘번째 입력값 
		n3 = sc.nextInt(); // 세번째 입력값
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		max = (n1 > n2 && n1 > n3)  ? n1 : (n2 > n3) ? n2 : n3; // 기본 조건 삼항 연산자  n1 을 n2,n3를 비교하고 
		min = (n1 < n2 && n1 < n3)  ? n1 : (n2 < n3) ? n2 : n3; 
		

		
		// 아래에 코드를 작성하세요. // ?
		System.out.println("max="+max); 
		System.out.println("min="+min);
		
		// 연산자 활용 
		int x, y, z, max2, min2;
		Scanner sc1 = new Scanner(System.in); // 코솔에 입력 갑을 받는다는 의미 
		x = sc1.nextInt(); // 
		y = sc1.nextInt();
		z = sc1.nextInt();
		
		
		
 }
}