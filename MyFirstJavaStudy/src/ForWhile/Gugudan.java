package ForWhile;

public class Gugudan {

	public static void main(String[] args) {
		
		for(int dan2=2; dan2<=9; dan2++) {
			System.out.print("["+dan2+"´Ü]\t");
		}
		System.out.println();
		for(int x=1; x<=9; x++) {
			for(int y=2; y<=9; y++) {
				System.out.print(y+"x"+x+"="+(y*x)+"\t");
			}System.out.println();
			
		}
		
		
	}

}
