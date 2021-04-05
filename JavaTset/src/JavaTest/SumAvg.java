package javaTest1;

public class SumAvg {

	public static void main(String[] args) {
	
	 int i = 1; 
	 int sum = 0; 
	 float average= 0.00f;
	 
	 for(i = 1; i <= 100; i++){
		 sum += i; 
		 
	 } 
	 
	 average = (float)sum/100;
	 
	 System.out.println("1~100 ÇÕ°è : "+ sum); 
	 System.out.println("1~100 Æò±Õ°ª : "+ average);

	} 

	
}


