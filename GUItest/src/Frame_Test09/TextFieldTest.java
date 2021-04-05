package Frame_Test9;
import java.awt.*;

public class TextFieldTest extends Frame{
	
	// TextArea 여러 줄의 텍스트를 입력 받거나 편집할 수 있는 컴포넌트  
	public TextFieldTest(String str){
		super(str);
		
		Panel p = new Panel();
		
		//레이블 생성 
		Label lbl1 = new Label(" 아이디 ");
		Label lbl2 = new Label(" 비밀번호 ");
		
		TextField text1 =new TextField("ID",20); // 20자리 텍스트 필드 생성 
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
