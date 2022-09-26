package basic4;

public class MainTest {

	public static void main(String[] args) {
		
		
//		 값지정 1 - setter 
		Student s = new Student();
		/*
		s.setName("홍길동");
		s.setKor(20);
		s.setMath(90);
		s.setEng(30);	*/
//		Student s = new Student("홍길자",99,88,66); // ( ) <= 입력매개변수
		s.calTotal();
		s.calAvg();
		s.output();
		
	}

}
