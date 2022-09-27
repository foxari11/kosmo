package c_sample;

import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EventTest3 {
	JFrame f;
	JButton bt;
	JButton bAdd;

	EventTest3(){
		f = new JFrame("메렁");
		bt = new JButton("확인");
		bAdd = new JButton("메렁");
		// (1) 이벤트 핸들러 만들기
		// (2) 핸들러 객체 생성
		// (3) 이벤트 발생할 컴포넌트와 연결 
		bt.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트발생3");
			}
		});

	} 




	public void addLayout() {

		f.setLayout(new FlowLayout());
		f.add(bt);
		f.add(bAdd);




		// basic 설정 
		f.setBounds(100,100,600,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}







	public static void main(String[] args) {
		EventTest3 et = new EventTest3();
		et.addLayout();

	}

}
