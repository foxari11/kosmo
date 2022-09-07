package chaptor07.EX01;

class D {
	
	double arr (int a ) {
		return a * a + 3.14;
	}
	
	double arr2 (int b ) {
		return b * b + 3.14;
	}
	
	
	
	
}







public class Using_method02 {

	public static void main(String[] args) {
		
		D d = new D();
		// 원의 지름을 넣었을 때 전체 넓이를 객체를 생성 후 출력 
        // 피자 반지름 : 10 
		// 도넛 반지름 : 5 
		// 피자의 넓이는 00 입니다.
		// 도넛의 넓이는 00 입니다.
		
		
	
		
		System.out.println("피자의 넓이는 : " + d.arr(10));
		System.out.println("도넛의 넓이는 : " + d.arr(5));
		
		
		
	}

}
