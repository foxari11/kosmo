package inherit;

public class Maintest {
	public static void main(String[] args) {
		
		
//		Umma u = new Umma();
//		u.job();
//		u.gene();
		
//		Ddal d = new Ddal();
//		d.study();
//		d.job();
//		d.gene();
		
//		Ddal d = new Umma();
		
//		*부모 변수에 자식객체 생성이 가능
//		Umma u = new Ddal(); // 부모 변수에 자식객체 사용 가능
//		u.gene();
//		u.job(); // 원래는 엄마꺼를 가져왔어야 하나, 오버라이딩이 되어서 딸의 job을 부름.
//		u.study();
		
//		*형변환 : ( casting )
//		1 > 기본형끼리만 가능 (int - > double)
//		2 > 참조형에서 상속관계 있는 경우만 가능 
//		String s = new String("bb");
//		StringBuffer sb = (StringBuffer)s; --> X 
		
//		Umma u = new Umma();
//		Ddal d = (Ddal)u;
		
		Ddal d = new Ddal();
		Umma u = (Umma)d;	// up casting
		Ddal d2 = (Ddal)u;	// down casting
	}

}
