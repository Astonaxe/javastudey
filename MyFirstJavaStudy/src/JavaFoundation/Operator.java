package JavaFoundation;

public class Operator {

	public static void main(String[] args) {
		/*
		 * ������ �����ϴ� ��ȣ�� ���Ѵ�. ���� ��� '+','-' �� �����ϴ� ��� 
			������ / �ǿ����� 
			������ (operator) ������ �����ϴ� ��ȣ (-,+,*)
			�ǿ����� (operand) �������� �۾� ��� (����,���,���ͳ�)
			
		 */
		// ������ ���� 
		int a = 1;
		int b = 3;
		int c = 5;
		// ������� 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b); // �������� ������ 
		System.out.println(a>>b);
		//�񱳿���
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b); // �̰��� �����̴� ������ ! �ǹ̷� ���
		System.out.println(a^b); //  �� ���� �޶���� true
		//��������
		System.out.println(a>b&&a<c);
		System.out.println(a>c||b<c);
	
		int pencils = 534; int students = 30;
		// �л� �� ���� ������ ���� ��
		int pencilsPerStudent = (pencils/students);
			System.out.println(pencilsPerStudent); // 17
		// ���� ���� ��
		int pencilsLeft = ( pencils % students); 
		System.out.println(pencilsLeft); // 24
		

		int value = 356; 
		System.out.println(value - 56); // 300
		int x = 10; 
		int y = 5;
		System.out.println((x > 7) && (y <= 5)); 
		System.out.println((x % 3 == 2) || (y % 2 != 1)); // ( #2 )
		float lengthTop = 5.0f;
		float lengthBottom = 10.0f;
		float height = 7.0f;
		double area = ((lengthTop+lengthBottom)/2*height);
		System.out.println(area); // 52.5
		
		//���� ������ 
		int result1 = ++x;
		int result2 = y++;
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
