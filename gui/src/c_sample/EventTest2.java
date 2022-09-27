package c_sample;

import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EventTest2 {
	JFrame f;
	JButton bt;
	
	EventTest2(){
		f = new JFrame("메렁");
		bt = new JButton("확인");
		
	  // (2) 핸들러 객체 생성
	  // (3) 이벤트 발생할 컴포넌트와 연결 
		bt.addActionListener(new MyHandler());
					
	} // (1) 이벤트 핸들러 만들기
	  //     핸들러 - 이벤트 처리 클래스 
	class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "이벤트발생2");
		}
	}
	
	
	public void addLayout() {
		
		f.setLayout(new FlowLayout());
		f.add(bt);
		
		
		
		
		// basic 설정 
		f.setBounds(100,100,600,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		EventTest2 et = new EventTest2();
		et.addLayout();
		
	}

}
