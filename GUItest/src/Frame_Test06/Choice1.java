package Frame_Test6;
import java.awt.*;

public class Choice1 extends Frame{
	
	Choice ch=new Choice();
	
	public Choice1(String str) {
		super(str);
		
		ch.addItem("ġŲ");
		ch.addItem("����");
		ch.addItem("�ܹ���");
		
		add(ch);
		setSize(100,100);
		setVisible(true);
		
	}
	

}
