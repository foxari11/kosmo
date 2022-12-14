package chapter07.EX02;   

// class 외부에 올 수 있는 것 : 패키지, 임포트(같은 패키지에 존재하지 않는 클래스) , 외부클래스 

class A { //클래스 : 객체를 생성하기 위한 설계도  
	
	//클래스 내부에 올 수 있는 것 : 1. 필드 (클래스에서 선언된 변수) ,2. 생성자, 3. 메소드, 4.이너클래스
    // 1. 필드
	int m ; //Heap 공간에 저장 , 강제초기화
	int n ;
	double k; //0.0
	String l; //null
	
	
	//생성자 : 클래스는 반드시 생성자가 존재해야 한다. 특징: 1.클래스 이름과 동일 , 2.리턴이 존재할 수 없다.
	//        기본생성자는 생략 될 수 있다.   
	// 리턴 값이 있으면 int, double ... , 리턴값 없으면 void
	// 객체 생성시 생성자 호출
	// 객체 초기값을 셋팅 
	// 클래스 내부의 다른 생성자가 존재할 시 컴파일러가 기본 생성자를 자동으로 만들어 주지 않는다.
	A(){
		System.out.println("기본 생성자 호출");
	}
	
	
	
	void work1 () {
		System.out.println("work1 메소드 호출");
	}
	
	//work2(정수 정수)
	int work2 (int a , int b) {                 //지역변수 : 메소드 블락에서 선언된 변수, Stack에 값이 저장
		                                        // 메소드가 종료되면 없어짐.
		System.out.println("work2 메소드 호출");
		
		return a + b;
	}
	
	//work3(정수 더블 문자열)
	double work3 (int a, double b, String c) {
		System.out.println("work3 메소드 호출");
	    System.out.println(a + " , " + b + ", " + c);
		return a+b;
	    
	}
	
	String work4 (String a) {
		
		return a; 
	}
	
	
	
}



public class Using_Object {

	public static void main(String[] args) {
		// 객체 생성 : Main method 에서 생성 
		
		A a1 = new A();
		//A  : 클래스
		//a1 : 객체 
		//new: 객체를 생성해라, Heap 에 객체를 생성해라
		//A(): 클래스 내부의 생성자 호출, 기본 생성자: 입력 매개 변수가 없는 생성자; 생략될 수 있다.
		
		//객체의 필드값 출력
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
        System.out.println("===========");
		
		//객체 필드값 수정
		a1.m = 10;
		a1.n = 20;
		a1.k = 30.0;
		a1.l = "안녕하세요";
		
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		System.out.println("==========");
		
		//메소드 호출 (work1())
		
		a1.work1();      //매개변수가 없는 메소드 
		//메소드 호출 (work2 (정수,정수)
		
		int k = a1.work2(10, 20);
		System.out.println(k);
		System.out.println(a1.work2(40, 50)); // 매개변수가 2개인 메소드 호출 << return a+b;
		
		System.out.println("===============");
		//메소드 호출(work3 (정수, 더블 , 문자열) - 리턴 double
		
		double d = a1.work3(10, 20.3, "오늘");
		System.out.println(d);
		System.out.println("===================");
		System.out.println(a1.work3(30, 30.2, "날씨"));
		
		System.out.println(" =================");
		
		//메소드 호출 (work4 (문자열)            -리턴 String
		
		
		String s = a1.work4("졸라배고파");
		System.out.println(s);
		System.out.println("=================");
		System.out.println(a1.work4("진짜루"));
		
		
		// 클래스 : 객체를 생성하기 위한 설계도
		// 객체   : 클래스를 기반으로 만들어진 인스턴스 (객체) <== Heap 에 로드됨.
		// 인스턴스화 : 클래스는 객체화 해야 사용 가능 하다. A a = new A();
		
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		
		
		
	}

}
