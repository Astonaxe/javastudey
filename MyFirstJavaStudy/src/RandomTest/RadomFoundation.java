package RandomTest;
import java.util.Random;

public class RadomFoundation {

	public static void main(String[] args) {
		Random random = new Random(); //
		random.setSeed(System.currentTimeMillis());
		
		System.out.println("0이상 n이하의 무작위 정수값 : " + random.nextInt(10)); 
        System.out.println("무작위 boolean 값 : " + random.nextBoolean());
        System.out.println("무작위 long 값 : " + random.nextLong());
        System.out.println("무작위 float 값 : " + random.nextFloat());
        System.out.println("무작위 double 값 : " + random.nextDouble());
        System.out.println("무작위 정규 분포의 난수 값 :" + random.nextGaussian());
        

	}

}
