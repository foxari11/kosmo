package chaptor05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		// 스캐너로 인풋받아 임의의 정수 10개 등록 후 
		// 정수 배열 방 10개를 생성하고
		// 임의의 값을 10개에 방에 저장
		// 그 중 최대값을 뽑아서 출력 하는 프로그램을 생성해 보세요.
		// 출력 : 배열방 10개에서 최대값은 : 000
		// 14:10분까지 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자 10 개 를 입력하세요.");
		

		
		/*

		int [] s = new int [10];

		int max = 0;
		for (int i = 0; i <s.length; i++ ) {
                s[i] = sc.nextInt();
			 if (s[i]> max) {s[i] = max;
			}
		}
		
		System.out.println(max);
		*/
		int[]arr = new int[10];
		int max2 = 0;
		int min2 = 0;
		
		
		for (int j = 0 ; j < 10 ; j++) {
			arr[j] = sc.nextInt();
					
		}
		for ( int j = 0 ; j < 10; j++) {
			if (arr[j] > max2) {
				max2 = arr[j];
			}
		}
		for ( int j = 0 ; j < 10; j++) {
			if (arr[j] < min2) {
				min2 = arr[j];
			}
		}
			
			
		
		
        System.out.println(max2);
        System.out.println(min2);
                
                
                
        System.out.println("2번째 방법 Arrays.sort() 사용해서 출력" ); 
        		
        	

        		
        		
        Arrays.sort(arr); // 배열 방의 값을 정렬을 한다.0 (최소값) 1,2,3,4,5,.... arr.length -1 (최대값)
        System.out.println("최대값 : " + arr[arr.length - 1]);
        System.out.println("최소값 : " + arr[0]);

        		
        /////////////함수//////////////////
        System.out.println("==Stream을 사용하는 경우==");
        System.out.println("최대값 :" + Arrays.stream(arr).max().getAsInt());
        System.out.println("최소값 :" + Arrays.stream(arr).min().getAsInt());
        		
	}

}
