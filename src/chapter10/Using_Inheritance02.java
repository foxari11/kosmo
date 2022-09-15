package chapter10;

class Fruit {  			//과일 <== 부모 클래스 
	String name;		//과일 이름
	String color;		//과일 색깔
	int large;			//과일 크기 
	
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	void print() {
		System.out.println(name + " , " + color + " , " + large);
	}
}
class Apple extends Fruit{ 			//사과 <== 자식 클래스
	// 자식 클래스만 가지는 필드1, 메소드1
	int no1;
	
	void taste () { 
		System.out.println("번호는 " + no1 +" 사과 맛 ");
	}
}
class Orange extends Fruit{			//오렌지 <== 자식 클래스 
	// 자식 클래스만 가지는 필드1, 메소드1
	int no2;
	
	void taste2 () {
		System.out.println("번호는 " + no2 +" 오렌지맛 ");
	}
}
class Banana extends Fruit {			//바나나 <== 자식 클래스 
	// 자식 클래스만 가지는 필드1, 메소드1
	int no3;
	
	void taste3 () {
		System.out.println("번호는 " + no3 +" 바나나 맛 ");
	}
}
public class Using_Inheritance02 {

	public static void main(String[] args) {
		Fruit aa = new Fruit();
		aa.name = "과일";
		aa.color = " 미배정";
		aa.large = 100;
		
		aa.eat();
		aa.print();
		
		Apple bb = new Apple();
		bb.name = "사과";
		bb.color = "빨강";
		bb.large = 300;
		bb.no1 = 1;
		
		bb.eat();
		bb.print();
		bb.taste();
		
		Orange cc = new Orange();
		cc.name = "오렌지";
		cc.color = "주황";
		cc.large = 400;
		cc.no2 = 2;
		
		cc.eat();
		cc.print();
		cc.taste2();
		
		Banana dd = new Banana();
		dd.name = "바나나";
		dd.color = "노랑";
		dd.large = 600;
		dd.no3 = 3;
		
		dd.eat();
		dd.print();
		dd.taste3();
	}

}
