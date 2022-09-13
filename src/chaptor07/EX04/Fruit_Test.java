package chaptor07.EX04;

class Fruit{
	
	// 1. 필드 
	
	String name; 	// 과일 이름
	String color; 	// 과일 색깔
	int count; 		// 과일 갯수 
	int sugarContent; // 과일 당도 

	// 2. 생성자
	
	Fruit(){        // 기본 생성자 
		
	}
	
	Fruit(String name, String color, int count, int sugarContent ){
		this.name = name;
	    this.color = color;
	    this.count = count;
	    this.sugarContent = sugarContent;
	}
	
	// 3. show() : 필드의 값을 모두 출력
    void show () {
    	System.out.println(name);
    	System.out.println(color);
    	System.out.println(count);
    	System.out.println(sugarContent);
    }
    
    // 4. getter / setter 메소드 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

	
	
    
    
}

public class Fruit_Test {

	public static void main(String[] args) {
		// 1. banana 객체 생성 후 필드에 기본값을 직접 입력 후 /  직접 출력 
		Fruit banana = new Fruit();
		
		banana.name = " 바나나 ";
	    	
		banana.color = " yellow";
		
		banana.count = 39;
		
		banana.sugarContent = 3;
		
		System.out.println(banana.name);
		System.out.println(banana.color);
		System.out.println(banana.count);
		System.out.println(banana.sugarContent);
		

		// 2. apple 객체 : 생성자를 사용해서 4개의 필드에 초기값 할당. show 출력
		System.out.println(" == 2 번 == ");
		Fruit apple = new Fruit("사과","red", 32 , 5);
		
		apple.show();
		
		
		
		// 3. strawberry : setter를 사용해서 4개의 필드에 값 할당 .getter 사용해서 출력
		
		Fruit straw = new Fruit ();
		
		straw.setName("딸기");
		straw.setColor("빨강");
		straw.setCount(3);
		straw.setSugarContent(2);
		
		System.out.println(" == 3 번 == ");
		System.out.println(straw.getName());
		System.out.println(straw.getColor());
		System.out.println(straw.getCount());
		System.out.println(straw.getSugarContent());
		
		
	}

}
