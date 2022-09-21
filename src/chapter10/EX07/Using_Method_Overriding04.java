package chapter10.EX07;

import chapter10.EX09.Animal;
import chapter10.EX09.Tiger;

class Animal {
	
	void run() {
		System.out.println(" 모든 동물은 달립니다.");
	}
	
	void eat() {
		System.out.println(" 모든 동물은 먹습니다.");
	}
}

class Tiger extends Animal {
	int count;
	
	Tiger(int count){
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("호랑이는 달린다");
	}
	@Override
	void eat() {
		System.out.println(" 호랑이는 먹는다");
		}
	}

class Egle extends Animal {
	int count;
	
	Egle(int count){
		this.count = count;
	}


	
	@Override
	void run() {
		System.out.println("독수리는 달린다");
	}
	
	@Override
	void eat() {
		System.out.println("독수리는 먹는다");
	}
	
}


class Fish extends Animal {
	int count;
	
	Fish(int count){
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("물고기는 달린다");
	}
	@Override
	void eat() {
		System.out.println("물고기는 먹는다");
		super.eat();
	}
}


class Dog extends Animal{
		
	int count;
	
	Dog(int count){
		this.count = count;
	}
	
	
	@Override
	void run() {
		System.out.println("개는 달린다");
	}
	@Override
	void eat() {
		System.out.println("개는 먹는다");
	}
}




public class Using_Method_Overriding04 {

	public static void main(String[] args) {
	// 1. 객체 생성
	// 1. 객체생성( Anilmal 타입으로 생성 )
		Animal a = new Animal();
		
		
		// 생성자를 통해서 각각의 필드에 값을 할당 
	// 완료 시간 : 3 : 50분 	
		Animal a1 = new Animal();
		Animal a2 = new Tiger(10);
		Animal a3 = new Egle(5);
		Animal a4 = new Fish(50);
		Animal a5 = new Dog(70);

		// 객체를 배열에 저장

	    Animal[] arr1 = new Animal[] {a1,a2,a3,a4,a5};
	    int sum = 0;
	     //동물의 총합을 구하는 변수 sum 
	    //배열에 각 방에 저장된 객체를 Animal 객체에 저장
	 	//For문을 사용해서 출력 : eat(), run() , 동물의 총 마리수 :00
	 	//	1. For 문을 사용해서 객체를 Animal 객체로 뽑아서
	 	//  2. 다운캐스팅 해서 자식 필드의 count 읽어서 총 더한 값 출력
	     for (int i =0; i < arr1.length ; i++) {
	    	 
	    
	    Animal aa = arr1[i];
	    	if (aa instanceof Tiger) {
	    		Tiger t1 = (Tiger) aa;
	    		sum += t1.count;
	    	}
	    	if (aa instanceof Egle) {
	    		Egle t1 = (Egle) aa;
	    		sum += t1.count;
	    	}
	    	if (aa instanceof Fish) {
	    		Fish t1 = (Fish) aa;
	    		sum += t1.count;
	    	}
	    	if (aa instanceof Dog) {
	    		Dog t1 = (Dog) aa;
	    		sum += t1.count;
	    	}
	    	
		}
		
	     System.out.println("총 동물의 마리 수는 " + sum);
		
		

	
	}
}