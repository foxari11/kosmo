package chaptor05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		// 1 ~ 1000 까지 배열 (arr) 에 저장후
		
		// 1. 배열 선언
		
		// 2. [입력] for 문을 사용해서 arr 배열 변수에 값을 할당 
		
		// 3. [출력] for 문을 사용해서 arr 배열 변수의 값을 출력
		
		// 4. [출력] Enhanced For 문을 사용해서 값을 출력
		
		// 5. [출력] Arrays.toString(arr) 출력
		
		
        // <11시 까지>
		
		int arr [] = new int [1000];   // 1. 배열 선언
		
		for (int i = 1 ; i < arr.length ; i++) {   // 2. 변수 값 할당
			
			arr[i] = i;
			
			System.out.println(i + " "); // 3. [출력] for 문을 사용해서 arr 배열 변수의 값을 출력
		} 
		


		
		
		for (int k : arr) {            // 4. [출력] Enhanced For 문을 사용해서 값을 출력
			System.out.println(k + " ");
		}
		
		
		System.out.println(Arrays.toString(arr));  // 5. [출력] Arrays.toString(arr) 출력
		
		
		
		
		
	}

}
