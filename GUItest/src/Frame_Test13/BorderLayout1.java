package Frame_Test13;
import java.awt.*;

public class BorderLayout1 extends Frame{
	
	public BorderLayout1(String str){
		
		super(str);
		
		setLayout(new BorderLayout());
		
		add("North", new Button("����"));
		add("West", new Button("����"));
		add("East", new Button("����"));
		add("Center", new Button("�߾�"));
		add("South", new Button("����"));
		
		setSize(200,200);
		setVisible(true);
		
	}
	

}
