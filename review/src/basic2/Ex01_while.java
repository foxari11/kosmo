package basic2;

public class Ex01_while {

	public static void main(String[] args) {
		
		
		// 0. for 문
		// 1~10 까지 합을 구해라
		int sum = 0;
		for(int i = 1; i< 11; i++) {
			sum += i;
		}
		System.out.println(sum);
		// 초기치를 반복블록 위로
		// 증가치를 반복문 끝으로 
		// 조건문만 남아서 for -> while 
		
		int i = 1;
		int sum1 = 0;
		while(i<11) {
			sum1 += i;
			i++;
			
		}
		System.out.println(sum1);
		
		
		int k = 1;
		int sum2 = 0;
		do {
			sum2 += k;
			k++;
		} while(k<11);
		System.out.println(sum2);
	}

}
