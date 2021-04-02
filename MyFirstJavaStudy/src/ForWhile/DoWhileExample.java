package ForWhile;
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
	    System.out.println("프로그램을 종료하려면 q를 입력하세요 ");
	    
	    //Scanner 클래스 타입인 scanner 변수에 Scanner 객체 생성하여 대입시킨다. 
	    Scanner scanner = new Scanner(System.in);
	    String inputString;
	    
	    do {
	     System.out.print(">"); // println 과 print 차이는 줄 바뀜과 줄 바뀜이 없는 것이 차이가 있다.
	     inputString=scanner.nextLine(); // 표준입출력장치 코솔 에서 한줄을 입받아 inputString 변수에 대입시 실행 
	     System.out.println(inputString);
	    }while(!inputString.equals("q"));
	    
	    System.out.println();
	    System.out.println("프로그램 종류");
	
	}

}
