package basic1;

import java.util.Scanner;

public class EX02_control2 {

	public static void main(String[] args) {
		System.out.println("학번을 입력");
		Scanner input = new Scanner(System.in);			// 인풋 값 콘솔에 넣으려고 
						
		String id = input.nextLine();
		
		String a = id.substring(0,4);	// aa = 입학년도 ex 1998
		
		int aa = Integer.parseInt(a);
		
		char ccc= id.charAt(4);
		
		
		String b = id.substring(5,7);
		
		int bb = Integer.parseInt(b);
		
		System.out.printf(id + " 는 "+ a + " 년도에 입학한 ");
		
		if (ccc == '1') {
		    System.out.print("공대");
			if (bb == 11) {
				System.out.printf("컴터 ");
			}else if (bb == 12){
				System.out.printf("소프트");
			}else if (bb == 13) {
				System.out.printf("모바일");
			}else if (bb == 22) {
				System.out.printf("자바");
			}else if (bb == 33) {
				System.out.printf("서버");
			}
		}
		
		if (ccc == '2') {
			if (bb == 11) {
				System.out.printf("사회대 사회학과 ");
			}else if (bb == 12){
				System.out.printf("사회대 경영학과");
			}else if (bb == 13) {
				System.out.printf("사회대 경제학과");
			}
	
		
		
	}
		System.out.printf("학생입니다");
}
}	