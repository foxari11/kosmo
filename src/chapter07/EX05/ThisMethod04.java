package chapter07.EX05;

class Car{
	
	// this 키워드 : 필드나 메소드 선언시 사용불가.
    //	        - 생성자 , 메소드 내부에서 필드나 메소드를 사용할 때 자신의 필드나 메소드를 지칭할 때 사용
	//			- 자신의 객체의 필드, 메소드를 가르킨다. 기본적으로 생략해서 많이 사용.
	//			- 반드시 사용해야 할 경우 : 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일 
	// this() 	- 생성자 내부에서만 사용, 반드시 첫 라인에 위치 
	//          - 자신의 객체와 다른 생성자를 호출
	//          - 생성을 오버라이딩 할 때, 코드를 간략하게 사용
	
	String companyName;     // 현대자동차
	String color;			// 검은색
	double maxSpeed;		// 200.0 km/h
	
	// 생성자 
	Car(){	//리턴 타입이 없다. , 클래스 이름과 동일 
		companyName = " 현대자동차 ";
		color = " 검은색";
		maxSpeed = 200.0;
		
	}

	Car(String companyName){
		
		this();
		this.companyName = companyName;
	}
	
	Car(String companyName, String color){
		
		this();
		this.companyName =companyName;
		this.color = color;
		
	}
	Car(String companyName, String color, double maxSpeed){
		
		
		this.companyName =companyName;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}

	// 필드의 모든 값을 출력하는 메소드 (print()) 
    void print() {
    	System.out.print("차이름은? " + companyName);
    	System.out.print("차 색은? " + color);
    	System.out.print("차 속도눈? " + maxSpeed);
    	System.out.println();
    }

    }
public class ThisMethod04 {

	public static void main(String[] args) {
		//this keyword , this Method 를 사용해서 처리. 
		
		// 1.매개 변수 0개일 때, 기본 필드의 값 출력
		
		// 2.매개 변수 1개일 때, companyName만 출력, 나머지는 기본값 출력
		
		// 3.매개 변수 2개일 때 
		
		// 4.매개 변수 3개일 때 
		
		
		Car car1 = new Car();
		car1.print();
		
		Car car2 = new Car("기아 ");
		car2.print();
		
		Car car3 = new Car("쌍용 ", "블랙 ");
		car3.print();
		
		Car car4 = new Car("쌍용 ", "블랙 ", 333.3);
		car4.print();
	
		
		

	}

}
