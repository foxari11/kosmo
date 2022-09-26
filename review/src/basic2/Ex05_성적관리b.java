package basic2;

import java.util.Scanner;

public class Ex05_성적관리b {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);



	        int[][] arr = new int[4][3];
	        String[] str = {"Java", "Python", "Database"};
	        String[] str2 = {"A", "B", "C", "D"};
	        int[] sum = new int[str2.length];
	        int[] sum2 = new int[str.length];
	        
	        for(int i=0; i<str2.length; i++) {

	            System.out.println(str2[i]+"학생 점수 입력");

	            for(int j=0; j<str.length; j++) {

	                System.out.print(str[j]+" : ");

	                arr[i][j] = sc.nextInt();

	                

	                //학생별 합계

	                sum[i] += arr[i][j];

	            }

	            System.out.println();

	        }

	        

	        //과목별 합계

	        for(int i=0; i<str.length; i++) {

	            for(int j=0; j<str2.length; j++) {

	                sum2[i] += arr[j][i];

	            }

	            System.out.println();

	        }

	        

	        for(int i=0; i<str2.length; i++) {

	            System.out.println(str2[i]+"학생의 총점 : "+sum[i]);

	        }

	        System.out.println("==============================");



	        for(int i=0; i<str.length; i++) {

	            System.out.println(str[i]+" 총점 : "+sum2[i]);

	        }

	    }

	}


