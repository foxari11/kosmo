package basic1;

public class Ex02_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3;
		
		if (a > 3 && ++a > 3) {
			System.out.println("조건만족");	 	  // 안나옴 
		}
		System.out.println("a=" + a);
		
		if ( a > 1 || ++a >3) {
			System.out.println("조건만족2");        // 나옴
		}
		System.out.println("a=" + a);
	}

}
