package b_info;

import java.awt.*;
import javax.swing.*;


public class InfoView {
	
	// 1. 멤버 변수 선언
	JFrame f;
	JTextField tfName,tfId,tfTell,tfGender,tfAge,tfHome;
	JTextArea ta, ta1;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	
	// 2. 멤버 변수 객체 생성
	
	InfoView(){
		f = new JFrame("오늘 할일");
		bAdd = new JButton("add");
		bShow = new JButton("show");
		bSearch = new JButton("search");
		bDelete = new JButton("delete");
		bCancel = new JButton("cancel");
		bExit = new JButton("exit");
		ta = new JTextArea(10,10);
		ta1 = new JTextArea(100,50);
		tfName = new JTextField("");
		tfId = new JTextField("minsuzzang");
		tfTell = new JTextField("01030303030");
		tfGender = new JTextField("남");
		tfAge = new JTextField("27");
		tfHome = new JTextField("경기도안양");
		
	}

	// 3. 화면 구성하고 출력
	
	//  전체 프레임 BorderLayout 지정 - WEST , CENTER(ta) , SOUTH
	//  버튼 만들려면 JPanel 붙이기  ( south)(GridLayout(1,6))
	//   west도 패널 (GridLayout(6,2))
	
	public void addLayout() {
		f.setLayout(new BorderLayout());
		JPanel pWest1 = new JPanel();
		
		f.add(ta        ,BorderLayout.CENTER);
		JPanel pWest = new JPanel();
		f.add(pWest    ,BorderLayout.WEST);
		pWest.setLayout(new GridLayout(6,2));
		pWest.setPreferredSize(new java.awt.Dimension(250, 200));
		pWest.add(new JLabel("Name",JLabel.CENTER));
		pWest.add(tfName);
		pWest.add(new JLabel("ID",JLabel.CENTER));
		pWest.add(tfId);
		pWest.add(new JLabel("Tel",JLabel.CENTER));
		pWest.add(tfTell);
		pWest.add(new JLabel("Gender",JLabel.CENTER));
		pWest.add(tfGender);
		pWest.add(new JLabel("Age",JLabel.CENTER));
		pWest.add(tfAge);
		pWest.add(new JLabel("Home",JLabel.CENTER));
		pWest.add(tfHome);
		JPanel pSouth = new JPanel();
		f.add(pSouth    ,BorderLayout.SOUTH);
		pSouth.setLayout(new GridLayout(1,6));
		pSouth.setPreferredSize(new java.awt.Dimension(50, 40));
		
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);


		
		f.setBounds(100,100,600,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		InfoView info = new InfoView();
		info.addLayout();
		

	}

}
