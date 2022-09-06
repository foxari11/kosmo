package chaptor04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*
		 나이(age) 가 08세미만이면 : "취학 전 아동입니다." 
		                            "입장료는 <1000> 원 입니다.
		 나이(age) 가 14세미만이면 : "초등학생입니다."
		                            "입장료는 <2000> 원 입니다.
		 나이(age) 가 20세미만이면 : "중,고등학생 입니다."
		                            "입장료는 <2500> 원 입니다.
		 나이(age) 가 20세이상이면 : "일반인 입니다."
		                            "입장료는 <3000> 원 입니다.                         
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요. >>>");
		
		 int age = sc.nextInt();
		 int prise = 0;


		
		if (age <= 07) {prise = 1000;
			System.out.printf("취학전 아동입니다." + "입장료는" + "%d" + "원 입니다.",prise );
		    }else if (age <= 13) {prise = 2000;  
			System.out.printf("초등학생입니다.  " +  "입장료는" + " %d" +"원 입니다", prise);
		    }else if (age <= 19) {prise = 2500;  
			System.out.printf("중,고등학생입니다.  " +  "입장료는" + " %d" +"원 입니다", prise);
		    }else if (age >= 20) {prise = 3000;  
			System.out.printf("일반인입니다.  " +  "입장료는" + " %d" +"원 입니다", prise);
			}
		
		sc.close();
	}

}
