package chaptor04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		// 점수(score)와 학년(year)을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
		// 4학년인 경우 70점 이상이면 합격 
		
		
		  Scanner sc = new Scanner(System.in);
	      
			 int score = sc.nextInt();
			 int year = sc.nextInt();
			 
			 if (score >= 60) {                
			 if (year != 4  ) {
				 System.out.println("합격입니다."); // 4학년 아니면 60점 이상 합격
			  }else if ( score >= 70) {
				 System.out.println("합격입니다."); // 4학년이고 70이상 합격
			  }else { 
			     System.out.println("불합격입니다."); //4학년이고 70미만 불합
			  }
			  }else {	
			   	 System.out.println("불합격"); // 60점 미만 1,2,3,4 불합 
			   	 
			 
			 }

			 
			 
			 sc.close();

		   	 }
		  

}
