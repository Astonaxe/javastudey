package ForWhile;


public class verify4 {
/*
 *   while���� Math.random() �޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�,
 *   ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ �� �ߴ� �ڵ带 �ۼ��� ������. 
 *   ���� ���� 5�� �Ǵ� ������ (1,4), (4,1), (2,3), (3,2)�Դϴ�.
 */
	public static void main(String[] args) {
		//o.o<=Math.random()< 1.0 �� ������ �Ǽ�, 1~6 
		
		while(true) {
			int dice1= (int)(Math.random()*6)+1; 
			int dice2= (int)(Math.random()*6)+1;
			System.out.println("("+dice1+","+dice2+")");
			if((dice1+dice2 )== 5) {
				break; // ���� ���� 
			}
		}
		
	}
}
