package basic2;

import java.util.Scanner;

public class Ex04_성적 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum =0;
		int kor[] = new int [5];
		for(int i =0; i<kor.length; i++) {
			System.out.println(i + "번 학생의국어 점수 입력");
			kor[i] = input.nextInt();
			sum += kor[i];
		}
		for(int i=0; i<kor.length; i++) {
		System.out.println(i+ " 번 학생의 점수: " + kor[i]);
		}
		System.out.println("총점은 " + sum + " 평균은" + sum/5);
	
		
	}

}		
