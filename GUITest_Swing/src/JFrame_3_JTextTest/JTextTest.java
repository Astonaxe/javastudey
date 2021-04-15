package JFrame_3_JTextTest;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class JTextTest extends JFrame{
	JLabel lbl, la1, la2, la3;
	JTextField id;
	JPasswordField passwd;
	JPanel idPanel, paPanel, loginPanel;
	JButton b1,b2;
	JTextArea content;

	public JTextTest() {
		super("JText 테스트"); //FlowLayout 사용 
		setLayout(new FlowLayout()); // Border로 영역 생성 
		
		EtchedBorder eborder = new EtchedBorder(); //레이블 생성 
		lbl = new JLabel("아이디와 패스워드를 입력해 주세요"); // 레이블에 영역 만들기 
		lbl.setBorder(eborder); 
		
		add(lbl); // ID 패널과 PW 패널생성 
		
		idPanel = new JPanel();
		paPanel = new JPanel();
		la3 = new JLabel("아이디");
		la2 = new JLabel("패스워드"); 
		// ID 텍스트필드와 PW 텍스트 필드 선언 
		
		id = new JTextField(10);
		passwd = new JPasswordField(10);
		idPanel.add(la3);
		idPanel.add(id);
		paPanel.add( la2 );
		paPanel.add( passwd ); 
		// 로그인과 회원가입을 위한 패널 생성 
		
		loginPanel = new JPanel();
		b1 = new JButton("로그인");
		b2 = new JButton("회원가입");
		loginPanel.add( b1 );
		loginPanel.add( b2 );
		add(idPanel);
		add(paPanel);
		add(loginPanel);
		// 3행 20열 영역의 텍스트에어리어 
		content = new JTextArea(3,20);
		JScrollPane s = new JScrollPane(content);
		add(s);
		setSize( 250, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextTest();

	}

}
