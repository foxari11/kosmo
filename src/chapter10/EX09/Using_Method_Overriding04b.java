package chapter10.EX09;


class Animal {
	   //자식 클래스에서 2개의 메소드를 오버라이딩 
	   // Animal 타입으로 정의, 배열에 저장 후, 오버라이딩 된 메소드 출력 (For, Enhanced For)
	
	int count;
	
	   void run() {
	      System.out.println("모든 동물은 달립니다.");
	   }
	   void eat() {
	      System.out.println("모든 동물은 먹습니다.");
	   }
	}
	class Tiger extends Animal {
	   int count;      //호랑이 수
	  
	 Tiger(int count){
		 this.count = count;
		 System.out.println(count);
	 }
	 @Override
		void run() {
			System.out.println("호랑런");
		}

	   	@Override
	   	void eat() {
	   		System.out.println("호랑밥");
	   		}
	}

	class Eagle extends Animal {
	   int count;      //독수리 수
	   
	 Eagle(int count){
		 this.count = count;
		 System.out.println();
	 }
	  @Override
		void run() {
		System.out.println("독수리런");
		} 
	  	@Override
	  	void eat() {
	  	System.out.println("독수리밥");
	  	}
	   
	}

	public class Using_Method_Overriding04b {
	   public static void main(String[] args) {
	      Animal a = new Animal ();
	      Animal t = new Tiger (10);   
	      Animal e = new Eagle (5);   
	      
	      Animal[]arr = new Animal [] {a,t,e} ;
	      int sum = 0;
	      for(int i = 0; i < arr.length; i++) {

	      if(t instanceof Tiger) {
	    	 Tiger t1 = (Tiger) t; 
	    	 sum += t1.count ;
	      }
	      if(e instanceof Eagle) {
	    	 Eagle e1 = (Eagle) e;
	    	sum += e1.count ;		 		 
	      }
	      break;
	      
	   }
	      System.out.println(sum);
	      
	      
	}

	}	   
	   


