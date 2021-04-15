package JFrame_2_Button;
import javax.swing.*;

public class JButtonTest extends JFrame{
	
	public JButtonTest(String str){
		super(str);
		
		JPanel buttonPanel = new JPanel();//버튼을 넣기위한 패널 생성 
		JButton btn = new JButton("Button");//버튼 넣기 
		
		buttonPanel.add(btn);
		
		ImageIcon icon1 = new ImageIcon(".\\src\\red.png");
		ImageIcon icon2 = new ImageIcon(".\\src\\blck.png");
		JToggleButton tgbutton = new JToggleButton(icon1);
		buttonPanel.add(tgbutton);
		
		JLabel lblHobby =new JLabel("취미"); // 취미 레이블 
		JCheckBox check1 = new JCheckBox("운동");
		JCheckBox check2 = new JCheckBox("독서");
		JCheckBox check3 = new JCheckBox("라이딩");
		buttonPanel.add(lblHobby);
		buttonPanel.add(check1);
		buttonPanel.add(check2);
		buttonPanel.add(check3);
		
		
		JLabel lblMale = new JLabel("성별"); // 성별 레이블 
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
