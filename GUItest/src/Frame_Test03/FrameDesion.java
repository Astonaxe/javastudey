package Frame_Test3;
import java.awt.*;

public class FrameDesion extends Frame{
	public FrameDesion(String str){ //�޼ҵ��� �Ű� ������ �����մϴ�. 
		super(str); // ��� ���� 
		Panel panel1 = new Panel(); // �гθ� ����� ���ؼ� ������ ���� 
		panel1.setBackground(Color.RED);// ���� �����Ѵ�. 
		add(panel1);
		setSize(100,100);
		setVisible(true);
	}
	
}
