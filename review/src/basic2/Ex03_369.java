package basic2;

public class Ex03_369 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * 1부터 50까지 숫자 중에서 3,6,9 숫자가 포함되면 
		 * 그 갯수 만큼 ' 짝' 
		 * 그렇지 않으면 그 숫자를 출력 
		 */
	
	for(int i = 1; i < 50; i++) {
		if(i%3 ==0) {
			System.out.print(" 짝 ");
		}else {
			System.out.print(" " + i + " ");
		}	
	}
	}

}
