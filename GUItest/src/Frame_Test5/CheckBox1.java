package Frame_Test5;
import java.awt.*;

public class CheckBox1 extends Frame{
	
	public CheckBox1(String str){
		
		super(str);
		Panel p = new Panel(); // Panel 생성 
		Checkbox cbx1 = new Checkbox("치킨",true); //
		Checkbox cbx2 = new Checkbox("피자",true);
		Checkbox cbx3 = new Checkbox("햄버거",false);
		Checkbox cbx4 = new Checkbox("짜장면",false);
		
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		p.add(cbx4);
		
		CheckboxGroup group = new CheckboxGroup(); // 체크 박스 그룹 생성해서 하나만 선택 가능하게 
		Checkbox cbx5 = new Checkbox("치킨",group,true);
		Checkbox cbx6 = new Checkbox("피자",group,true);
		Checkbox cbx7 = new Checkbox("햄버거",group,true);
		Checkbox cbx8 = new Checkbox("짜장면",group,true);
		
		p.add(cbx5);
		p.add(cbx6);
		p.add(cbx7);
		p.add(cbx8);
		
		add(p); // 이것을 추가해야 화념안에 나타남 
		setSize(180,300);
		setVisible(true);
	}
	

}
