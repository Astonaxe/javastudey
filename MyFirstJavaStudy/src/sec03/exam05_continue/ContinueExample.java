package sec03.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++){ //짝수만 출력 
			if(i%2!=0) {
				continue; //아래 코드를 실행하지 않고 반복문을 수행한다.  
				//0이나 나오면 true 로 출력 하여 무한 반복  다시 돌아간다. 
			}
			System.out.println(i);
			
		}
	}

}
