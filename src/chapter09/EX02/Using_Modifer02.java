package chapter09.EX02;

import chapter09.EX01.A;

// A클래스와 다른 패키지에 존재하는 클래스 : import를 사용

public class Using_Modifer02  {

	public static void main(String[] args) {
		
		// import 됨
		A a = new A ();

		// 필드 접근
		System.out.println(a.a); 	// public		//다른 패키지에서 접근됨
//		System.out.println(a.b);	// protected: 다른 패키지에서 접근할 경우 상속관계 //다른 패키지 접근(상속
//		System.out.println(a.c);    // default <접근 불가>
//		System.out.println(a.d);	// private <접근 불가>
		
		//메소드 접근
		a.print1(); 	// public 
//		a.print2();		// protected < 접근 불가 > , 상속이 적용 안되어 있음.
//		a.print3(); 	// default
//		a.print4();		// private 
		
		System.out.println("-상속 관계 객체 출력(D)-");
		D d = new D();
		d.print();
		
		
	}

}
