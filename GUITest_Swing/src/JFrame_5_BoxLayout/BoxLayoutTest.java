package JFrame_5_BoxLayout;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BoxLayoutTest extends JFrame{
	
	public BoxLayoutTest() {
		super("BoxLayout Test");
		JRadioButton r1, r2;
		
		setLayout(new BorderLayout());  //�ڽ� ���̾ƿ� �Ŵ����� �����ϰ� �����̳ʿ� ���� 
		Box left = Box.createHorizontalBox(); // ���� ��ġ �ڽ� ���̾ƿ��� ���� 
		left.add(Box.createVerticalStrut(30)); // ���� ���� ��ġ�ƽ� ���� ���� ������Ʈ�� ���� Ȯ��  
		ButtonGroup radioGroup  = new ButtonGroup(); // ������ư�� ���� ��ư �׷� ���� 
		radioGroup.add(r1 = new JRadioButton("ġŲ")); // ��ư ��ü�� ���� �� ��ư �׷쿡 �߰� 
	
		left.add(r1);
		left.add(Box.createVerticalStrut(30));
		radioGroup.add(r2 = new JRadioButton("����"));
		left.add(r2);
		JPanel leftPanel = new JPanel(new BorderLayout());
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
