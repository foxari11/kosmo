package chapter07.EX01;



public class Using_Method03 {
    //인스턴스 필드 : 객체화 해야만 사용가능
	int c;          //인스턴스 필드 : static 키가 붙지 않는 필드
	int d;
	
	//스태틱 필드 : 객체화 하지 않고 바로 사용 가능 
	static int e;
	static int f;
	
	
	//인스턴스 메소드 : 객체화 해야만 사용가능 
	void abc() {
		System.out.println("abc() 메소드 호출");
		
	}
	
	//static 메소드 
	static void def() {
		System.out.println("def() 메소드 호출 ");
	}
	//Static 메소드 내부에 인스턴스 필드나, 메소드를 바로 사용할수 없다. (객체화 시켜야 사용가능)
	   // 
	
	public static void main(String[] args) {
		// main 메소드도 method 이다.
		int a ;           // 지역 변수이다. <== Stack 에 저장, Stack영역을 강제 초기화가 안됨.
		                      // Stack에 값이 저장, main () 메소드 내에서만 사용됨.
		 a= 10;
		System.out.println(a); // 초기값 넣지 않으면 오류 
		
		
         //main 메소드 내부의 메소드 선언 불가 , 메소드는 클래스 블락에서 선언되어야 함.
	/*	void abc () {
			System.out.println("안녕하세요");
		} */
		
		// 필드명 , 메소드명 앞에 stactic 키가 적용되어 있으면 객체 생성 없이 사용 
		// static 메소드 내에서는 인스턴스 필드나 , 인스턴스 메소드를 사용할 수 없다. 
		// static 메소드 내에서는 static 필드나, static 메소드를 사용 할 수 있다. 
		
		// c = 5;          //인스턴스 필드 // 오류 발생(static 메소드 내부에서 인스턴스 필드 직접호출 (x) )
		e = 10;         //직접 호출(같은 클래스내 직접 호출, static 필드 호출)
		
		// abc();			//인스턴스 메소드 (오류 발생)
		def();			//static  메소드  (직접 호출) 
		
		
	}

}
