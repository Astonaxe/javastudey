package ArrayTest;

public class ArraylnArrayExample {

	public static void main(String[] args) {
		int[][] mathScores=new int[2][3];
		//������ �迭
		for(int i =0; i<mathScores.length; i++) {
			for(int j =0; j <mathScores[i].length; j++) {
				System.out.println("mathScores["+i+"]["+j+"]");
			}
		}
		
		System.out.println();
		
		int[][] englishScores= new int [2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i =0; i<englishScores.length; i++) {
			for(int j =0; j <englishScores[i].length; j++) {
				System.out.println("englishScores["+i+"]["+j+"]");
			}
		}
		
		System.out.println();
		

		int[][] javaScores= {{95,80},{92,96,80}};
		
		for(int i =0; i<englishScores.length; i++) {
			for(int j =0; j <englishScores[i].length; j++) {
				System.out.println("englishScores["+i+"]["+j+"]="+javaScores[i][j]);
			}
		}
		
	}

}