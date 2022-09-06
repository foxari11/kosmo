package chapter02.EX11;

public class Char_type {

	public static void main(String[] args) {
		// char 데이터 타입 : 하나의 문자만 저장, 문자
		//     - 문자,숫자, 유니코드로 저장 할 수 있다. 
		//     - ' ' 를 사용해서 저장 
        //     - 2문자 이상 넣을 수 없다. 그 이상 쓰면 String 으로 여러문자 사용		
		
		// 유니코드(2byte) : 전 세계의 모든 문자를 16진수로 표기
		
		//1. 문자로 저장하는 방법
		char value1 = 'A'; // 'AA'하면 오류
		char value2 = '가';
		char value3 = '3'; // 숫자 3이 아닌 문자 3 
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(" = = = = = = = =");
		
		//2. 정수로 저장하는 방법 
		char value4 = 65;     //A  <== 65에 해당
        char value5 = 0xac00; //0x <== 16진수를 표현, 가 <== 0xac00 
		char value6 = 51;     // 3, <== 51
		
		System.out.println(value4);
	    System.out.println(value5);
		System.out.println(value6);
		System.out.println("====================");
		
		//3. 유니코드 형식으로 저장 (\\u ==> 유니코드); ' '를 사용해서 넣는다.
		
		char value7 = '\u0041';   // A
		char value8 = '\uac00';   // 가
		char value9 = '\u0033';   // 3 
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		System.out.println("===================");
		
		
		char value100 = 35; // # <== 35
		System.out.println(value100);
		char value101 ='\uac12';
		System.out.println(value101); // 값 <==ac12 
		
				
		
		char a01 = '\uac15';
		char a02 = '\uBBFC';
		char a03 = '\uC218';
		
		char a = 'A'; // A <== 65
		char b = 65;  // 정수로 저장 10진수
		char c = 0b100001;   //0b 뒤에 오는 값이 2진수이다
	    char d = 00101;      //0 뒤에 오는 값이 8진수
        char e = 0x0041 ;    //0x 뒤에 오는 값은 16진수 
        char f = '\u0041';   //유니코드로 값 할당 
        
	    
		System.out.println(a); // A <== 65
		System.out.println(b); // 정
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.printf("%s%s%s" , a01,a02,a03 );
		
		
		
	}

}
