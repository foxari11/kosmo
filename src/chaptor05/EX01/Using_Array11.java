package chaptor05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        // 탁구, 야구, 축구, 농구, 씨름
		// 각 운동 종목의 구성원 수를 합산 값
		// 1. sc.nextLine(); 인풋 받는다. 
		// 2. s.splite(" "); <== 공백을 기준으로 잘라서 배열에 저장 
		// 3. 문자형 String 을 정수형으로 변환 , Inter.perseInt() 
		// 4. 합계와 평균을 구하면 됩니다.
		String s ;
		String arr [];
	
		
		
		do {System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요>>>>");
		s = sc.nextLine();
		int b = 0; // 구성원 수 
		int sum = 0; // 구성원 합
		int count = 0; // 카운트 
		arr = s.split(" ");
			for ( int i = 0 ; i < arr.length ; i++) {
				if ( i %2 != 0) {
					b = Integer.parseInt(arr[i]);
					sum += b;
					count ++;
				}}	
			if(s.equals("그만")) {
				break;
			}
	    System.out.println("구성원의 합계: " + sum );	
		System.out.println("구성원의 평균:"  + sum / (double)count);
		}while(true);		
		System.out.println("프로그램을 종료");
	}

}
