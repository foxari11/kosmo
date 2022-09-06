package chaptor04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
		// continue : continue를 만나면 continue 아래의 코드를 실행하지 않고 반복
		// - if 문과 같이 사용.
		
		//1. 단일 loop에서 continue
		for(int i = 0; i<10; i++) { // 0~9 : 10번 
			System.out.println("A");
			{continue;}                 // 구문을 빠져나가지 않고 
			// System.out.println("B"); // 도달할 수 없는 코드 
		}
		
		
		for(int i = 0; i<10; i++) { // 0~9 : 10번 
			System.out.println("A");
			if (i % 2 == 0) {continue;} // i : 0,2,4,6,8.....
			System.out.println("B");
		}

        System.out.println("===============");
        
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
        
        
	}

}
