package chaptor04.EX04;

import java.util.Scanner;

public class Using_For03c {

	public static void main(String[] args) {
		// for 문 내의 if
		// 정수 ( 음수, 양수) 을 스캐너로 5개 인풋 받아서
		// 양수만 더한 값과 평균값을 출력 하세요.
		
	
		
	 Scanner sc = new Scanner (System.in);
	 
	 int sum = 0;
	 int i = sc.nextInt();  
	 int count = 0;
	 
	 for(i =0; i<5; i++);
		if (i <= -1 ) {
			System.out.println(" 사용할수 없습니다.");
			else if (i>0) {
			System.out.println("5개의 수의 평균값은 :" + sum );
				
			}
			
		}

	}

}
