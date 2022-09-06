package chaptor04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		
		/*
		
		for ( 초기값 ; 조건 ; 증가값 ) {
		     실행문1;              <== 조건이 참 일동안 계속 반복, 거짓이면 for 문을 빠져나옴
		     
		}
		
		*/
		
		//기본 for 문
		int a ;
		for (a = 0 ; a < 3 ; a++) {     //초기값; 조건; 중간값; 
         System.out.println(a);
         // 0 1 2
	}
		System.out.println("====================");
		//초기값과 증가값에는 ,로 구분해서 여러개의  변수가 올 수 있다.
		
		int b , c , d;
		for ( b=0, c=10, d=20; b < 5; b++, c+=2, d+=5) { // b : 1씩 증가, c : 2씩 증가 , d : 5씩증가)
			//  b:1씩 증가, c:2씩증가, d:5씩증가 
			System.out.println("b : " + b + " c : " + c + " d :" + d);
		
		}
		
		
		System.out.println("=====================");
		
		
		// for 문에서 무한 루프 ( 조건이나 , 증가값을 잘못 설정하면 무한루프 )
		int e;
		for ( e = 0; e < 10; e += 3) {
	    System.out.println(e);          // 조건이 true일 동안 반복
		// 0 3 6 9 
		} 
		
		System.out.println("========for문 없이  : 1 ~ 10까지 덧셈=============");
		// 1부터 10까지 for 문 없이 덧셈
		
		int sum1 = 0;
		sum1 +=1; // sum1 = sum1 + 1   
		sum1 +=2; // sum1 = sum1 + 2
		sum1 +=3; // sum1 = sum1 + 3
		sum1 +=4; // sum1 = sum1 + 4
		sum1 +=5; // sum1 = sum1 + 5
		sum1 +=6; // sum1 = sum1 + 6
		sum1 +=7; // sum1 = sum1 + 7
		System.out.println(sum1); // 28 
		sum1 +=8; // sum1 = sum1 + 8
		sum1 +=9; // sum1 = sum1 + 9
		sum1 +=10; // sum1 = sum1 + 10
		System.out.println("1~10까지의 합: " + sum1);
		

		
	    //for 문을 사용해서 1~10까지 합계 
	    
	    int sum2;
	    int i ; 
	    for ( i = 1 , sum2 = 0 ; i <=10; i++) {sum2 += i ; }
	    System.out.println("sum2 : " + sum2 + ", i :" + i );     
	    
	 
	     System.out.println("1부터 10까지의 합계 : " + sum2);
	     
	     System.out.println("==================");
	     
	     //for 문을 사용해서 0 ~ 1000까지 7의 배수의 합계 
	     // 7의 배수의 합계 : 000
	     
	     int sum3;
	     int k ;
	     for (k =7, sum3 = 0; k<1000; k+= 7) {sum3 += k;}
	     System.out.println("1~1000까지의 7의 배수 합계: " + sum3);
	     
	     //for 문과 if문을 사용해서 1~10까지 더한 값을 출력 하되 아래와 같이 출력하세요.
	     // 결과 : 1+2+3+4+5+6+7+8+9+10 = 55
	    
	     System.out.println("===================");


			int j;
			int sum4;
			System.out.print("합계는 ");
			for ( j = 1, sum4 =0; j <=10; j++) {
				sum4 += j; 
	        if (j<10){
				System.out.print(j + "+" );
			}else {			
				System.out.print(j+ "="+ sum4 );
			}
			} 
	    /*
			<강사님 답안>
			 int sum4 = 0
			 for (int ii=1; ii <=10; ii++ {
			 sum4 +=ii;
			 System.out.print(ii);
	         if ii <= 9 {
	           System.out.println("+");
	         }else {
	        	 System.out.println(" = ");
	        	 System.out.println(sum4);
	        	 
	         }


	    
		*/
			
			
			
}
}