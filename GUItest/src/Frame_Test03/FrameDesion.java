package Frame_Test3;
import java.awt.*;

public class FrameDesion extends Frame{
	public FrameDesion(String str){
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.RED);// ���� �����Ѵ�. 
		add(panel1);
		setSize(100,100);
		setVisible(true);
	}
	
}
