package chaptor04.EX05;

import java.util.Scanner;

public class Using_while02 {

	public static void main(String[] args) {
		// "그만! " 할때까지 정수값을 넣어서 합계와 평균을 출력
		// string..을 인트로..
		// String s = sc.nextline();
		//  s.splite(" ");
		// 문자형 String 을 정수형으로 변환 ,Inter.PerseInt()
		// 합계와 평균을 구하면 됩니다 
		Scanner sc = new Scanner (System.in);
		
		int count = 0 ;      
		int sum = 0 ;         
		
		System.out.println( "원하는 정수를 입력하세요. 멈춰를 치면 그만합니다.");
		
		String s = sc.next();
		int a = Integer.parseInt(s);
		String [] arr;
		arr = s.split(" ");
		while (a>0) {    
		sum += a;            
		count++;              
		
		if (s.equals("멈춰")) { 
			System.out.println("멈췄읍니다.");
			break;
			
			
		}
		}
		System.out.println("입력된 정수는 : " + count + " 개입니다. ");
		System.out.println("입력된 정수의 합은 : " + sum + "입니다.");
		System.out.println("평균은 : " + sum / (double)count);
		sc.close();
		
	
		
		
	}

}
