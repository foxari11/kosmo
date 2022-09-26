package poly;


public class Book1 extends Item {
	

	private String author = "";
	private String from = "";
	
	public Book1() {
		this("000","제목없음","무명","출판사");
		System.out.println("기본 생성자");
	}
	
	public Book1(String num, String name,String author, String from) {
//		super.num = num;
//		super.name = name;
		super(num,name);
		this.author = author;
		this.from = from;
		System.out.println("인자 생성자");
	}

	
	public void output() {
		System.out.println("번호: " + num);
		System.out.println("제목: " + name);
		System.out.println("작가: " + author);
		System.out.println("출판사: " + from);
	}
}
