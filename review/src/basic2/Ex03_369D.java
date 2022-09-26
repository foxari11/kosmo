package basic2;

import java.util.Scanner;

public class Ex03_369D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		for(int i = 1; i <num; i++) {
			int su = i; 
			while(su != 0) {
				int na = su % 10;
				if(na==3 || na ==6 || na ==9)
				{
				result++;
				}su = su/10;
				
				
			}	
			
			
		}
		
		System.out.println(num + "의 박수친 횟수는 " + result);
		
	}


}


