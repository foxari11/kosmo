package basic2;

public class EX03_369b {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * 1부터 50까지 숫자 중에서 3,6,9 숫자가 포함되면 
		 * 그 갯수 만큼 ' 짝' 
		 * 그렇지 않으면 그 숫자를 출력 
		 * 
		 * 
		 * ex) 26			123
		 * 		6 ->		  3 ->
		 * 		2 ->		  2 ->
		 * 					  1 ->
		 */	
	
		for(int i = 1; i < 50; i++) {
			
			int su = i; 
			boolean su369 = false;
			
			while(su != 0) {
				int na = su % 10;
				if(na==3 || na ==6 || na ==9)
				{
					System.out.print("짝");
					su369 = true;
				}
				su = su/10;
			}	
			if(su369)System.out.println();
			else System.out.print(i);
		}
	}

}