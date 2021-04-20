package JFrame_5_BoxLayout;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BoxLayoutTest extends JFrame{
	
	public BoxLayoutTest() {
		super("BoxLayout Test");
		JRadioButton r1, r2;
		
		setLayout(new BorderLayout());  //박스 레이아웃 매니저를 생성하고 컨테이너에 설정 
		Box left = Box.createHorizontalBox(); // 수직 배치 박스 레이아웃을 생성 
		left.add(Box.createVerticalStrut(30)); // 보기 좋게 배치아시 위해 투명 컴포넌트로 공간 확보  
		ButtonGroup radioGroup  = new ButtonGroup(); // 라디오버튼을 위한 버튼 그룹 생성 
		radioGroup.add(r1 = new JRadioButton("치킨")); // 버튼 객체를 생성 후 버튼 그룹에 추가 
	
		left.add(r1);
		left.add(Box.createVerticalStrut(30));
		radioGroup.add(r2 = new JRadioButton("피자"));
		left.add(r2);
		JPanel leftPanel = new JPanel(new BorderLayout()); // 패널의 두리선을 에칭효과로 지정 
		leftPanel.setBorder(
		           new TitledBorder( new EtchedBorder(),"음식"));       
		leftPanel.add(left, BorderLayout.CENTER);
		
		
		//수직으로 배치하는 박스레이아웃 생성 
		Box right = Box.createVerticalBox();
		right.add(Box.createVerticalStrut(30)); // 체크박스를 생성해 박스레이아웃에 추가 
		right.add(new JCheckBox("돼지"));
		right.add(Box.createVerticalStrut(30));
		right.add(new JCheckBox("족제비"));
		right.add(Box.createVerticalStrut(30));
		right.add(new JCheckBox("붕이"));
		JPanel rightPanel = new JPanel(new BorderLayout());
		rightPanel.setBorder(
				new TitledBorder(new EtchedBorder(),"동물"));
		rightPanel.add(right, BorderLayout.CENTER);
		
		
		//수평으로 배치하는 박스레이아웃을 생성해 
		// 패널 leftPanel과 rightPanel을 이 박스 레이아웃에 배치 
		Box center = Box.createHorizontalBox();
		center.add(leftPanel);
		center.add(rightPanel);
		add(center,BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxLayoutTest box = new BoxLayoutTest();
		box.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
