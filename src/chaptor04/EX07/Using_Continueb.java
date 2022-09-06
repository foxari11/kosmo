package chaptor04.EX07;

public class Using_Continueb {

	public static void main(String[] args) {
		for(int i = 0; i <10 ; i++) {
        	if ( i==5 || i==7) {continue;}
        	System.out.print(i + "");
        }
        
        //1. for 문만 사용해서 1~1000까지 1씩 증가하고 continue를 사용해서
        // 3의 배수만 출력하세요.
        
        //1. for 문만 사용해서 1~1000까지 1씩 증가하고 continue를 사용해서
        // 5의 배수만 출력하세요.
        
        //1. for 문만 사용해서 1~1000까지 1씩 증가하고 continue를 사용해서
        // 3,5,7 의 배수만 출력하세요.
		System.out.println("3 배수");	
		
		for (int a = 1; a <1000; a++) {
			if(a%3 != 0) {continue;}
			System.out.println(a);
				
			}
		
		System.out.println("5 배수");		
		for (int a = 1; a <1000; a++) {
			if(a%5 != 0) {continue;}
			System.out.println(a);
				
			}
		System.out.println("3,5,7 배수");
		
		for (int a = 1; a <1000; a++) {
			if(a%3 != 0) if(a%5 != 0) if(a%7 != 0) // if (a%3 !=0) ||  (a%5 !=0) || (a%7 !=0)
			
			 
			{continue;}
			System.out.println(a);
				
			}
		System.out.println("=================");
		//2. 다중 loop에서 continue
		for (int i = 0; i<5; i++) { // 5번 루프
			for (int k = 0; k<5; k++) { //5번 루프 
				if (k == 3) continue;
				System.out.println(i + " ," + k);
			}
		}
		
		
		System.out.println("======lable을 사용해서 점프함==========");
		out : for (int i = 0; i<5; i++) { // 5번 루프
			for (int k = 0; k<5; k++) { //5번 루프 
				if (k == 3) continue out;
				System.out.println(i + " ," + k);
			}
		}
		System.out.println("=================================");
		System.out.println("======lable을 사용해서 점프함==========");
		out : for (int i = 0; i<5; i++) { // 5번 루프
			for (int k = 0; k<5; k++) { //5번 루프 
				if (k == 3) {
				 i = 100;	// 바깥쪽 for 문의 변수값을 증대 시켜서 false 빠져나옴.
			     continue out;} 
				System.out.println(i + " ," + k);
			}
		}
		
			}
		}
	


