package basic3;

public class Ex03_CallByValue {

	public static void main(String[] args) {
		
		
		int a = 10, b = 20;   // a,b 변수 선언
		
		add(a,b);		//a,b 
		System.out.println("A="+ a + " , B=" + b);	//후출력 10, 20 

	}

	static void add(int a, int b) {
		a += b;
		System.out.println("A= " + a + " , B = " + b ); 	//선출력 30,20
	}

	}


