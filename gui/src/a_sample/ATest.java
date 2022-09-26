package a_sample;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

/*
	자바의 GUI (화면)
	- AWT : 1.2 이전
	- Swing : 1.2 이후
				대부분 클래스 앞에 J 
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ATest {

	JFrame f;
	JButton btn,btn2;
	JCheckBox cbJava, cbOracle;
	JRadioButton ra;
	JRadioButton ra2;
	JTextField jf;
	JTextArea jt;
	
	
	ATest(){
		f = new JFrame("나의 첫장");
		btn = new JButton("클릭");
		btn2 = new JButton("취소");
		cbJava = new JCheckBox("자바");
		cbOracle = new JCheckBox("오라클");
		ra = new JRadioButton("남자");
		ra2 = new JRadioButton("여자",true);
		ButtonGroup group = new ButtonGroup();
		group.add(ra);
		group.add(ra2);
		jt = new JTextArea(10,10);
		jf = new JTextField(20);
	}
	
	void addLayout() {
//		f.setLayout(new FlowLayout());	//한줄에 배치
//		f.setLayout(new GridLayout(3,3));	// 행, 열에 배치
		f.setLayout(new BorderLayout());	// 동서남북 가운데 배치 
		
		//붙이기 작업
//		f.add(cbJava);
//		f.add(cbOracle);
		f.add(btn 		,BorderLayout.NORTH);
		f.add(btn2		,BorderLayout.SOUTH);
		JPanel pEast = new JPanel();
		pEast.add(ra);
		pEast.add(ra2);
		f.add(ra		,BorderLayout.EAST);
		f.add(ra2		,BorderLayout.EAST);
		f.add(new JLabel("입력하세요")				,BorderLayout.WEST);
		f.add(jt		,BorderLayout.EAST);
//		f.add(jf		,BorderLayout.CENTER);
		
		f.setBounds(100,100,500,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		ATest a = new ATest();
		a.addLayout();
		

	}

}
