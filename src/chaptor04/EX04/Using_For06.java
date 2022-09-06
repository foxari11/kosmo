package chaptor04.EX04;

public class Using_For06 {
       public static void main(String[] args) {
		//for 문에서 무한루프 ( 조건 생략)
    	   
    	/*   
       for  ( int i = 0;; i++) {
     	   System.out.println(i);
     	   
       }
       System.out.println("문자열 출력");
    	   */
    	   
      //무한루프를 탈출 하는 방법 : break; 사용.	 
      // if 문 내에 break;
    for  ( int i = 0;; i++) {
    System.out.println(i);
    if (i == 100) { break;}
    }System.out.println("문자열 출력");
          
          
          
          
          
          
	}
}
