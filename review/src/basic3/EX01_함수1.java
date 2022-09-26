package basic3;

import java.util.Scanner;

public class EX01_함수1 {

	public static void main(String[] args) {
	}
	//(문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면
	//	대문자로 변환하여 반환하고 대문자라면 그대로 반환하는
	/*	메소드를 작성하시오. 

	함수명 : checkUpper

	인자 : char

	리턴(반환) : char
	*/
	Scanner sc = new Scanner(System.in);
	char k = sc.nextLine().charAt(0);
	char a = checkLower(k);
	
	
	static char checkLower(char k) {
		if ('a'<= k && k<= 'z') {
			System.out.println();
			return k;
		}else if ('A'<= k && k <= 'Z') {
			System.out.println("false");
			return k;
		}else 
			System.out.println("잘못된입2력");
			return k;


	}



}



