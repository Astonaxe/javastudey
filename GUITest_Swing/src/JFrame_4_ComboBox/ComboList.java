package JFrame_4_ComboBox;
import java.awt.*;
import javax.swing.*;


public class ComboList extends JFrame {
	
	JPanel p, p1, p2; 
	JList<String> jl; // JList 선언 
	JComboBox<String> com;  // ComboBox 선언 
	String name[] = {"너구리", "의자", "족제비","원숭이","말"};
	String count[] = {"1","2","3","4","5"};
	
	public ComboList(){
		super("JComponent연습");
		Container c = getContentPane(); //FlowLayout 생성 
		
		c.setLayout(new FlowLayout()); //JPanel 생성 
		
		p = new JPanel(new GridLayout(1,2)); // JComboBox에 name 배열 
		
		com = new JComboBox<String>(name);
		JScrollPane s = new JScrollPane(com);
		c.add(s);
		
		jl = new JList<String>(name);
		JScrollPane s1 = new JScrollPane(jl);
		jl.setVisibleRowCount(4);
		c.add(s1);
		setSize(250,300);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboList Obj = new ComboList();
		Obj.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
