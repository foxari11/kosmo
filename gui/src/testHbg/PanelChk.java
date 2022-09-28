package testHbg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.tools.javac.Main;

import b_info3.PersonVO;
import e_tabbedpane2.MainTest;

public class PanelChk extends JPanel {
	


	JButton cBtn1 = new JButton("간장마늘싸이순살",new ImageIcon("src\\testHbg\\imgs\\1.PNG"));
	JButton cBtn2 = new JButton("군옥수수뿌치싸이순살",new ImageIcon("src\\testHbg\\imgs\\2.PNG"));
	JButton cBtn3 = new JButton("맘스양념싸이순살",new ImageIcon("src\\testHbg\\imgs\\3.PNG"));
	JButton cBtn4 = new JButton("치즈뿌치싸이순살",new ImageIcon("src\\testHbg\\imgs\\4.PNG"));
	JButton cBtn5 = new JButton("치파오싸이순살",new ImageIcon("src\\testHbg\\imgs\\5.PNG"));
	JButton cBtn6 = new JButton("핫치즈싸이순살",new ImageIcon("src\\testHbg\\imgs\\6.PNG"));
	
	
	ArrayList <FoodVO>list = new ArrayList<FoodVO>();
    
    
    MainTes parent;
    
    
    


	public PanelChk(MainTes i){
		
		parent = i;
		
		setBackground(new Color(255, 255, 255));	//RGB (Red, Green, Blue)
		addLayout();
		eventProc();
		cBtn1.setHorizontalTextPosition(JButton.CENTER);
		cBtn1.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn2.setHorizontalTextPosition(JButton.CENTER);
		cBtn2.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn3.setHorizontalTextPosition(JButton.CENTER);
		cBtn3.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn4.setHorizontalTextPosition(JButton.CENTER);
		cBtn4.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn5.setHorizontalTextPosition(JButton.CENTER);
		cBtn5.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn6.setHorizontalTextPosition(JButton.CENTER);
		cBtn6.setVerticalTextPosition(JButton.BOTTOM);
		

		
	}
	
	

		void addLayout() {
		setLayout(new BorderLayout());
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(2,3,10,10));
		pCenter.setPreferredSize(new java.awt.Dimension(350, 300));//크기조절
		add(pCenter    ,BorderLayout.CENTER);
		pCenter.add(cBtn1);
		pCenter.add(cBtn2);
		pCenter.add(cBtn3);
		pCenter.add(cBtn4);
		pCenter.add(cBtn5);
		pCenter.add(cBtn6);
		// 치킨 버튼6 
		
		
		
		
	}
	


	void eventProc() {
		
		cBtn1.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				JOptionPane.showMessageDialog(null, "1번 치킨 추가?");
				add();
			}
		});
		cBtn2.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				JOptionPane.showMessageDialog(null, "2번 치킨 추가?");
				add2();
			}
		});
		cBtn3.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				JOptionPane.showMessageDialog(null, "3번 치킨 추가?");
				add3();
			}
		});
		cBtn4.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				JOptionPane.showMessageDialog(null, "4번 치킨 추가?");
				add4();
			}
		});
		cBtn5.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				JOptionPane.showMessageDialog(null, "5번 치킨 추가?"); 
				add5();
			}
		});
		cBtn6.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				JOptionPane.showMessageDialog(null, "6번 치킨 추가?");
				add6();
			}
		});


	}
	
	public void add() {
		
		parent.shoppingcart.setText("간장마늘싸이순살는 6000원입니다.");
		parent.sum.setText("6000원");
		
	}
	public void add2() {

		parent.shoppingcart.setText("간장마늘싸이순살는 6500원입니다.");
		parent.sum.setText("6500원");
	}
	public void add3() {

		parent.shoppingcart.setText("간장마늘싸이순살는 7000원입니다.");
		parent.sum.setText("7000원");
	}
	public void add4() {

		parent.shoppingcart.setText("간장마늘싸이순살는 7500원입니다.");
		parent.sum.setText("7500원");
	}
	public void add5() {

		parent.shoppingcart.setText("간장마늘싸이순살는 8000원입니다.");
		parent.sum.setText("8000원");
	}
	public void add6() {

		parent.shoppingcart.setText("간장마늘싸이순살는 8000원입니다.");
		
	}
	


	
	
}
