package poly;

public class Dvd extends Item {
	

	private String actor = "";
	private String movieDirector = "";
	
	public Dvd() {
		System.out.println("dvd 생성자 생성 ");
	}
	public Dvd(String num, String name,String actor, String moiveDirector) {
		super.num = num;
		super.name = name;
		this.actor = actor;
		this.movieDirector = moiveDirector;
	}
	
	public void output() {
		System.out.println("번호: " + num);
		System.out.println("제목: " + name);
		System.out.println("배우: " + actor);
		System.out.println("감독: " + movieDirector);
	}

}
