package Frame_Test4;
import java.awt.*;

public class Button1 extends Frame{
	
	Button btn1, btn2, btn3; // ������ ��ư�� ���� 
	
	public Button1(String str){
		
		super(str);
		Panel p = new Panel(); //��ư�� �����ϱ����� �г� ���� 
		
		btn1 = new Button(" ���� "); // ���� ��ư ���� 
		
		btn2 = new Button(" ���� "); // ���� 
		
		btn3 = new Button(" �� "); // �� 
		
		p.add(btn1); p.add(btn2); p.add(btn3); 
		add(p);
		
		btn3.setEnabled(false);
		
		setSize(300,300);
		
		setVisible(true);
		
	}

}
