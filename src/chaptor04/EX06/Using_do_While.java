package chaptor04.EX06;

public class Using_do_While {

	public static void main(String[] args) {
		// while : 조건을 비교 후 실행문을 실행;
		/*
		 *  while 조건 {
		 *    실행문 ; 
		 *  }
		 * 
		 */
		// do while : 1번은 실행 후 조건을 비교 후 실행;
		/*
		     do {
		    	 실행문;
		     } while(조건);
		*/
		
		//1. while vs do while
		
		int a;
		a = 11;
		System.out.println("while 문======");
		while ( a <10) {
			System.out.println(a + " ");
			
			
		}
		System.out.println();

		a = 11 ;
		System.out.println("do while문=====");
		do {
			System.out.println(a + " ");
			
		} while (a<10);
		
		System.out.println();
		System.out.println("=======while=======");
		// while 문과 do while 문 10번 실행 
		
		a = -1;
		while (a < 10 ) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		System.out.println("=====do while====");
		
		a = 0;
		do { 
			System.out.print(a+ " ");       // 조건과 관계없이 1번은 실행됨.
			a++;
		}while (a<10);

	
	
	
	
	
	}

}
