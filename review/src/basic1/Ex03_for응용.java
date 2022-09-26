package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
		
		System.out.println("==1번==");
		for(int count = 0; count <26; count++) {
				System.out.println();
				for(char i = 'A'; i <= 'A'+count; i++) {
		
		System.out.print(i);}
		
	}
		System.out.println();
		System.out.println("=2번=");
		for(int count = 0; count <26; count++) {
			System.out.println();
			for(char i = 'A'; i <= 'Z'-count; i++) {
	
		System.out.print(i);}
}
		System.out.println();
		System.out.println("=3번=");
		
		
		for(int count = 0; count <26; count++) {
			System.out.println();
			for(char i = (char)('A' + count); i <= 'Z'; i++) {
				
		System.out.print(i);
		}
	}		
			
		System.out.println("=4번=");
		
		for(int count = 0; count <26; count++) {
			System.out.println();
			for(char i = 'Z';  i >= 'Z'-count;  i--) {
	
		System.out.print(i);}
			
			
		}
		
		System.out.println("=5번=");
		
		for(int count = 0; count <26; count++) {
			System.out.println();
			for(int c = 0; c <=count; c++) {
				System.out.print(" ");
			}
			for(char i = (char) ('A' + count) ;  i <= 'Z';  i++) {

			System.out.print(i);}
		}
		

}
}