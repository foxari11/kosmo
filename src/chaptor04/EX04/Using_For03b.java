package chaptor04.EX04;

import java.util.Scanner;

public class Using_For03b {

	public static void main(String[] args) {
		// for 문 내의 if
		// 정수 ( 음수, 양수) 을 스캐너로 5개 인풋 받아서
		// 양수만 더한 값과 평균값을 출력 하세요.
		Scanner sc = new Scanner (System.in);
		

		int sum = 0;   //양수만 더함
		int count = 0; //양수를 카운트 하는 변수
		
		System.out.println(" 숫자를 쓰시오");
		for(int i = 0;  i<5; i++) { 
		 int n = sc.nextInt();   sum += n;
		  if (n > 0);{
			   // 양수 받은 모든 수를 더함 
			  count++; //양수일때 1증가 
			}
			} 
		 
		System.out.println("양수 합계는 : " +sum + "평균은 : " + sum / (double)count );

		
		
		
		
		
		sc.close();
		
	}

}
