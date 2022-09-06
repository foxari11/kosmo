package chapter02.EX05;

public class DataType02 {
      public static void main(String[] args) {
		  //float 와 double의 정밀도
    	  // float : 소숫점 7자리까지 정밀도 유지됨.
    	  // double : 소숫점 15자리까지 정밀도 유지됨.
      float f1 = (float)1.0000001f; //float 의 값을 저장할 때 casting 필요
                                    //      변수앞(float) , 변수뒤 F  
                                    // 기본 값을 double 로 인식하기 때문이다.
          //리터럴 : 변수에 저장되는 값을 호칭할 때 
      System.out.println(f1);
      
      float f2 = (float)1.00000001f;
      System.out.println(f2);
      
      System.out.println("=============");
      
      double d1 = 1.000000000000001;
      System.out.println(d1);
      
      double d2 = 1.0000000000000001;
      System.out.println(d2);
      
	}
}
