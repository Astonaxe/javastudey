package ArrayTest;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int max, min;
		int[] s = new int[5];
		int sum = 0;
		
		for(int i=0; i <s.length; i++) {//���� �ִ´�. 
			s[i]= sum+=5;
			System.out.println(s[i]);
		}
		System.out.println("�ִ밪 : " + s[s.length-1]); // �ִ밪
		System.out.println("�ּҰ� : " + s[0]);
		
		System.out.print("���� 5���� �Է� �ϼ���?"); 
		Scanner sc = new Scanner(System.in);
	}
}
