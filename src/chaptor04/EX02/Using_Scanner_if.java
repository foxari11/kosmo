package chaptor04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {
  public static void main(String[] args) {
	  // 문제 : Scanner로 국어(aa)점수, 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다.
	  // if문을 사용해서 평균이 90점 이상이면 "A 학점", 80점 이상은 : "B 학점"
	  // 70점 이상: C학점, 60이상: D학점 나머지는 F
	  Scanner sc = new Scanner(System.in);
	      
		 int aa = sc.nextInt();
		 int bb = sc.nextInt();
		 int cc = sc.nextInt();
		 int dd = sc.nextInt();
		 int ee = sc.nextInt();
		 
		 double ff = (aa + bb + cc + dd + ee)/5.0;
		 System.out.printf("당신의 평균 점수는 %4.1f \n", ff);
		 
		 if (ff >= 90) {                
		    System.out.println("A학점입니다.");
		 }else if (ff >= 80) {            
	        System.out.println("B학점입니다.");
	     }else if (ff >= 70) {              
	    	System.out.println("C학점입니다.");
	     }else if (ff >= 60){
	        System.out.println("D학점입니다.");
	     }else {
	    	 System.out.println("F학점입니다.");
	   	 }
	  
	 sc.close(); // 객체 제거 . 
	
}
}
