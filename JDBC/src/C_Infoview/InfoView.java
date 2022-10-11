package C_Infoview;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class InfoView {

	// 1. 멤버 변수 선언
	JFrame f;
	JTextField tfName,tfId,tfTel,tfGender,tfAge,tfHome;
	JTextArea ta, ta1;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	
	// 비즈니스로직 - 모델단 
	InfoModelImpl model;

	// 2. 멤버 변수 객체 생성

	InfoView(){
		f = new JFrame("오늘 할일");
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancle");
		bExit = new JButton("수정",new ImageIcon("src\\b_info2\\imgs\\1.PNG"));
		ta = new JTextArea(10,10);
		ta1 = new JTextArea(100,50);
		tfName = new JTextField("");
		tfId = new JTextField("");
		tfTel = new JTextField("");
		tfGender = new JTextField("");
		tfAge = new JTextField("");
		tfHome = new JTextField("");
		bExit.setHorizontalTextPosition(JButton.CENTER);
		bExit.setVerticalTextPosition(JButton.BOTTOM);
		bExit.setRolloverIcon(new ImageIcon("src\\b_info2\\imgs\\2.PNG") );
		bExit.setPressedIcon(new ImageIcon("src\\b_info2\\imgs\\3.PNG"));
		bExit.setToolTipText("프로그램을 종료할거 ㅋ");
		bExit.setMnemonic('x');
		
		try {
		model = new InfoModelImpl();
		}catch ( ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	/*
	*
	*
	*/


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
		pWest.setPreferredSize(new java.awt.Dimension(350, 300));
		pWest.add(new JLabel("Name",JLabel.CENTER));
		pWest.add(tfName);
		pWest.add(new JLabel("ID",JLabel.CENTER));
		pWest.add(tfId);
		pWest.add(new JLabel("Tel",JLabel.CENTER));
		pWest.add(tfTel);
		pWest.add(new JLabel("Gender",JLabel.CENTER));
		pWest.add(tfGender);
		pWest.add(new JLabel("Age",JLabel.CENTER));
		pWest.add(tfAge);
		pWest.add(new JLabel("Home",JLabel.CENTER));
		pWest.add(tfHome);
		JPanel pSouth = new JPanel();
		f.add(pSouth    ,BorderLayout.SOUTH);
		pSouth.setLayout(new GridLayout(1,6));
		pSouth.setPreferredSize(new java.awt.Dimension(50, 80));

		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);



		f.setBounds(100,100,1000,550);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}
	void eventProc() {
		bAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertData();
				
			}
		});
		
		bShow.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				 selectALL();
			}
		});
		
		
		bSearch.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				selectByTel();
			}

			
		});
		// 전화번호 텍스트필드에서 엔터쳤을 때 
		tfTel.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				selectByTel();
			}

			
		});
		bDelete.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				deleteByTel();
			}

			

			
		});
		bExit.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				Update();
			}

			

			
		});
		
		
		
	}	// end of eventProc()
	
	 void Update() {
		
		String name = tfName.getText();
		String Gender = tfGender.getText();
		String Home = tfHome.getText();
		String Id = tfId.getText();
		int Age = Integer.parseInt(tfAge.getText());
		String Tel = tfTel.getText();
		

		// (2) 1번 값들을 InfoVO에 저장
		InfoVO vo = new InfoVO();
		
		vo.setName(name);
		vo.setGender(Gender);
		vo.setHome(Home);
		vo.setId(Id);
		vo.setAge(Age);
		vo.setTel(Tel);

		// (3) 모델의 insertInfo() 호출
		try {
			model.Update(vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}
				
	
		// (4) 화면의 입력값들을 지우기 		
		clearText();
	
	
}
	
	
	private void deleteByTel() {
		
			

			
			// (1) 입력한 전화번호 값을 얻어오기
			String tel = tfTel.getText();
			
			// (2) 모델단에 deleteByTel() 호출
			try { model.delete(tel);
			 ta.setText(" ---지운횟수 -- " );
			// (3) 화면 지우고 
			
			clearText();
		}catch(Exception ex) {
			ta.setText("삭제 실패 : " + ex.getMessage());
		}
		
		
	}
		
	
	
	private void selectByTel() {
		try {
			
			// (1) 입력한 전화번호 값을 얻어오기
			String tel = tfTel.getText();
			// (2) 모델단에 selectByTel() 호출
			InfoVO vo = model.selectByTel(tel);
			// (3) 받은 결과를 각각의 텍스트필드에 지정(출력)
			tfName.setText(vo.getName());
			tfGender.setText(vo.getGender());
			tfHome.setText(vo.getHome());
			tfId.setText(vo.getId());
			tfAge.setText(Integer.toString(vo.getAge()));
			tfTel.setText(vo.getTel());
			
		}catch(Exception ex) {
			ta.setText("전화번호 검색 실패 : " + ex.getMessage());
		}
		
		
	} // end of selectByTel()

	 void selectALL() {
		 try {
			 ArrayList<InfoVO> data = model.selectALL();
			 ta.setText(" --- 검색결과 --- \n\n");
			 for(InfoVO vo : data) {
				 ta.append(vo.toString());
				 
			 }
			model.selectALL();
		} catch (SQLException e) {
			ta.setText("검색실패 : " + e.getMessage());
		}
		
	}
	 
	


	void insertData() {
		// (1) 사용자 입력값 얻어오기
		String name = tfName.getText();
		String Gender = tfGender.getText();
		String Home = tfHome.getText();
		String Id = tfId.getText();
		int Age = Integer.parseInt(tfAge.getText());
		String Tel = tfTel.getText();
		

		// (2) 1번 값들을 InfoVO에 저장
		InfoVO vo = new InfoVO();
		
		vo.setName(name);
		vo.setGender(Gender);
		vo.setHome(Home);
		vo.setId(Id);
		vo.setAge(Age);
		vo.setTel(Tel);

		
	
		// (3) 모델의 insertInfo() 호출
		try {
			model.insertInfo(vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}
				
				
		// (4) 화면의 입력값들을 지우기 		
		clearText();
		
	}
	
	
	
	void clearText() {
		tfName.setText(null);
		tfGender.setText(null);
		tfHome.setText(null);
		tfId.setText(null);
		tfAge.setText(null);
		tfTel.setText(null);
		
		
	}
	
//		public void eventProc() {
//		
//		tfId.addActionListener(new ActionListener()  {
//			public void actionPerformed(ActionEvent f) {
//				getJuminInfo();
//			}
//		});
//		
//		tfId.addFocusListener(new FocusListener(){
//			public void focusGained(FocusEvent e) {
//				
//			}
//			public void focusLost(FocusEvent e) {
//				getJuminInfo();
//			}
//			
//		}); // end of addFocusListener
//		
//		bCancel.addActionListener(new ActionListener()  {
//			public void actionPerformed(ActionEvent f) {
//				clearTextField();
//			}
//		});
//		// 'ADD' 버튼이 눌렀을 때 텍스트 필드에 입력한 사용자 값들을 저장 
//		bAdd.addActionListener(new ActionListener()  {
//			public void actionPerformed(ActionEvent f) {
//				inputData();
//			}
//		});
//		bShow.addActionListener(new ActionListener()  {
//			public void actionPerformed(ActionEvent f) {
//				JOptionPane.showMessageDialog(null, "메렁");
//			}
//		});
//		bSearch.addActionListener(new ActionListener()  {
//			public void actionPerformed(ActionEvent f) {
//				JOptionPane.showMessageDialog(null, "메룽");
//			}
//		});
//		bDelete.addActionListener(new ActionListener()  {
//			public void actionPerformed(ActionEvent f) {
//				JOptionPane.showMessageDialog(null, "메러러러");
//			}
//		});
//		bCancel.addActionListener(new ActionListener()  {
//			public void actionPerformed(ActionEvent f) {
//				JOptionPane.showMessageDialog(null, "메루루루");
//			}
//		});
//		bExit.addActionListener(new ActionListener()  {
//			public void actionPerformed(ActionEvent f) {
//				JOptionPane.showMessageDialog(null, "메릿");
//			}
//		});
//		
//		
//		}




	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();

	}

}
