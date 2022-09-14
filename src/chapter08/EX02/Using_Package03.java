package chapter08.EX02;

//import 사용하지 않고 외부 패키지 접근  : 클래스의 전체 이름을 사용 (패키지명 + 클래스명)
	// A 클래스 (public) (접근 o) , B클래스(default) (접근 x) 

public class Using_Package03 {

	public static void main(String[] args) {
		
		chapter08.EX01.A a = new chapter08.EX01.A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		

		a.print();
	}

}
