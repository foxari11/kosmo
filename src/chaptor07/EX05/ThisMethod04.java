package chaptor07.EX05;

class Car{
	String companyName;     // 현대자동차
	String color;			// 검은색
	double maxSpeed;		// 200.0 km/h
	
	// 생성자 
	Car(){
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
