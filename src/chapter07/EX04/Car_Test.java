package chapter07.EX04;

class Car{
	
	// 1. 필드
	String company;       // 제조회사
	String model;         // 자동차 모델
	String color;		  // 자동차 색깔
	double maxSpeed; 	  // 자동차 최대출력
	
	// 2. 생성자
	
	Car(){
		
	}
	
	Car(String company, String model, String color, double maxSpeed){
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	// 3. show() 메소드 ( 필드값 출력)
	
	void show () {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
		
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	// 4. (getter/setter) 
	
	
}


public class Car_Test {
	
    public static void main(String[] args) {
    	//객체 생성
    	// car1 현대 자동차 그랜져 < == 필드의 값 직접 입력
    	// car2 쌍용 자동차 체어맨 < == 생성자 통해서 값 입력 / show() 값입력
    	// car3 기아 자동차 K9   < == 게터 세터 
    	
    	
    	Car car1 = new Car();
    	
    	
    	car1.company = " 현대";
    	car1.model = " 그랜져" ;
    	car1.color = "블랙" ;
    	car1.maxSpeed = 393.3;
    	
    	System.out.println(car1.company);
    	System.out.println(car1.model);
    	System.out.println(car1.color);
    	System.out.println(car1.maxSpeed);
    	System.out.println("=======");
    	
    	
    	Car car2 = new Car("쌍용","체어맨", "회색" , 333.3) ;
    		
    	car2.show();
    	
    	System.out.println("========");
    	
    	Car car3 = new Car() ;
    	
    	car3.setColor("블랙");
    	car3.setCompany("기아");
    	car3.setModel("k9");
    	car3.setMaxSpeed(393.3);
    	
    	System.out.println(car3.getColor());
    	System.out.println(car3.getCompany());
        System.out.println(car3.getModel());
    	System.out.println(car3.getMaxSpeed());	
    	
    	
    	
    
    		
    	
    	
    	
    	
    	
	}
}
