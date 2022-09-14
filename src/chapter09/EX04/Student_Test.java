package chapter09.EX04;

class Student{
	static int serialNum = 1000;
	int studentID;		// 학생 고유ID     >> 생성자
	String studentName;	// 학생 이름 		
	int grade;			// 학년 : 기본값 4 학년 
	String address;    // 주소  : " 서울 " 
	
	
	Student() {
		     grade = 4;
		     address = "서울 ";
		     serialNum++;
		     studentID = serialNum;
	}	
	Student(String studentName){
		this();
		this.studentName =studentName;
	}
	void print() {
		System.out.println("이름은 : " + studentName + " 학년은 : " + grade + " 주소는 : " + address + "아이디는?"
				+ studentID);
	}
	
	
}

public class Student_Test {

	public static void main(String[] args) {

		
		//Student.studentID = 1001; 
		 
		Student lee = new Student ("이지원");
		lee.print();
		
		
		Student hong = new Student ("홍지원");
		
		hong.print();
		
		Student jung = new Student ("정지원");
		
		jung.print();
		
		Student park = new Student ("박지원");
		
		park.print();
		}
	}


