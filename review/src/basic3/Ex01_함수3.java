package basic3;

public class Ex01_함수3 {

	public static void main(String[] args) {
		int sum = 0;
		int arr[] = add();
		// a와 b 값을 받아서 합한한 결과를
		// 여기서 출력
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
	}
	
	static int[] add() {
		int a = 10, b = 20;
		int [] arr = { a, b};
		
		return arr;
	}

}
/*(문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면
 *  false을 반환하는 메소드를 작성하시오. 


함수명 : checkLower

인자 : char

리턴(반환) : boolean *?
		 */
