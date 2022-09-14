package chapter08.EX02;

import chapter08.EX01.A;
// import chaptor08.EX01.com.A;	// 오류 : 동일한 클래스는 import 할 수 없다.
// import chaptor08.EX01.B;		// 오류발생
public class Using_Package02 {

	public static void main(String[] args) {
		
		// A 클래스는 동일한 패키지 내에 존재하지 않는다. (import를 해서 사용)
		//	-- A class는 접근 제어자가 public, protected (상속) 지정되어 있어야 한다.
		
		System.out.println("=== A클래스 출력 (public) ===");
		A a = new A();

		System.out.println(a.m);	// 다른 패키지에서 접근 (public)
		System.out.println(a.n); 	// 
		
		a.print();
		
		System.out.println("=== B클래스(default)");
		//B 클래스는 다른 패키지에 존재하고, 접근 제어자가 defalut로 할당되어 있다.
		// 외부 패키지
		
//		B b = new B();
		System.out.println("===com.A 클래스 객체 생성 ===");
		chapter08.EX01.com.A aa = new chapter08.EX01.com.A();
		
		System.out.println(aa.aa);
		System.out.println(aa.bb);
		
		aa.print();
		
	}

}
