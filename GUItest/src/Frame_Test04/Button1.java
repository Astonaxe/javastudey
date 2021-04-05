package Frame_Test4;
import java.awt.*;

public class Button1 extends Frame{
	
	Button btn1, btn2, btn3; // 생성할 버튼을 지정 
	
	public Button1(String str){
		
		super(str);
		Panel p = new Panel(); //버튼을 생성하기위해 패널 생성 
		
		btn1 = new Button(" 가위 "); // 가위 버튼 생성 
		
		btn2 = new Button(" 바위 "); // 바위 
		
		btn3 = new Button(" 보 "); // 보 
		
		p.add(btn1); p.add(btn2); p.add(btn3); 
		add(p);
		
		btn3.setEnabled(false);
		
		setSize(300,300);
		
		setVisible(true);
		
	}

}
