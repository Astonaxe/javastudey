package RandomTest;
import java.util.Random;

public class RadomFoundation {

	public static void main(String[] args) {
		Random random = new Random(); //
		random.setSeed(System.currentTimeMillis());
		
		System.out.println("0�̻� n������ ������ ������ : " + random.nextInt(10)); 
        System.out.println("������ boolean �� : " + random.nextBoolean());
        System.out.println("������ long �� : " + random.nextLong());
        System.out.println("������ float �� : " + random.nextFloat());
        System.out.println("������ double �� : " + random.nextDouble());
        System.out.println("������ ���� ������ ���� �� :" + random.nextGaussian());
        

	}

}
