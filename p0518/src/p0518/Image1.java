package p0518;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Image1 extends JFrame {
	Image1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Image연습");
		setSize(500,500);
		setVisible(true);
		
		this.setLayout(new FlowLayout());
		ImageIcon img1=new ImageIcon("image/java1.png");//image폴더를 만든 후 경로설정
		ImageIcon img2=new ImageIcon("image/java2.png");//폴더는 프로젝트 밑에
		
		JButton btn1=new JButton("안녕",img1);
		this.add(btn1);
		
		JLabel lb1=new JLabel("레이블1 입니다.");
		JLabel lb2=new JLabel(img2);
		this.add(lb1);
		this.add(lb2);
		
		JCheckBox ch1=new JCheckBox("c++");
		JCheckBox ch2=new JCheckBox("Java");
		JCheckBox ch3=new JCheckBox("c#",true);
		this.add(ch1);
		this.add(ch2);
		this.add(ch3);
		
		JRadioButton rd1=new JRadioButton("고래");//radio 하나만 선택 가능
		JRadioButton rd2=new JRadioButton("상어");
		JRadioButton rd3=new JRadioButton("새우");
		this.add(rd1);
		this.add(rd2);
		this.add(rd3);
	
		ButtonGroup gr=new ButtonGroup();//그룹으로 묶어야지 하나만 선택가하게 된다
		gr.add(rd1);
		gr.add(rd2);
		gr.add(rd3);
	}
	
	public static void main(String[] args) {
		new Image1();

	}

}
