package chapter07.EX01;
// 원의 지름을 넣었을 때 전체 넓이를 객체를 생성 후 출력 
// 피자 반지름 : 10 
// 도넛 반지름 : 5 
// <피자>의 넓이는 <00> 입니다.
// 도넛의 넓이는 00 입니다.

class F{
	int koo;
	String name;
	

	F (int koo, String name){
		this.koo = koo;
		this.name= name;
		
	}
	
	void lee () {
		double area = 3.14 * koo * koo;
		System.out.println(name + "의 넓이는" + area + "입니다. ");
	}
	
	void roo () {
		
	}
}

public class Using_Method02b {

	public static void main(String[] args) {
		
		F a = new F(7,"피자");
	    a.lee();
	    
		F 두넛 = new F(5, "도넛");
	    두넛.lee();
	    

	}

}
