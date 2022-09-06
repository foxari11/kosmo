package chaptor03.EX04;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기 비교 : True, false 로 값을 변환
		
		
	   System.out.println(5 < 2 );  //false
	   System.out.println(2 < 5 );  //true
	   System.out.println(5 < 5);  //false
	   System.out.println(5 <=5);  //true
	   System.out.println(5 >=5);  //true
	   
	  System.out.println("========================");
	   
	   //등가비교 : 
	   // ==   : 같을 때(true) , != : 같지 않을 때 (true)
	   int a= 5;
	   int b= 2;
	   int c= 5;
	   
	   System.out.println(a == b);	//false
	   System.out.println(a == c);	//true
	   System.out.println(a!=b);	//true
	   System.out.println(a!=c);	//false
	   System.out.println(b!=c);	//true
	   
	   System.out.println("=======================");
	   
	   //참조 자료형일때 등가비교.
	      //(객체의 참조주소를 비교하므로 //false)
	   String str1 = new String ("안녕");
	  
	   String str2 = new String ("안녕"); 
	   System.out.println(str1 == str2);
	   
	   System.out.println("==================");
	   
	   
	   System.out.println(str1); //객체의 번지수
	   System.out.println(str2); //


	}

}
