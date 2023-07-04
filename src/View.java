import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

public class View extends JFrame implements ActionListener {
    private Set<Integer> randomList = new HashSet<>();
    public int makeRandomNum(){
        while (true){
            int d = (int)((Math.random() *10000)%5)+1;
            if(!randomList.contains(d)){
                randomList.add(d);
                return d;
            }
        }
    }

    public void jebiResult(StudyMember studyMember){
        int result = makeRandomNum();
        if(result == 5){
            System.out.println("발표 준비 5분 전");
        }else {
            System.out.println("통과~");
        }
    }

    JButton b1,b2,b3,b4,b5,b6;
    JPanel p;
    public View() {
        setSize(300,200);
        setTitle("제 비 뽑 기 ~ ~");

        p = new JPanel();
        b1 = new JButton("이원희");
        b2 = new JButton("권동혁");
        b3 = new JButton("김재모");
        b4 = new JButton("서정국");
        b5 = new JButton("남택호");
        b6 = new JButton("결과 출력");

        Jebi jebi = new Jebi();


        b1.addActionListener(this);//이벤트메소드호출
        b2.addActionListener(this);//이벤트메소드호출
        b3.addActionListener(this);//이벤트메소드호출
        b4.addActionListener(this);//이벤트메소드호출
        b5.addActionListener(this);//이벤트메소드호출


        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        add(p);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = makeRandomNum();
        if(result == 5){
            b6.setText("발표 5분전");
        }else {
            b6.setText("통과~");

        }

    }
}
