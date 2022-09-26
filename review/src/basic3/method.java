package basic3;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char k = sc.nextLine().charAt(0);
		boolean a =checkLower(k);
		

	}

	static boolean checkLower(char k) {
		if ('a'<= k && k<= 'z') {
			System.out.println("true");
			return true;
		}else if ('A'<= k && k <= 'Z') {
			System.out.println("false");
			return false;
		}else 
			System.out.println("잘못된입2력");
			return false;


	}



}


