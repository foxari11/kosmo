package chapter05.EX02;

import java.util.Arrays;

class Using_Array_2D_02 {

	public static void main(String[] args) {
		
		
		
		String[][] arr1 = new String [][] {{"홍길동", "이순신" , "세종대왕"},
			{"독수리","부엉이","닭", "오리"} , {"붕어", "가물치", "잉어"} , 
			{"호랑이","사자"} } ;
		
			
		// 출력 :  사람  이름   : 홍길동 이순신 세종대왕 
		//     :  새   이름   : 독수리 부엉이 닭 오리
		//     : 물고기 이름   : 붕어 가물치 잉어
		//     : 포우류 이름   : 호랑이 사자
			
			
			// 1. for 문으로 출력 
			
			
			for (int i = 0 ; i < arr1.length; i++ ) {
				if (i==0) {  
					System.out.print("사람 이름 : " );
				}else if (i==1) {
					System.out.printf("새 이름 : ");
				}
				else if (i==2) {
					System.out.printf("물고기 이름: ");
				}
				else if (i==3) {
					System.out.printf("포유류 이름: ");
				}
				for (int j = 0 ; j < arr1[i].length; j++) {
					System.out.print(arr1[i][j]+ " ");

					
				}
				System.out.println(" ");
			}  
			
		 

			
			for (String a [] : arr1) {
				for (String b : a ) {
					if (b.equals("홍길동")) {
						System.out.printf("사람이름 : ");
					}
					else if (b.equals("독수리")) {
						System.out.printf("새이름 : ");
					}
					if (b.equals("붕어")) {
						System.out.printf("호랑이이름 : ");
					}
					if (b.equals("호랑이")) {
						System.out.printf("붕어이름 : ");
					}
					System.out.print(b + " ");
				}
				System.out.println( );
			}
			
			
			for (int a= 0; a < arr1.length; a++) {  
				if (a==0) {  
					System.out.print("사람 이름 : " );
				}else if (a==1) {
					System.out.printf("새 이름 : ");
				}
				else if (a==2) {
					System.out.printf("물고기 이름: ");
				}
				else if (a==3) {
					System.out.printf("포유류 이름: ");
				}
				for (int j = 0 ; j < arr1[a].length; j++) {
				
					
				}
				System.out.println(Arrays.toString(arr1[a]));
			}  
				
				
				
			}
			
	}


