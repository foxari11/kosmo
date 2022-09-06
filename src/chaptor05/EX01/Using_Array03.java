package chaptor05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		// 한국을 빛낸 5명의 위인들 s 라는 String 배열에 저장 후 4가지 출력
		
		
		String [] s = new String[5];


		
		s[0] = "을지문덕";
		s[1] = "이순신";
		s[2] = "세종대왕";
		s[3] = "율곡이이";
		s[4] = "유관순";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(s[i]);

		}
		
		for ( int i= 0; i <s.length; i++) {
			System.out.println(s[i]);
		}
		
		for (String k : s) {
			System.out.println(k);
			
		}
		
		System.out.println(Arrays.toString(s));
		
	}

}
