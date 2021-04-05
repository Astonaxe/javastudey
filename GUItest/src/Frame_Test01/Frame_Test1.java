package Frame_Test1;

import java.awt.*; // Frame 생성하기 위해서 import를 통해서 진행한다. 

public class Frame_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f= new Frame();
		f.setTitle("나의 첫 프레임 테스트 "); // title프레임 제목 
		f.setBounds(0,0,300,300); //크기 만들기 (x위치, y 위치,x 크기, y 크기 ) 
		f.setVisible(true); // 실행야한다. 는 뜻 

	}

}
