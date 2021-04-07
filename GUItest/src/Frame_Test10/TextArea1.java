package Frame_Test10;
import java.awt.*;

public class TestArea extends Frame{
	
	public TestArea(String str){
		super(str);
		TextArea text1 = new TextArea(10,10);
		TextField text2 = new TextField("hello Java",20);
		
		text1.setText(" Java World ");
		
		text1.setBackground(Color.black);
		text1.setFont(new Font("±Ã¼­Ã¼",Font.BOLD,10));
		text1.setForeground(Color.white);
		
		text2.setEchoChar('$');
		text2.setForeground();
	}

}
