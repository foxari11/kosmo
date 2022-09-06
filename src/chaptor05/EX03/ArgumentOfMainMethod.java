package chaptor05.EX03;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		
		
		// main Method 의 입력 매개변수 전달 하기 , 메소드(객체 지향 언어) = 함수 
		//      - 메소드 (함수) 의 형식  : 리턴 타입 메소드명 (입력 매개 변수) { 실행부 } 
		//                                         void main(String[] args){ 실행부 }
		
		
		// 메인 메소드의 입력 매개 변수 ars[i] 값을 받아서 각 변수에 할당
		
		// 안녕하세요 3 5.8          <== String [] args
		String a = args[0];        // 안녕하세요           args[0]
		String b = args[1];        //  3                args[1]
		String c = args[2];        //  5.               args[2]
		
		// 출력 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		// 연산 (String)   : + (연결 연산자) 
		System.out.println(b + 1);   // 3 (String) + 1 (int)  = 31 (String)
		System.out.println(c + 1);   // 5.8 (String) + 1 (int)  = 5.81 (String) 
		System.out.println("===================");
		
		
		// 숫자 형식으로 되어있는 String = > 정수형이나 더블형으로 바꿔야 됨 
                           // Integer.parseInt(String 변수) 
		                   // Double.parseDouble(String 변수)

		// 연산 (형변환후 연산)
		int d = Integer.parseInt(b);    // b <== 문자형 3
		double e = Double.parseDouble(c); // c <== 문자형 5.8
		
		System.out.println(d);   // 정수 3 
		System.out.println(e);   // 실수 5.8
		System.out.println("===================");
		
		
		System.out.println(d + 1);    // 정수 + 정수  // 4가 출력
		System.out.println(e + 1);    // 실수 + 정수  // 6.8 출력 
		System.out.println("===================");
		
		 
		
	}

}
