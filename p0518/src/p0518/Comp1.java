package p0518;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Comp1 extends JFrame {
	Comp1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Component 예제");
		setSize(250,250);
		setVisible(true);
		
		Container c=this.getContentPane();
		c.setBackground(Color.YELLOW);
		
		c.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("버튼1");
		btn1.setBackground(Color.BLACK);//배경색
		btn1.setForeground(Color.MAGENTA);//전경색 (글자색)
		
		JButton btn2=new JButton("버튼2");
		btn2.setFont(new Font("맑은고딕",Font.BOLD,30));
		btn2.setToolTipText("이 버튼은 크게 보여요~~");//ToolTipText버튼 위에 마우스가 위치 했을때 보이는
		
		JButton btn3=new JButton("버튼3");
		btn3.setEnabled(false);//버튼 비활성화 enable(false):사용자별로 권한이 다뉠때 비활성화
		
		c.add(btn1);
		c.add(btn2);//set한것을 컨테이너에 부착
		c.add(btn3);
	}

	public static void main(String[] args) {
		new Comp1();//생성자함수 호출

	}

}
