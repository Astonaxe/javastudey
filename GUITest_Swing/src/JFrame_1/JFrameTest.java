// JFrame ��� ���� �ҽ��ڵ�  
package JFrame_1;
import javax.swing.*;

public class JFrameTest extends JFrame {
	 
	public JFrameTest(String str){
		super(str);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameTest f =new JFrameTest("JFrame test");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE); // ���� �̺�Ʈ 
		
	}

}
