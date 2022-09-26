package basic3;

public class method5 {

	public static void main(String[] args) {
		
		 multiple(2,3);
		 multiple( 4, 'ㅋ');
		 System.out.println("===");
		 multiple(2,3,'ㅋ');
	

	}
	
	static void multiple(int i, int j) {
		System.out.println(i * j);
		
	}
	
	static void multiple(int x, char y) {
		for(int i=0; x>i; i++) {
			System.out.print(y);
		}
	}

	static void multiple(int x, int y, char z) {
		for(int i=0; x>i; i++) {
			for(int j=0; y>j ; j++) {
			System.out.print(z);
			
		}System.out.println();
	
}
}
}