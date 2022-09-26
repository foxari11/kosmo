package basic1;
/*
 * 
 * 반복문 : for / while / do while 
 * 
 * (1) for (초기치; 조건문; 증가치;){
 * 		반복구문
 * 		}
 */

public class Ex03_for개념 {

	public static void main(String[] args) {
		
		//	1) 1부터 10까지 숫자출력
		for(int i = 1; i<5; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 1; i<11; i++){
			sum += i;
		}
		System.out.println(sum);
		int sum1 = 0;
		for(int i =1; i<11; i+=2) {
			sum1 += i;
		}
		System.out.println(sum1);
		/*
		
			System.out.println();
		// 2) 'A' 부터 'Z' 까지 출력
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (char ch = 'a'; ch <= 'z'; ch+=2) {
			System.out.print(ch);
		}
		System.out.println();
		for (char ch = 'z'; ch >= 'a'; ch--) {
			System.out.print(ch);
		}
		*/
	}

}
