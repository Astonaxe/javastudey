package Frame_Test7;
import java.awt.*;

public class LabelTest extends Frame {
	Panel p;
	Label label1, label2, label3;
	
	public LabelTest(String str){
		
		super(str);
		p = new Panel(); 
		label1 = new Label("치킨");
		label2 = new Label("피자",Label.CENTER); //  ("피자", Label.CENTER )
		label3 = new Label("햄버거",Label.LEFT);
		
		// 레벨 색 지정 
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		// 패널에 레이블 
		
		p.add(label1);p.add(label2);p.add(label3);
		
		add(p);
		setSize(300,300);
		setVisible(true);
		
		
	}
	
}
