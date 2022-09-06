package chaptor03.EX05;

public class LocalOperator {

	public static void main(String[] args) {
		// 논리 연산자(&& <AND>  , || <OR> , ^ <XOR>, ! <NOT> )
		// -- 연산자 좌측과 우측에는 true , false가 와야함.
		// AND 연산 : &&  <== 좌우 모두 true 일때 true
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(true && 5<3); // false
		System.out.println(5<=5 && 7>2); // true
		System.out.println("==========-----===");
		
		
		//OR 연산 : ||  <= 좌우 중 하나만 true 면 true
		
		System.out.println(true || true); //true
		System.out.println(true || false ); // true
		System.out.println(false || 5<3 ); // false
		System.out.println(5<=5 || 7>2 ); // true
		System.out.println("====================");
		
		//XOR 연산 : ^ <== 좌우 中 동일할 때 False , 다르면 true
		
		System.out.println(true ^ true); //false
		System.out.println(true ^ false ); // true
		System.out.println(false ^ 5<3 ); // false
		System.out.println(5<=5 ^ 7>2 ); // false
		
		System.out.println("====================");
		
		//NOT 연산 : ! <== 반대로 출력, false 이면 true, true이면 false
		
		System.out.println(!true ); //false
		System.out.println(!false ); // true
		System.out.println(false || ! (5<3) ); // true
		System.out.println(5<=5 || ! (7>2) ); // true
		
		System.out.println("================");
		
		//비트 연산자로 논리 연산을 수행 
		System.out.println(true&true); //true
		System.out.println(true & false); //false
		System.out.println(true | 5<3 );// true
		System.out.println(5<=5 | 7>2); // true
		
		System.out.println("=============");
		
		//숏 서킷 (short circuit) :
		//  -- 왼쪽의 결과 값만으로 오른쪽의 값을 실행하지 않는 것.
		//  -- 논리 연산자에서만 작동됨(&&,||,^,!) , 비트연산자(&,|,^,~)에서는 작동이 안됨

		//AND 연산에서 숏 서킷이 발생되는 에제
		//논리연산에서는 short circuit이 발생됨
		int value1 = 3;
		System.out.println(false && ++value1 > 6); //숏 서킷 작동
		System.out.println(value1 );
		
		
		//비트연산은 short circuit이 발생 안됨
		int value2 = 3;
		System.out.println(false & ++value2 > 6 );// 숏 서킷이 안돼ㅠㅠ
		System.out.println(value2);

		//OR연산에서 숏 서킷이 발생되는 에제
		int value3 = 3;
		System.out.println(true || ++value3>6);
	    System.out.println(value3);
	    
		int value4 = 3;
		System.out.println(true | ++value4>6);
	    System.out.println(value4);
	
	
	
	
	
	}   

}
