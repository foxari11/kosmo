package basic4;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String y = "";
		CalculatorExpr a = new CalculatorExpr();
		int count = 0;

		while(true) {	
			System.out.println("숫자 2개를 입력하세요");
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			a.setNum1(input1);    //set 쓰는법 왜 까먹음?
			a.setNum2(input2);
			if (count > 0) System.out.println("값은"+ input1 + "와" + input2);
			a.output();
			System.out.println("계속 할거니?");
			y = sc.next();
			if (y.equalsIgnoreCase("N")) {
				break;
			}
			count++;
		
		}System.out.println("프로그램 종료");
		}
	}





