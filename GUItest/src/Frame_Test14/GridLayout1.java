package Frame_Test14;
import java.awt.*;

public class GridLayout1 extends Frame{
	
	Button btn[] = new Button[6];
	public GridLayout1(String str){
		super(str);
		
		setLayout(new GridLayout(3,2));
		//
		for(int i =0; i<6; i++) {
			btn[i] = new Button(i+1+ "¹ø ¹öÆ°");
			add(btn[i]);
		}
		setSize(200,200);
		setVisible(true);
	}

}