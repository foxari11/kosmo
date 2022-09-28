package b_info3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class InfoView {

	// 1. 멤버 변수 선언
	JFrame f;
	JTextField tfName,tfId,tfTell,tfGender,tfAge,tfHome;
	JTextArea ta, ta1;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	ArrayList <PersonVO>list = new ArrayList<PersonVO>();
	

	// 2. 멤버 변수 객체 생성

	InfoView(){
		f = new JFrame("오늘 할일");
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit(alt + x)",new ImageIcon("src\\b_info2\\imgs\\1.PNG"));
		ta = new JTextArea(10,10);
		ta1 = new JTextArea(100,50);
		tfName = new JTextField("");
		tfId = new JTextField("");
		tfTell = new JTextField("");
		tfGender = new JTextField("");
		tfAge = new JTextField("");
		tfHome = new JTextField("");
		bExit.setHorizontalTextPosition(JButton.CENTER);
		bExit.setVerticalTextPosition(JButton.BOTTOM);
		bExit.setRolloverIcon(new ImageIcon("src\\b_info2\\imgs\\2.PNG") );
		bExit.setPressedIcon(new ImageIcon("src\\b_info2\\imgs\\3.PNG"));
		bExit.setToolTipText("프로그램을 종료할거 ㅋ");
		bExit.setMnemonic('x');
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

	public void eventProc() {

		tfId.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				getJuminInfo();
			}
		});

		

		bCancel.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				clearTextField();
			}
		});

		bAdd.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				inputData();
				clearTextField();
				selectAll();
			}
		});
		bShow.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				selectAll();
			}
		});
		// 그냥 search만 
		bSearch.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				selectByTel();
			}
		});
		// 전화번호 텍스트필드 엔터.
		tfTell.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				selectByTel();
			}
		});
		bDelete.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				deletePerson();
				clearTextField();
				selectAll();
			}
		});
		bExit.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
			
			}
		});


	}

	public void inputData() {
		
		PersonVO so = new PersonVO ();
		
		so.setName(tfId.getText());
		so.setId(tfName.getText());
		so.setTell(tfTell.getText());
		so.setGender(tfGender.getText());
		so.setHome(tfHome.getText());
		so.setAge(Integer.parseInt(tfAge.getText()));

		list.add(so);
		

	}
	
	public void selectAll() {
		ta.setText("--목록--\n\n");
		for(PersonVO so : list) {
			ta.append(so.toString());
		}
		
	}
	/* 함수명 : selectByTel
	 * 인자 	: 없음
	 * 리턴값 : void
	 * 역할	: 
	 */
	
	public void selectByTel() {
		// 입력한 전화번호 값 얻어오기
		String searchTell = tfTell.getText();
		// 입력받은 전화 번호 공백이면 전화번호 입력 메세지 출력
		if(searchTell.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력하세요");
			return;	//제어권 통제 ㅋㅋ 
		}
		//리스트 저장된 PersonVO의 전화번호와 비교하여 
		// 해당 전화번호가 있으면 그 내용을 각각의 텍스트필드에 출력
		for(PersonVO so : list) {
			if (searchTell.equals(so.getTell())) {
				tfName.setText(so.getName());
				tfGender.setText(so.getGender());
				tfHome.setText(so.getHome());
				tfId.setText(so.getId());
				tfAge.setText(Integer.toString(so.getAge()));
			}
		}
	}
	
	public void deletePerson() {
		String deleteTell = tfTell.getText();
		
		
		for(PersonVO so : list) {
			if (deleteTell.equals(so.getTell())) {
				list.remove(so);
				break;
			}
		}
		
		
		
	}
	

	public void getJuminInfo() {

		String jumin = tfId.getText();
		if(jumin.length() < 14) {
			JOptionPane.showMessageDialog(null, " - 포함한 15자를 맞춰");

		}else {
			JOptionPane.showMessageDialog(null, "추가완료");
		}

		if(jumin.charAt(8) == '1'  | jumin.charAt(8) == '3' | 
				jumin.charAt(8) == '9') {
			tfGender.setText("남자");
		}else if (jumin.charAt(8) == '2' || jumin.charAt(8) =='4' || 
				jumin.charAt(8) =='0') {
			tfGender.setText("여자");
		}

		char chool = jumin.charAt(8);
		switch(chool) {
		case '0' :
			tfHome.setText("서울");
			break;
		case '1':
			tfHome.setText("안양");
			break;
		case '2' :
			tfHome.setText("광주");
			break;
		case '3' :
			tfHome.setText("부산");
			break;

		}
		String nai = jumin.substring(0,2); // 주민 번호 0부터 2미만 까지 잡아줌
		int sunai = Integer.parseInt(nai); // string을 인트로 
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int suna = year - (2000 + sunai) + 1;
		String ko = Integer.toString(suna);
		int sona = year - (1900 + sunai) + 1;
		String ko1 = Integer.toString(sona);


		if(jumin.charAt(8) == '3' || jumin.charAt(8) == '4') {
			tfAge.setText(ko);

		}
		else if(jumin.charAt(8) == '1' || jumin.charAt(8) == '2') {
			tfAge.setText(ko1);

		}

	}

	public void clearTextField() {
		ta.setText(null);
		tfGender.setText(null);
		tfHome.setText(null);
		tfAge.setText(null);
		tfTell.setText(null);
		tfId.setText(null);
		tfName.setText(null);

	}

	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();


	}

}
