package basic2;

import java.util.Scanner;

/*
 * for 		 : 	반복횟수가 정해진 경우
 * while 	 :  횟수를 모르는 경우
 * do ~ while:	횟수를 모르는 경우 ( 조건을 나중에 비교 ) 
 * 
 */

public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력받아서 해당 단의 구구단을 출력
		
		System.out.println("구구단의 단수를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		System.out.println(" ======for======");
		for(int j = 1; j < 10 ; j++) {
		System.out.println(i + " * " + j + " = " + i * j);
		}
		System.out.println();
		
		System.out.println(" ======while======");
		int j = 0;
		while( j < 9) {
			j++;	
			System.out.println(i + " * " + j  + " = " + i *j );
		}
		
		System.out.println(" ======do while======");
		int k =0;
		do {
		 k++;
		System.out.println(i + " * " + k + " = " + i * k);
		}
		while(k<9);
		
		
		System.out.println(" ======do while======");
		
		do {
		for(int z=0; z<10; z++) {
		System.out.println(i + " * " + z + " = " + i * z);
		}
		System.out.println("계속 하시겠습니까?");
		sc.nextLine();
		String answer = sc.nextLine();
		if(answer.equalsIgnoreCase("N")) break;
		}
		while(true);
	
		

	}

}
