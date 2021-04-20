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
		JPanel leftPanel = new JPanel(new BorderLayout()); // �г��� �θ����� ��Īȿ���� ���� 
		leftPanel.setBorder(
		           new TitledBorder( new EtchedBorder(),"����"));       
		leftPanel.add(left, BorderLayout.CENTER);
		
		
		//�������� ��ġ�ϴ� �ڽ����̾ƿ� ���� 
		Box right = Box.createVerticalBox();
		right.add(Box.createVerticalStrut(30)); // üũ�ڽ��� ������ �ڽ����̾ƿ��� �߰� 
		right.add(new JCheckBox("����"));
		right.add(Box.createVerticalStrut(30));
		right.add(new JCheckBox("������"));
		right.add(Box.createVerticalStrut(30));
		right.add(new JCheckBox("����"));
		JPanel rightPanel = new JPanel(new BorderLayout());
		rightPanel.setBorder(
				new TitledBorder(new EtchedBorder(),"����"));
		rightPanel.add(right, BorderLayout.CENTER);
		
		
		//�������� ��ġ�ϴ� �ڽ����̾ƿ��� ������ 
		// �г� leftPanel�� rightPanel�� �� �ڽ� ���̾ƿ��� ��ġ 
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
