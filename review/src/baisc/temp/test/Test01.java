package baisc.temp.test;

import java.awt.Frame;

public class Test01 {
	
	Frame f;

	Test01(){
		f = new Frame("메렁");
	}
	void addLayout() {
		f.setBounds(100, 100, 300, 260); // x좌표, y좌표, 가로, 세로 
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Test01 t1 = new Test01();
		t1.addLayout();
	}

}
