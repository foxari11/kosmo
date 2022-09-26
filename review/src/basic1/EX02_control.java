package basic1;

import java.util.Calendar;
import java.util.Scanner;

/* 
 *  제어문 : 프로그램 흐름을 변경하기 위해 
 * 		1) if
 * 		2) switch
 * 		3) for
 * 		4) while / do while
 * 
 * 		5) break / continue 
 */


public class EX02_control {

	public static void main(String[] args) {
		
		String id = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민 입력 ==> ");
		id = input.nextLine();
		char sung = id.charAt(7);
		System.out.println(sung);
		
		
		// sung 변수에 문자가 1이거나 3이거나 9라면 남자 출력
		// 그렇지 않으면 여자를 2이거나 4이거나 0이라면 여자 출력
		
		
		if (sung =='1' | sung == '3' |sung== '9') {
			System.out.println("남자");
		}else if (sung == '2' || sung =='4' || sung =='0') {
		System.out.println("여자");
		}

		char chool = id.charAt(8);
		System.out.println(chool);
		switch(chool) {
		case '0' :
		System.out.printf("서울");
		break;
		case '1':
		System.out.printf("인천");
		break;
		case '2' :
		System.out.printf("경기");
		break;
		case '3' :
		System.out.printf("제주");
		break;
		}
		System.out.printf("출신");
		
		System.out.println();
		
		String nai = id.substring(0,2);	// sunai = "96" 
		// 문자열 - > 정수 변환
		int sunai = Integer.parseInt(nai); // age = 96
		
		int age = 0;
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		if(sung == '3' || sung == '4') {
			age = year - (2000 + sunai) + 1;
		}
		else if(sung == '1' || sung == '2') {
			age = year - (1900 + sunai) + 1;
		}
		
		System.out.println(age);
		
		switch(sung){
		case '1': case '2' :
			age = year - (1900 + sunai) + 1;
			break;
		case '3': case '4':
			age = year - (2000 + sunai) + 1;
		}
		
		System.out.println(age);
	
		
		
	}
	
}