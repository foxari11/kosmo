package chaptor05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1 ~ 500 까지 3의 배수를 배열안에 저장
		// 출력 : 1. 직접 출력, 2. for 출력, 3.Enhanced for, 4. toString()
		// 합계 구하기 까지 
		
		int []a = new int[166];

		for (int i =0,j=3; i < a.length; i++ , j +=3) { // i는 배열 번수의 번호이다. j는 변수 
	    	 a[i] = j;
	    	 
	    	 System.out.println(j);

		}
	    	 System.out.println("=================");
	    	 

		for (int k : a);{
			for (int k =0,j=3; k < a.length; k++ , j +=3) {
				 a[k] = j;
				System.out.println(j);

			}
		}
		
		for (int k =0,j=3; k < a.length; k++ , j +=3)
		a[k] = j;
		
		
		
		System.out.println(Arrays.toString(a));
		
		
		int sum =0;
		System.out.println("출력정보===========");
        
		for (int i = 0, k =3 ; i < 166; i++, k+=3) {
			 if (k <= 500) {
			a[i] = k;
			sum += k;
			 }
		}	
			 System.out.println("합계는" +  sum  + "평균은" + sum/(double) a.length);
			
		 		
			
		
			
		
		// 합계구하기 답안 
	
 /*
	    	 
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum / (double) 166);
		
		*/
		
		}
}
