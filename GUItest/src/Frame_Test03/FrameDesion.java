package Frame_Test3;
import java.awt.*;

public class FrameDesion extends Frame{
	public FrameDesion(String str){ //메소드의 매게 변수를 선언합니다. 
		super(str); // 사용 가능 
		Panel panel1 = new Panel(); // 패널를 만들기 위해서 변수로 지정 
		panel1.setBackground(Color.RED);// 색을 지정한다. 
		add(panel1);
		setSize(100,100);
		setVisible(true);
	}
	
}
