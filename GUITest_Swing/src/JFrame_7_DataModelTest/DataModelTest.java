package JFrame_7_DataModelTest;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;


public class DataModelTest{
	
	public static void main(String args[]) {
	String rows[][] = {{"����","����"},{"����","�����"},{"����","����"}}; // ������ �� 
	String headers[] = {"I","You","Why"}; // �׸� �� 
	String sports[] = {"","����","����","��Ÿ","����"}; // ���� �� �� �ִ� �� 
	
	
	JComboBox<String>comboBox = new JComboBox<String>(sports); // �޺��ڽ� ���� 
    comboBox.setMaximumRowCount(5); //�޺��ڽ� �׸� �ִ� 4�� 
    
    
    TableCellEditor editor = new DefaultCellEditor(comboBox);
    
    JFrame frame = new JFrame("JTable Test"); // JFrame�� ��ӹ��� �ʰ� �ڵ������ ����ϴ� ��� 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� 
   
    JTable table = new JTable(new DefaultTableModel(rows, headers)); //���̺� ����  
	// ���̺� ���� 
	table.getColumnModel().getColumn(1).setCellEditor(editor); //���̺� �޺��ڽ� ���� 
	
	
	JScrollPane scrollPane = new JScrollPane(table);
	frame.add(scrollPane, BorderLayout.CENTER);
	frame.setSize(300,150);
	frame.setVisible(true);
    
    
	}
}
