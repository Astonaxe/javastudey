package ForWhile;
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
	    System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ��� ");
	    
	    //Scanner Ŭ���� Ÿ���� scanner ������ Scanner ��ü �����Ͽ� ���Խ�Ų��. 
	    Scanner scanner = new Scanner(System.in);
	    String inputString;
	    
	    do {
	     System.out.print(">"); // println �� print ���̴� �� �ٲ�� �� �ٲ��� ���� ���� ���̰� �ִ�.
	     inputString=scanner.nextLine(); // ǥ���������ġ �ڼ� ���� ������ �Թ޾� inputString ������ ���Խ� ���� 
	     System.out.println(inputString);
	    }while(!inputString.equals("q"));
	    
	    System.out.println();
	    System.out.println("���α׷� ����");
	
	}

}
