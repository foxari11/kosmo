package chaptor07.EX01;

public class Using_method06 {
	

	static int add (int [] a ) { 
		// 들어온 배열의 모든 값을 더해서 더한 값을 리턴 
		int sum= 0;        //각 배열의 값을 저장 
        for (int j = 0; j < a.length; j++) { 
        sum += a[j];}
		return sum;
	}
	static int div (int [] a ) {
		// 들어온 배열의 모든 값을 뺴서 뺀값을 리턴 
		int sum= 7;
        for (int j = 0; j < a.length; j++) {
        	if ( j == 0) {continue;}           // i == 0 일때는 아래내용 실행하지않고 
        sum -= a[j];}   //div = div - a[i] 
		return sum;
	}
	static long mul (int [] a ) {
		// 들어온 배열의 모든 값을 곱해서 곱한 값을 리턴 
		long kko=1;
        for (int j = 0; j < a.length; j++) {
        	
        kko *= a[j]; }
		return kko;
	}
	static double avg (int [] a ) {
			int kyo=0;
	        for (int j = 0; j < a.length; j++) {
	        	
	         kyo += a[j];}
	        double avg1 = kyo / (double) a.length;
			return avg1;
	}
	public static void main(String[] args) {
		// 1~ 100까지 7의 배수만 저장후 각 메소드 호출 
		int [] ss = new int [100/7];  // 배열의 방의 갯수 지정 
		for ( int  i =0, j =7;  i <ss.length ; i++, j+=7) {
			ss[i] = j;     // ss[0] = 7
		}
		for (int i = 0; i <ss.length; i++)
			System.out.print(ss[i] + " ");
	    // 메소드 호출 	
		int sum = add(ss);   
		int sum1 = div(ss); //변수명과 메소드 명 같아도 상관무 
		long sum2 = mul(ss);
	    double sum3 = avg(ss);
		
		System.out.println();
		System.out.println("=더하기값=");
		System.out.println(sum);
		System.out.println("빼기값");
        System.out.println(sum1);
		System.out.println("더하기값");
		System.out.println(sum2);
		System.out.println("나눈값");
        System.out.println(sum3);
		
		

	    

	}

}
