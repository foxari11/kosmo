package basic2;

import java.util.Scanner;



public class EX05_성적관리 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		int sum = 0;
		int st[][] = new int [4][];
		

		for(int i =0; i<st.length; i++) {
			System.out.println(i + "학생 점수입력");
			for (int j = 0; j<100 ; j++) {
				System.out.print(st[j]+" : ");
			st[i][j] = input.nextInt();
			}
		}
		for(int i=0; i<st.length; i++) {
		System.out.println(i+ " 번 학생의 국어 점수: " + st[i][0]+ "학생의 국어 점수: " + st[i][1] + "학생의 국어 점수:" + st[i][2]);
		}
		System.out.println(" 총점은 " + sum + " 평균은" + sum/5);
	}
		}
		
	


