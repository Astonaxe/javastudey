package Frame_Test15;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
public class CardLayout1 extends Frame
{
	CardLayout card = new CardLayout(); // 
	Panel panel[] = new Panel[5];// 鳶確 識情 
	Color color[] = {Color.red, Color.black, Color.blue, Color.cyan, Color.green, Color.yellow}; // 事雌 識情 
	
	public CardLayout1 (String str){
		super(str);
		setLayout(card);//CardLayout 
		
		MouseHandle mouse = new MouseHandle();
		
		for(int i = 0 ; i<5; i++){
			panel[i] = new Panel();
			panel[i].setBackground(color[i]);
			panel[i].addMouseListener(mouse);
			add(""+(i+1), panel[i]);
			
		}
		setSize(300,300);
		setVisible(true);
		
		}
	
		public class MouseHandle extends MouseAdapter
		{
			public void mouseClicked(MouseEvent e){
				card.next(CardLayout1.this);
				
			}
		}
		
		
 
}