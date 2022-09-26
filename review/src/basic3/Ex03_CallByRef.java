package basic3;

public class Ex03_CallByRef {
	public static void main(String[] args) {
		
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a,b);
		System.out.println("A="+ a + " , B=" + b); // 후출 안녕 하이
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b); 
		System.out.println("A= "+ a + ", B= " + b); // 선출 안녕하이 하이 
	}

}



/* 문자열 처리 클래스
	-String

	-StringBuffer / StringBuilder


*/