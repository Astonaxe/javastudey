package sec03.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++){ //¦���� ��� 
			if(i%2!=0) {
				continue; //�Ʒ� �ڵ带 �������� �ʰ� �ݺ����� �����Ѵ�.  
				//0�̳� ������ true �� ��� �Ͽ� ���� �ݺ�  �ٽ� ���ư���. 
			}
			System.out.println(i);
			
		}
	}

}
