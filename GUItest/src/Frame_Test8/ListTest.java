package Frame_Test8;
import java.awt.*;

public class ListTest extends Frame{

	Panel p= new Panel();
	List list = new List(3,true);
	
	
	public ListTest(String str) {
		
		super(str);
		list.add("치킨");
		list.add("피자");
		list.add("햄버거");
		list.add("족발");
		list.add("돈까스");
		
		p.add(list);
		add(p);
		setSize(300,300);
		setVisible(true);
		
	}	
}
