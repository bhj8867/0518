package p0518;

import java.awt.*;

import javax.swing.*;

public class Combo1 extends JFrame {
	Combo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("combo");
		this.setLayout(new FlowLayout());
		String[] pet = { "고양이", "강아지", "토끼", "거북이", "두루미" };
		setSize(200, 200);
		setVisible(true);
		JList list = new JList(pet);
		this.add(list);
		JComboBox cb = new JComboBox(pet);
		this.add(cb);
	}

	public static void main(String[] args) {
		new Combo1();

	}

}
