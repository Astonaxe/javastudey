package advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 31, 41, 53, 73, 123};
		
		int sum = 0 ; 
	
		
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("점수 총합 ="+sum);
		
		
		
		//향상된 for문 
		for(int score:scores) {
			sum += score;
		}
		
		System.out.println("점수 총합 ="+sum);
		
		
		double avg = (double)sum/scores.length;
		System.out.println(avg);
	}

}
