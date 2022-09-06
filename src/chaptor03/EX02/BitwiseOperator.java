package chaptor03.EX02;

public class BitwiseOperator {

	public static void main(String[] args) {
		//bit 연산
		//자바 메서드를 사용해서 진법 변환 (2진수, 8진수, 16진수)
		int data = 13;

		
		//Integer 객체의 함수를 사용    (총 32bit, 4byte, int)
		// -- toBinarystring(입력값) : 10 ==> 2
		
		System.out.println(Integer.toBinaryString(data)); // 정수를 2진수로 출력 
		System.out.println(Integer.toOctalString(data)); // 정수를 8진수로 출력
		System.out.println(Integer.toHexString(data));   // 정수를 16진수로 출력
	    System.out.println("=========================");
	    
	    //2진수 , 8진수, 16진수의 값을 10진수로 변환 
	    
	    System.out.println(Integer.parseInt("1101",2)); // 2진수를 10진수로 변환
	    System.out.println(Integer.parseInt("15",8)); // 8진수를 10진수로 변환
	    System.out.println(Integer.parseInt("d",16)); // 16진수를 10진수로 변환
	    System.out.println("==================================");
	    
	    //다양한 진법 표현 
	    
	    System.out.println(13);
	    System.out.println(0b1101);  // 0b 2진수  
	    System.out.println(0015);     // 0 8진수 
	    System.out.println(0xd);     // 0x 16진수
	    
	    //비트연산자 And : &  <== 두 비트 모두 1일때 1 
	    System.out.println(3 & 10);  // 2
	    System.out.println(0b0011 &0b1010); // 2
	    System.out.println(0x03 & 0x0A); // 2
	    System.out.println("=====================");
	    
	    //비트연산자 Or : | (|를 파이프라고 부름) <== 두비트 中 하나라도 1존재시 1 
	    System.out.println(3 | 10);
	    System.out.println(0b0011 | 0b1010);
	    System.out.println(0x03 | 0x0a);
	    System.out.println("=====================");
	    
	   
	    //비트연산자 XOR : ^ <== 두비트가 동일할때 0 틀리면 1 
	    System.out.println(3^10);
	    System.out.println(0b0011 ^ 0b1010);
	    System.out.println(0x03^0x0a);
	    System.out.println("==========================");
	    
	    
	    //비트연산자 NOT : ! <== 두비트가 동일할때 1 틀리면 0
	    System.out.println(~3);
	    System.out.println(~0b0011);
	    System.out.println(~0x03);
	    
	    System.out.println(~100);
	    System.out.println("==========================");
	    
	    int abc = 123;          //10진수
	    int bcd = 0123;         //8진수
	    int efg = 0x123;        //16진수
	    		
	    System.out.println("==========================");
	    
	    System.out.println(abc);
	    System.out.println(bcd);
	    System.out.println(efg);
	   
	    
	    System.out.println("==========================");
	    System.out.println(192 & 168 & 100 & 100);  // 2
	    System.out.println(0b0011 &0b1010);         // 2
	    System.out.println(0x03 & 0x0A);            // 2
	    System.out.println("=====================");
	    
	    
	    String data2 = "SS";
	    
	    System.out.println(data2 + "ss ");

	    
	} 

}
