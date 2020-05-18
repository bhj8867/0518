package p0518;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border01 extends JFrame {//import
	Border01(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("BorderLayout 예제");//방향을정해서 버튼을 배치하는 배치관리자
		
		this.setLayout(new BorderLayout(10,10));
		JButton btn1=new JButton("북");
		this.add(btn1,BorderLayout.NORTH);
		JButton btn2=new JButton("남");
		this.add(btn2,BorderLayout.SOUTH);
		JButton btn3=new JButton("서");
		this.add(btn3,BorderLayout.WEST);
		JButton btn4=new JButton("동");
		this.add(btn4,BorderLayout.EAST);
		JButton btn5=new JButton("center");
		this.add(btn5,BorderLayout.CENTER);
		
		setSize(250,250);
		setVisible(true);//화면에 보이게
		
	}
	public static void main(String[] args) {
		new Border01();
	}

}
