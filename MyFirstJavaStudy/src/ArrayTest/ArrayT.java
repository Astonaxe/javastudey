package ArrayTest;
import java.util.Scanner;

public class ArrayT {
	public static void main(String[] args){
		
		int max, min;
		int[] s = new int[5];
		
		System.out.println("���� 5���� �Է� �ϼ���");
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ; i<s.length; i++) {
			s[i] = sc.nextInt(); 
			
		}
		
		max =s[0];
		min =s[0];
		
		for(int i =1; i<s.length; i++) {
			if(max<s[i]){
				max = s[i];
				
			}
			if(min>s[i]) {
				min =s[i];
			}
		}
		System.out.println("MAX = "+max);
		System.out.println("MIN = "+min);
		
	}
	
}
