package JFrame_2_Button;
import javax.swing.*;

public class JButtonTest extends JFrame{
	
	public JButtonTest(String str){
		super(str);
		
		JPanel buttonPanel = new JPanel();//��ư�� �ֱ����� �г� ���� 
		JButton btn = new JButton("Button");//��ư �ֱ� 
		
		buttonPanel.add(btn);
		
		ImageIcon icon1 = new ImageIcon(".\\src\\red.png");
		ImageIcon icon2 = new ImageIcon(".\\src\\blck.png");
		JToggleButton tgbutton = new JToggleButton(icon1);
		buttonPanel.add(tgbutton);
		
		JLabel lblHobby =new JLabel("���"); // ��� ���̺� 
		JCheckBox check1 = new JCheckBox("�");
		JCheckBox check2 = new JCheckBox("����");
		JCheckBox check3 = new JCheckBox("���̵�");
		buttonPanel.add(lblHobby);
		buttonPanel.add(check1);
		buttonPanel.add(check2);
		buttonPanel.add(check3);
		
		
		JLabel lblMale = new JLabel("����"); // ���� ���̺� 
		JRadioButton rb1 = new JRadioButton("Man");
		JRadioButton rb2 = new JRadioButton("woman");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		buttonPanel.add(rb1);
		buttonPanel.add(rb2);
		
		add(buttonPanel);
		
		setLocation(100,200);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonTest("JButton_test");
	}

}
