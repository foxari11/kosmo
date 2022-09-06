package chaptor04.EX05;

import java.util.Scanner;

public class Using_while02b {

	public static void main(String[] args) {
		// "그만! " 할때까지 정수값을 넣어서 합계와 평균을 출력
		// string..을 인트로..
		// String s = sc.nextline();
		//  s.splite(" ");
		// 문자형 String 을 정수형으로 변환 ,Inter.PerseInt()
		// 합계와 평균을 구하면 됩니다 
		Scanner sc = new Scanner (System.in);
		String s;
		s = sc.nextLine();
		do {
			System.out.println("정수 값을 넣으셈");
		
		if (s.equals("그만")) {break;}
		String[] arr;
		arr = s.split(" ");
		
		int b; // 각종목의 구성원을 담는 변수
		int sum= 0; // 각 종목의 구성원 합을 담는 변수
		int count =0; // 각 종목을 카운트 하는 변수
		for (int i= 0; i < arr.length; i++) {
			
		    b = Integer.parseInt(arr[i]);
		    sum +=b;
		    count++;
		}
		
		System.out.println("입력된 정수는 : " + count + " 개입니다. ");
		System.out.println("입력된 정수의 합은 : " + sum + "입니다.");
		System.out.println("평균은 : " + sum / (double)count);
		
		}while (true);
		System.out.println("프로그램 종료");
		
		
	}

}
