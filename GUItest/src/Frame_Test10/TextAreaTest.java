package Frame_Test10;
import java.awt.*;

public class TextAreaTest extends Frame{

	public TextAreaTest(String str) {
		super(str);
		Panel p = new Panel(); // �г� ����   
		 
		TextArea Text1 = new TextArea(20,35); //�ؽ�Ʈ ����� 10�� 30�� ����  
		TextField Text2 = new TextField("hello!",20); //�ؽ�Ʈ �ʵ� ���� 
		
		Text1.setText(" java World");  // �ؽ�Ʈ �ʵ� ���� 
		
		Text1.setBackground(Color.black); // ���� 
		Text1.setFont(new Font("�������",Font.BOLD,20)); // ��Ʈ ��ü ���� 
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
