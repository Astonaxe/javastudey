package Rotto;

public class RottoPlay {

	int[] Num = new int[6];
	
	
	
	void PlayNormal(){
	for(int i =0 ; i<6; i++) {
		Num[i]=(int)(Math.random()*45)+1;
		
		for(int j =0; j<i; j++) {
			if(Num[i]==Num[j]){
				i--;
				break;
				}
			}
		}
	for(int i =0; i<Num.length; i++) {
		
		System.out.print(Num[i]+" ");
		
		}	
	}
	
	
	void PlayOddNum() {
		int[] Num = new int[6];

		
		for(int i =0 ; i<Num.length; i++) {
			Num[i]=(int)(Math.random()*45)+1;
			
			for(int j =0; j<i; j++) {
				if(Num[i]==Num[j] || Num[i]%2==0){
						
					i--;
					
				}
			}
		}
		for(int i =0; i<Num.length; i++) {
			
			System.out.print(Num[i]+" ");
			
			}	
	}
	
	
	void PlayEvenNum() {
		int [] Num = new int[6];
		
			for(int i =0; i<Num.length; i++){
				Num[i]=(int)(Math.random()*45)+1;
				for(int j =0; j<Num.length; j++){
					if(Num[i] == Num[j] || Num[i]%2!=0){
						i--;
					}
				}
			}
			
			for(int i =0; i<Num.length; i++) {
				System.out.print(Num[i]+" ");
				
			}	
		}
	}
	

