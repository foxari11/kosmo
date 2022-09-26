package singleton;

public class MainTest {

	public static void main(String[] args) {
		
		workA a = new workA();
		a.use();
		
		workB b = new workB();
		b.use();
		
		workC c = new workC();
		c.use();

	}

}
