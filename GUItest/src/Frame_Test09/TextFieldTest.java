package Frame_Test9;
import java.awt.*;

public class TextFieldTest extends Frame{
	
	// TextArea ���� ���� �ؽ�Ʈ�� �Է� �ްų� ������ �� �ִ� ������Ʈ  
	public TextFieldTest(String str){
		super(str);
		
		Panel p = new Panel();
		
		//���̺� ���� 
		Label lbl1 = new Label(" ���̵� ");
		Label lbl2 = new Label(" ��й�ȣ ");
		
		TextField text1 =new TextField("ID",20); // 20�ڸ� �ؽ�Ʈ �ʵ� ���� 
		TextField text2 =new TextField(20);
		
		text2.setEchoChar('*');
		
		p.add(lbl1);
		p.add(text1);
		p.add(lbl2);
		p.add(text2);
		add(p);
		setBounds(400,400,200,200);
		setVisible(true);
	}

}
