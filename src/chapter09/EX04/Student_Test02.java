package chapter09.EX04;

class Student02{
	
	//필드의 접근제어자 : default로 구성됨 : -- 외부 클래스에서 객체를 생성 후 직접 수정 가능 
	static int serialNum = 1000;	// 모든 객체에서 공유하는 필드, 객체를 생성할때마다 1개씩
	int studentID;		// 학생 고유ID     >> 생성자
	String studentName;	// 학생 이름 		
	int grade;			// 학년 : 기본값 4 학년 
	String address;    // 주소  : " 서울 " 
	
}

class Student03 {
	//필드의 접근 제어자는 보안을 위해서 private 으로 선언 할 수 있다.
	// -- 필드의 값을 직접적으로 수정할 수 없다. getter setter
	private static int serialNum = 1000;	// 모든 객체에서 공유하는 필드, 객체를 생성할때마다 1개씩
	private int studentID;		// 학생 고유ID     >> 생성자
	private String studentName;	// 학생 이름 		
	private	int grade;			// 학년 : 기본값 4 학년 ( 1 ~ 4 )
	private String address;    // 주소  : " 서울 " 
	private int month;		   // 값 : 1~12까지만
	//필드의 접근 제어자를 private으로 설정하면 외부 클래스에서 접근 불가함.
		//생성자나 메소드(setter)를 사용해서 필드의 내용을 수정
			//원하는 값을 (제어해서)입력을 할 수 있다.
	
	Student03 () {
		serialNum ++;
		studentID = serialNum;
		grade = 4;
		address = "서울";
		
	}
	Student03(String studentName){
		this();
		this.studentName = studentName;
		
	}
	
	void print() {
		System.out.println("학생 ID  : " + studentID);
		System.out.println("학생 이름 : " + studentName);
		System.out.println("학생 학년 : " + grade);
		System.out.println("학생 주소 : " + address);
		System.out.println("월 : " + month);
		System.out.println();
	}
	
	void setGrade (int grade) {			//setter : grade 필드의 값을 할당하는 setter 
		if (grade >= 1 && grade <=4) {
			this.grade = grade;
		}else {
			System.out.println("잘못된 값 입력 ! 1 ~ 4 까지만 입력해 ");
			return;
		}
		
	}
	void setMonth (int month) {			//외부 클래스에서 접근 가능 
		if (month >= 1 && month <=12) {
		this.month = month;
	}else{
		System.out.println("잘못된값 입력 ! 1 ~ 12까지만 입력해");
		return;
	    }
	}	
	
}

public class Student_Test02 {

	public static void main(String[] args) {
		// 객체 생성
		Student02 s = new Student02();
		
		//default 접근 제어자 : 동일한 패키지에 존재하는 클래스에서 필드의 내용 직접 수정 가능 
		s.serialNum = 2000;
		s.studentID = 100;
		s.studentName = "홍길동";
		
		Student03 s1 = new Student03("홍길동");
		
		//private 접근 제어자 :  
//		s3.serialNum = 2000;
//		s3.studentID = 100;
//		s3.studentName = "홍길동";
		
		// 필드의 값을 직접 입력하는 경우는 넣는 값을 제어 할 수 없다.
//		s1.grade = 30;		//1~4
//		s1.month = 30;		//1~12
		s1.setMonth(12);
		s1.setGrade(3);
		s1.print();
		
		Student03 lee = new Student03 ("이지원");
		lee.print();
		
		
		Student03 hong = new Student03 ("홍지원");
		
		hong.print();
		
		Student03 jung = new Student03 ("정지원");
		
		jung.print();
		
		Student03 park = new Student03 ("박지원");
		
		park.print();
		

	}

}
