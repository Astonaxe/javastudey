package Frame_Test10;
import java.awt.*;

public class TextAreaTest extends Frame{

	public TextAreaTest(String str) {
		super(str);
		Panel p = new Panel(); // 패널 생성   
		 
		TextArea Text1 = new TextArea(20,35); //텍스트 에어리어 10행 30열 생성  
		TextField Text2 = new TextField("hello!",20); //텍스트 필드 생성 
		
		Text1.setText(" java World");  // 텍스트 필드 생성 
		
		Text1.setBackground(Color.black); // 배경색 
		Text1.setFont(new Font("나눔고딕",Font.BOLD,20)); // 폰트 서체 설정 
		Text1.setForeground(Color.white);
		
		Text2.setEchoChar('$');
		Text2.setBackground(Color.BLACK);
		Text2.setForeground(Color.white);
		
		p.add(Text1);
		p.add(Text2);
		
		add(p);

		setSize(300,350);
		setVisible(true);
	}
}
