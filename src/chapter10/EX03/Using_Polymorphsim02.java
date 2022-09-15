package chapter10.EX03;

class Animal {   // 최상위 부모 클래스 
	String name;
	int age;
	String color;
	
	void eat () {
		System.out.println("모든 동물은 음식을 먹는다.");
	}
	
	void sleep () {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}

class Tiger extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int tiger;
	void tigerEat () { 
		System.out.println("호랑이는 다른 동물을 잡아먹습니다.");
	}
}

class Eagle extends Animal {
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int eagle;
	void eagleFly() {
		System.out.println("독수리는 하늘을 날라다닙니다.");
	}
}

class Dog extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int dog;
	void dogCry() {
		System.out.println("개는 멍멍멍 짖습니다.");
	}
	
}
class Dog_sub extends Dog{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	//Dog 클래스의 모든 필드와 메소드를 상속 받는다.
	int dog_sub;
	void dogSubCry() { 
		System.out.println("새끼 강아지는 낑낑 거립니다.");
	}
}

public class Using_Polymorphsim02 {

	public static void main(String[] args) {
		
		
		
		//1.Animal 객체를 Animal 타입으로 생성
			//a1은 Animal 타입만 가진다.
				//Animal 클래스의 필드와 메소드만 접근가능
		Animal a = new Animal();
		
		//2. Tiger 객체를 Tiger 타입으로 생성
			//t1은 Animal, Tiger를 내포 하고 있고, Tiger 타입으로 진행 
			//t1은 Animal, Tiger의 필드와 메소드 모두 접근
		Tiger t1 = new Tiger();
		
		//3. Tiger 객체를 Animal 타입으로 생성
		Animal a2 = new Tiger();
			//a2는 Animal, Tiger 를 내포 하고 있고, Animal 타입으로 지정
			//a2는 Animal의 필드와 메소드만 접근
		//4. Dog 객체를 Dog 타입으로 생성
			//d1은 Animal, Dog를 내포하고 있고, Dog 타입으로 지정
			//d1은 Animal, Dog의 필드와 메소드 모수 사용가능
		Dog d1 = new Dog();
		
		//5. Dog 객체를 Animal 타입으로 생성
			//a3는 Animal, Dog 를 내포 하고 있다. Animal 타입으로 지정
			//a3는 Animal 의 필드와 메소드만 접근
		Animal a3 = new Dog();
		
		//6. Dog_sub 객체를 Dog_sub 타입으로 지정
			//ds1는 Animal, Dog, Dog_sub 를 내포하고 있고, Dog_sub 타입으로 지정
			//ds1는 Animal, Dog, Dog_sub 의 모든 필드와 메소드 접근 가능
		Dog_sub ds1 = new Dog_sub();
		
		//7. Dog_sub 객체를 Dog 타입으로 지정
			//d2는 Animal, Dog, Dog_sub 를 내포하고 있고, Dog 타입으로 지정
	    	//d2는 Dog , Animal 의 모든 필드와 메소드 접근 가능
		Dog d2 = new Dog_sub();
		
		//8. Dog_Sub 객체를 Animal 타입으로 지정
			//a4는 Animal, Dog, Dog_sub 를 내포하고 있고, Animal 타입으로 지정
		    //a4는 Animal 의 모든 필드와 메소드 접근 가능
		Animal a4 = new Dog_sub();
		
		
		
		
		
		
		
		
		
		
		
	}

}
