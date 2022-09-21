package chapter10.EX06;

class Animal {
	   //자식 클래스에서 2개의 메소드를 오버라이딩 
	   // Animal 타입으로 정의, 배열에 저장 후, 오버라이딩 된 메소드 출력 (For, Enhanced For)
	   void run() {
	      System.out.println("모든 동물은 달립니다.");
	   }
	   void eat() {
	      System.out.println("모든 동물은 먹습니다.");
	   }
}
	class Tiger extends Animal {
		@Override
		void run() {
			System.out.println("호랑 런");
		}
		@Override
		void eat() {
			System.out.println("호랑 어흥");
		}
	}

	class Eagle extends Animal {
		@Override
		void run() {
			System.out.println("독수리 런");
		}
		
		@Override
		void eat() {
			System.out.println("독수리 먹");
		}
	}

	class Fish extends Animal {
		@Override
		void run() {
			System.out.println("sㅍ");
		}
	
		@Override
		void eat() {
			System.out.println("eat ");
		}
	}

	class Dog extends Animal {
		@Override
			void run() {
				System.out.println("런");
			}
		 @Override
		void eat() {
			System.out.println("밥");
		}
	
	}



public class Using_Method_Overriding03_b {
	
	
	

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Tiger();
		Animal a3 = new Eagle();
		Animal a4 = new Fish();
		Animal a5 = new Dog();

		Animal arr1[] = new Animal [] {a1,a2,a3,a4,a5};
		
		for(int i = 0 ; i < arr1.length; i++ ) {
			arr1[i].eat();
			arr1[i].run();
			
		}
		
		for(Animal k : arr1) {
			k.eat();
			k.run();

		}

	}

}
