package JFrame_6_JTable;
import java.awt.*;
import javax.swing.*;
 
 
public class JTableTest extends JFrame
{
    public JTableTest()
    {
        super("JTable 테스트");
        String title[] = {"번호", "이름", "나이"};
        String data[][] = {
                {"1", "너구리", "26"},
                {"2", "백지영", "25"},
                {"3", "족제비", "24"}
        };
        
        // JTable 행에는 데이터 열에는 타이틀 지정
        JTable table = new JTable(data, title);
        // JTable 스크롤 
        JScrollPane sp = new JScrollPane(table);
        // 테이블 위치
        getContentPane().add(sp, BorderLayout.CENTER);
        setSize(300, 150);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        JTableTest jtable = new JTableTest();
        jtable.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
