package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX04_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int kor[] = new int [5];
		
		
		System.out.println(kor.length+" 명의 국어점수를 입력하세요. (ex 10/20/30)");
		String inputData = input.nextLine();
		StringTokenizer st = new StringTokenizer(inputData, "/");
		for(int i=0; st.hasMoreTokens(); i++) {
			String str = st.nextToken();
			kor[i] = Integer.parseInt(str);
			sum += Integer.parseInt(str);
		}
		
		
		for(int i=0; i<kor.length; i++) {
			System.out.println(i+ " 번 학생의 점수:"+kor[i]);
		}
		
		System.out.println("합계는" + sum + " 평균운" + sum/5);
	}

}
