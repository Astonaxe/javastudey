package ArrayTest;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int max, min;
		int[] s = new int[5];
		int sum = 0;
		
		for(int i=0; i <s.length; i++) {//값을 넣는다. 
			s[i]= sum+=5;
			System.out.println(s[i]);
		}
		System.out.println("최대값 : " + s[s.length-1]); // 최대값
		System.out.println("최소값 : " + s[0]);
		
		System.out.print("정수 5개를 입력 하세요?"); 
		Scanner sc = new Scanner(System.in);
	}
}
