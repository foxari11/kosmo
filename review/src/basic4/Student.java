package basic4;

public class Student {
	
	private String hakbun;
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	
	public Student() {
//		this.name = "홍옹이";
//		this.kor = 30;
//		this.eng = 30;
//		this.math = 39;
		this("이름",50,50,80);		//this 함수는 무조건 먼저 써야됨. 
		System.out.println("기본 생성자");
	}

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자있는 생성자");
	}

	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	void calTotal() {
		total = kor + eng + math;
		
	}
	void calAvg() {
		avg = total / 3;
	}	
	void output() {
		System.out.println(name + " 님의 성적 : " + total + "/ " + avg);
	
	}
	
}

/*
 * 
 *  캡슐화
 * 		- 멤버변수(field) : private
 * 		- 멤버메소드 : public

*/
