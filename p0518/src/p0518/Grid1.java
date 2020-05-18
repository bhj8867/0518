package p0518;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid1 extends JFrame {
	Grid1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("grid 연습");
		Container c = getContentPane();// this대신 컨테이너에 붙인다. 창-컨테이너-버튼
		c.setLayout(new GridLayout(3, 2));// 행과열을 개수를 잡아서 배치,행을 먼저 잡아둔뒤 열은 개수에
										
		JButton[] btn = new JButton[9];// 배열을 이용
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton("버튼" + (i + 1));
			c.add(btn[i]);//컨테이너에 부착시킴

			setSize(250, 25);
			setVisible(true);

			/*
			 * JButton btn1=new JButton("버튼1"); this.add(btn1); JButton btn2=new
			 * JButton("버튼2"); this.add(btn2); JButton btn3=new JButton("버튼3");
			 * this.add(btn3); JButton btn4=new JButton("버튼4"); this.add(btn4);
			 * JButton btn5=new JButton("버튼5"); this.add(btn5); JButton btn6=new
			 * JButton("버튼6"); this.add(btn6); JButton btn7=new JButton("버튼7");
			 * this.add(btn7); JButton btn8=new JButton("버튼8"); this.add(btn8);
			 */

		}

	}

	public static void main(String[] args) {
		new Grid1();

	}

}
