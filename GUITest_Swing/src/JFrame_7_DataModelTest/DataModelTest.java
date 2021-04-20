package JFrame_7_DataModelTest;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;


public class DataModelTest{
	
	public static void main(String args[]) {
	String rows[][] = {{"지역","토지"},{"생산","비생산"},{"감정","폭발"}}; // 데이터 값 
	String headers[] = {"I","You","Why"}; // 항목 값 
	String sports[] = {"","피자","족발","기타","광주"}; // 선택 할 수 있는 값 
	
	
	JComboBox<String>comboBox = new JComboBox<String>(sports); // 콤보박스 생성 
    comboBox.setMaximumRowCount(5); //콤보박스 항목 최대 4개 
    
    
    TableCellEditor editor = new DefaultCellEditor(comboBox);
    
    JFrame frame = new JFrame("JTable Test"); // JFrame을 상속받지 않고 코드상으로 사용하는 방법 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 
   
    JTable table = new JTable(new DefaultTableModel(rows, headers)); //테이블 생성  
	// 테이블 생성 
	table.getColumnModel().getColumn(1).setCellEditor(editor); //테이블에 콤보박스 가능 
	
	
	JScrollPane scrollPane = new JScrollPane(table);
	frame.add(scrollPane, BorderLayout.CENTER);
	frame.setSize(300,150);
	frame.setVisible(true);
    
    
	}
}
