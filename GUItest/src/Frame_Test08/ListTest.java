package Frame_Test8;
import java.awt.*;

public class ListTest extends Frame{

	Panel p= new Panel();
	List list = new List(3,true); // 3���� ���̰� �Ѵ�. 
	
	
	public ListTest(String str) {
		
		super(str);
		list.add("ġŲ");
		list.add("����");
		list.add("�ܹ���");
		list.add("����");
		list.add("���");
		
		p.add(list);
		add(p);
		setSize(300,300);
		setVisible(true);
		
	}	
}
