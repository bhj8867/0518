package p0518;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exam01 extends JFrame{
	Exam01(){//생성자로 실행
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창을 닫을때 프로세스닫고 메모리삭제 ,부하 줄여주기위해
		setTitle("GUI연습");
		
		//버튼을 만들기전 레이아웃 지정-임포트
		this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));//창크그게 맞춰 자동으로 버튼 정렬,왼정렬,간격20px
		JButton bt1=new JButton("버튼1");//버튼 생성-import
		this.add(bt1);//창에 버튼을 부착시키는 명령
		JButton bt2=new JButton("버튼2");//
		this.add(bt2);
		JButton bt3=new JButton("버튼3");
		this.add(bt3);
		JButton bt4=new JButton("버튼4");
		this.add(bt4);
		JButton bt5=new JButton("버튼5");
		this.add(bt5);
		
		JTextField tx1= new JTextField(20); 
		this.add(tx1);//J는 스윙
		setSize(500,500);
		setVisible(true);
		
		
		setSize(500,500);//픽셀
		setVisible(true);//트루로 해야 setSize 창 크기가 보임
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam01();//생성자함수 호출
	}

}
