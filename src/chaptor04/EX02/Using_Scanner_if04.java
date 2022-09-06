package chaptor04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		// 에스프레소,카페라떼,아보카도주문할 경우 가격이 3,500원
		// 아메리카노는 2,500원
		// 그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴 입니다.
		
		//출력 : 주문하신 < 에스프레소 > 는 가격이 < 3,500>원입니다.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문할 커피 메뉴를 고르세요 >>>");
		System.out.println("==========================");
		System.out.println("에스프레소 카페라떼 아보카도 아메리카노");
		String order = sc.next();
		int a = 3500;
	    int b = 2500;

		
		if(order.equals("아메리카노")){
			System.out.printf("당신이 주문 한 커피는 : " +  order  + " 이며" + " %d" +"원 입니다", b);
		    }else if (order.equals("카페라떼")||order.equals("에스프레소")||order.equals("아보카도"))  {
			System.out.printf("당신이 주문 한 커피는 : " +  order  + " 이며" + " %d" +"원 입니다", a);
			}else { 
				System.out.println("우리 매장에는 없는 메뉴입니다.");
		}
		
		sc.close();
	}

}
