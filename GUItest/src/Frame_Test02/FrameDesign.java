package Frame_Test2;
import java.awt.Frame;

public class FrameDesign extends Frame { 
	// extends 상속 부모의 메소드를 그대로 사용할 수 있으며 오버라이딩 할 필요 업시 부모에 구현되있는 것을 직접 사용 가능하다.    
	//
	
	public FrameDesign() {
		super("두 번째 프레임 테스트입니다.");
		setBounds(100,100,300,300);
		setVisible(true);
		
	}
}
