package sec07.exam02_field_initialize;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("ȫ�浿","010-2222-3333"); // ��ü�� ����� �Ű� ������ �ʱ�ȭ �����ش�. 
		System.out.println("k1.name = " + k1.name);
		System.out.println("k1.ssn = " +k1.ssn);
		
		Korean k2 = new Korean("�ݹ���","930130-029139");
		System.out.println("k2.name = " +k2.name);
		System.out.println("k2.ssn = " +k2.ssn);
		
	}

}
