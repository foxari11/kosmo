package poly;

public class Cd extends Item {
	
	
	private String singer = "";
	
	public Cd() {
		System.out.println("cd 생성자 생성 ");
		
	}
	
	public Cd(String num, String name,String singer) {
		super.num = num;
		super.name = name;
		this.singer = singer;
		
	}
	
	public void output() {
		System.out.println("번호: " + num);
		System.out.println("제목: " + name );
		System.out.println("가수: " + singer);
	}

}
