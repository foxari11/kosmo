package chaptor07.EX03;


class AA {
	
	int a;
	int b;
	int c;
	int d;
	String name;
	
	
	//생성자 
	// 1. 기본 생성자 
	
	AA  () {
		System.out.println(" 기본 생성자 호출");
	}
	
	AA (int a){
		this.a =a;
	}
	
	AA (int a, int b){
		this.a =a;
		this.b =b;	
	}
	AA (int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	AA (int a, int b, int c, int d){
		this.a =a;
		this.b =b;
		this.c =c;
		this.d =d;
	}
	AA (int a, int b, int c, int d, String e){
		this.a =a;
		this.b =b;
		this.c =c;
		this.d =d;
		name = e;
	}
	
	
	void show() {
		System.out.println(" a: " + a + " b : " + b + " c: " + c + " d : " + d);
		System.out.println(" name : " + name);
		
	}		
}

public class Using_Constructor02 {

	public static void main(String[] args) {
		// Constructor (생성자) 오버로딩 
		
		//객체 생성
		System.out.println("========");
		AA aa1 = new AA();
		aa1.show();
        System.out.println("========");
		
		//매개변수 1개인 기본 생성자 호출 
	    AA aa2 = new AA(10);
	    aa2.show();
	    System.out.println("========");
		
	    
	    //매개변수 2개인 생성자 호출 
	    
	    AA aa3 = new AA(10,20);
	    aa3.show();
	    System.out.println("========");
	    
	    //매개변수 3개인 생성자 호출
	    
	    AA bb1 = new AA(10,20,30);
	    bb1.show();
	    System.out.println("========");
	    
	    //매개변수 4개인 생성자 호출
	    AA bb2 = new AA(10,20,30,40);
	    bb2.show();
	    System.out.println("========");
	    
	    //매개변수(이름값포함)
	    AA bb3 = new AA(10,20,30,40," 길동이 ") ;
	    bb3.show();
	    System.out.println("========");
	   
	    
	    
	}

}
