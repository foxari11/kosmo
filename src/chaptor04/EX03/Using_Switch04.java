package chaptor04.EX03;

import java.util.Scanner;

public class Using_Switch04 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("몇월은 몇일까지??  >>>");
		int month = sc.nextInt();
		
		int day= 0 ;

		
		switch (month) {
		case 3 : case 5 : case 1 : case 8: case 10: case 7: case 12:
			day = 31;
			break;
		case 9 : case 6: case 4: case 11:
			day = 30;
			break;
		case 2 :
			day = 28;
			break;
        default :
        	System.out.println("존재하지 않는 달입니다.");

		}
		System.out.printf(  "%d" + "월은"   +  "%d" + " 일 입니다.",month , day );
		
	}

}
