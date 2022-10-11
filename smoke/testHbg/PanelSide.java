package testHbg;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSide extends JPanel {
	
	MainTest parent;

	// 1. 멤버변수 선언
	JButton[] bts;		// 반복문 사용을 위해 버튼을 배열로 선언
	String[] menu = new String[] {"달콤초코볼", "공룡치킨", "치즈감자", "팝콘볼", "매콤김떡만", "베이컨에그랩"};
	int[] price = new int[] {3000, 4000, 3500, 3500, 4500, 5000};
	
//	ArrayList<MenuVO> list = new ArrayList<MenuVO>();

	// 2. 멤버변수 객체 생성(생성자 안에서)
	public PanelSide (MainTest mainTest) {
		parent = mainTest;

		// 버튼의 개수를 지정
		bts = new JButton[6];

		// 버튼 배열 안에 버튼 생성
		for ( int i = 0; i < bts.length; i++) {
			bts[i] = new JButton(menu[i]);									// 버튼 생성
			bts[i].setHorizontalTextPosition(JButton.CENTER);				//텍스트 정렬
			bts[i].setVerticalTextPosition(JButton.BOTTOM);
			bts[i].setIcon(new ImageIcon("testImg/sideImg/"+ i +".png"));	// 이미지 삽입
			bts[i].setBackground(new Color(255, 255, 255));					// 배경 색 설정
		}




		// 메서드 실행
		addLayout();
		eventProc();
	} // PanelHbg() 생성자 함수

	// 3. 화면 구성 및 출력
	void addLayout() {
		// 패널의 화면 구성
		setLayout(new GridLayout(2, 3, 10, 10));

		// 버튼 삽입
		for ( int i = 0; i < bts.length; i++) {
			add(bts[i]);
		}
	} // addLayout()
	void eventProc() {
		
		// 메뉴 버튼이 눌렸을 때
		for ( int i = 0; i < bts.length; i++ ) {
			String convert = Integer.toString(i);
			bts[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MenuVO menu = new MenuVO(bts[Integer.parseInt(convert)].getText(), price[Integer.parseInt(convert)]);
					parent.list.add(menu);
					selectAll();
					parent.sumPrice += price[Integer.parseInt(convert)];
					payment();
				}
			});

		} // for문
	} // eventProc()
	// 장바구니 출력을 위한 데이터 저장
	void selectAll() { 
		parent.shoppingcartMenuTA.setText("---------------선택한 메뉴---------------\n");
		parent.shoppingcartPriceTA.setText("----------가격----------\n");
		for (MenuVO vo: parent.list) {
			parent.shoppingcartMenuTA.append(vo.getMenu()+"\n");
			parent.shoppingcartPriceTA.append(Integer.toString(vo.getPrice())+"\n");
		}
		
	} // selectAll()
	
	// sum 텍스트필드에 메뉴 개수와 총 결제 금액을 출력하는 함수
	void payment() {
		parent.sum.setText("주문한 메뉴의 개수: " + parent.list.size() + "\t" + "총 결제 금액: " + parent.sumPrice + "원");
	}
	

}
