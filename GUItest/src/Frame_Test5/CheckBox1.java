package Frame_Test5;
import java.awt.*;

public class CheckBox1 extends Frame{
	
	public CheckBox1(String str){
		
		super(str);
		Panel p = new Panel(); // Panel ���� 
		Checkbox cbx1 = new Checkbox("ġŲ",true); //
		Checkbox cbx2 = new Checkbox("����",true);
		Checkbox cbx3 = new Checkbox("�ܹ���",false);
		Checkbox cbx4 = new Checkbox("¥���",false);
		
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		p.add(cbx4);
		
		CheckboxGroup group = new CheckboxGroup(); // üũ �ڽ� �׷� �����ؼ� �ϳ��� ���� �����ϰ� 
		Checkbox cbx5 = new Checkbox("ġŲ",group,true);
		Checkbox cbx6 = new Checkbox("����",group,true);
		Checkbox cbx7 = new Checkbox("�ܹ���",group,true);
		Checkbox cbx8 = new Checkbox("¥���",group,true);
		
		p.add(cbx5);
		p.add(cbx6);
		p.add(cbx7);
		p.add(cbx8);
		
		add(p); // �̰��� �߰��ؾ� ȭ��ȿ� ��Ÿ�� 
		setSize(180,300);
		setVisible(true);
	}
	

}
