package chaptor04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/*1 문제
		   스캐너로 "gold" 넣으면 " 금메달 입니다" 출력
		   스캐너로 "Silver" 넣으면 " 은메달 입니다" 출력
		   스캐너로 "Bronze" 넣으면 " 동메달 입니다" 출력
		   그 외 "메달이 없습니다.
		   
		   
		  2. 문제
		  
		   스케너로 월을 인풋받아서 해당월의 총 날짜 
		   
		   " <월> 은 < 몇일> 일까지 있습니다.
		   
		   
		 */
		

		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력해봐  >>>");
		String aa = sc.next();
		
		switch (aa) { 
		case "Gold" :
			System.out.printf("금메달입니다.");
			break;
		case "Silver" :
			System.out.printf("은메달입니다.");
		case "Bronze" :
			System.out.printf("동메달입니다.");
			break;
		default :
			System.out.println("그런 메달은 없어 ㅋ");
			
			
		sc.close();
		
		}
		
	
		
		}


}
