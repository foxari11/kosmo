package chapter10.EX02;

class Aa {
	int a = 10;
}
class Bb extends Aa {
	int b = 20;
}
class Cc extends Bb {
	int c = 30;
}
class Dd extends Bb{
	int d = 40;
}


public class Using_PolyMorphsim01_1 {

	public static void main(String[] args) {
		// 다형적 표현
		Aa a = new Aa ();			// 타입 : Aa, 객체 : Aa()
		System.out.println(a.a);	
		Bb b1 = new Bb ();			// 타입 : Bb, 객체 : Bb() 
		System.out.println(b1.a);	// 상속
		System.out.println(b1.b);	// 자신
		// 자식 객체를 생성시 부모 타입으로 지정하면 부모의 필드와 메소드만 접근이 됨.
		// = 좌 , 우는 타입이 같아야 한다. 
		//        업캐스팅 : 자식 타입을 부모 타입으로 변환 (자동으로 컴파일러가 넣어줌)
		Aa a2 = new Bb();			// 타입 : Aa, 객체 : Bb()
									// B는 A이다 (0) 
		System.out.println(a2.a);
//		System.out.println(a2.b);
		
		// 다운캐스팅 : 부모 타입을 자식 타입으로 변환 (수동으로 명시) 
		
		Bb b2 = (Bb) a2;
		System.out.println(b2.a);	//Aa필드
		System.out.println(b2.b);	//Bb필드 
		
		
		// 업캐스팅 : 자동으로 적용됨, 명시하지 않더라도 컴파일러가 자동으로 등록
		Aa a3 = b2; 	//Aa a3 = (Aa) b2;
		System.out.println(a3.a);
//		System.out.println(a3.b);	
		
		
		//다운캐스팅 
		Bb b3 = (Bb) a3;		//Aa 타입을 가진 a3 객체를 Bb 타입의 b3 객체로 다운캐스팅
		System.out.println(b3.a);
		System.out.println(b3.b);
		
		System.out.println("==================================================");
		//Dd 객체를 생성하면서 Aa 타입으로 업캐스팅 
			// Aa 의 필드와 메소드만 접근됨 
		Aa a5 = new Dd ();
		System.out.println(a5.a);
//		System.out.println(a5.b);
//		System.out.println(a5.d);
		
		Bb b10 = (Bb) a5;
		System.out.println(b10.a);
		System.out.println(b10.b);
		//a5를 Bb 타입으로 다운캐스팅
		Dd d10 = (Dd) b10;
		System.out.println(d10.a);
		System.out.println(d10.b);
		System.out.println(d10.d);
		
		//Aa 타입의 a5를 Dd 타입으로 다운 캐스팅
		Dd d11 = (Dd) a5;
		System.out.println(d11.a);
		System.out.println(d11.b);
		System.out.println(d11.d);
		
		
		// 업캐스팅
		
		Aa a20 = d11;
		
	}

}
