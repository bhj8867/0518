package p0518;

import java.awt.*;

import javax.swing.*;

public class Text1 extends JFrame{
	Text1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("textfiled 예제");
		
		setSize(200,200);
		setVisible(true);
		
		this.setLayout(new FlowLayout());
		JTextField txt1=new JTextField(10);
		JTextArea txt2=new JTextArea(5,10);//5행10열
		
		
		JPasswordField txt3=new JPasswordField(10);
		this.add(txt1);
		this.add(txt2);
		this.add(new JScrollPane(txt2));//txt field txt2 에 스크롤이 생긴다
		this.add(txt3);
		
	}
	
	
	
	public static void main(String[] args) {
		new Text1();
	}

}
