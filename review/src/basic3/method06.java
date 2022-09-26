package basic3;

import java.util.Scanner;

public class method06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		char input = sc.nextLine().charAt(0);
		boolean a = checkLower(input);

	}

	static boolean checkLower(char input) {
		if ( 'a' <= input && input <= 'z') {
			System.out.println("진짜임");      
			return true;
		}else if ( 'A' <= input && input <= 'Z') {
			System.out.println("가짜임");
			return false;
		}else 
			System.out.println("입력 이상");
		return false;
	}



}