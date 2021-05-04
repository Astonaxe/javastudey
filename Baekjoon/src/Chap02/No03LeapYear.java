package Chap02;
import java.util.*;

public class No03LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int LeapYear = sc.nextInt();
		
		if(LeapYear%4 ==0 && (LeapYear%100 !=0 || LeapYear % 400 ==0)){
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
