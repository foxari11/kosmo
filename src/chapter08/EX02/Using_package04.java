package chapter08.EX02;

//import 시 * 를사용하는 경우 : 해당 패키지의 모든 클래스를 import
			// 하위의 패키지는 적용되지 않는다.
			// * : 패키지의 모든 클래스만 적용. 
import chapter08.EX01.*; 		// 
public class Using_package04 {

	public static void main(String[] args) {	
		
		// A 클래스 객체 생성 
		
		A a = new A();
//		B b = new B();    //외부 클래스에서 접근 불가 (default)
		C c = new C();
//		D d = new D();    //오류 발생 comm 하위의 패키지는 import가 적용되지 않는다.
		

	}

}
