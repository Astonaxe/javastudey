package Frame_Test6;
import java.awt.*;

public class Choice1 extends Frame{
	
	Choice ch=new Choice();
	
	public Choice1(String str) {
		super(str);
		
		ch.addItem("치킨");
		ch.addItem("피자");
		ch.addItem("햄버거");
		
		add(ch);
		setSize(100,100);
		setVisible(true);
		
	}
	

}
