package chaptor04.EX03;

import java.util.Scanner;

public class Using_Switch02b {

	public static void main(String[] args) {
		// 		// switch 문으로 처리""
		// 에스프레소,카페라떼,아보카도주문할 경우 가격이 3,500원
		// 아메리카노는 2,500원
		// 그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴 입니다.
		
		//출력 : 주문하신 < 에스프레소 > 는 가격이 < 3,500>원입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 메뉴를 골라주세요.");
		System.out.println("=====================");
		System.out.println("아메리카노 에스프레소 카페라떼 아보카도");
		
		String order = sc.next();
		
		switch(order) {
		case "아메리카노" :
		System.out.printf("주문하신 커피는 " + order + "이며 " + "%d" + " 원 입니다.", 2500);
		break;
		case "에스프레소" :  case "카페라떼" : case "아보카도" :
		System.out.printf("주문하신 커피는 " + order + "이며" + "%d" + " 원 입니다." , 3500);
		break;
		default :
			System.out.println("그런 메뉴는 없다.");
		
 		}
		
		
		
		}

	}


