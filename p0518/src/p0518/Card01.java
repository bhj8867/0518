package p0518;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.*;//Frame대신*


public class Card01 extends JFrame{

	Card01(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CardLayout 예제");
		setSize(250,250);
		setVisible(true);
		
		this.setLayout(null);//레이아웃이 없는 배치,창의 크기와 상관없이 항상 같은 자리에 위치 
		
		JButton btn1=new JButton("버튼1");
		this.add(btn1);
		btn1.setBounds(50, 50, 70, 60);///setbounce:값을 지정
		
		JButton btn2=new JButton("버튼2");
		this.add(btn2);
		btn2.setBounds(80, 80, 70, 60);
		
		JButton btn3=new JButton("버튼3");
		this.add(btn3);
		btn3.setBounds(110, 110, 70, 60);
		
	}
	public static void main(String[] args) {
		
		new Card01();
	}

}
