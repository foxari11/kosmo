package basic2;

public class Ex03_369C {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 1; i<= 10000; i++) {
			int su = i; 
			while( su !=0) {
				int na = su % 10;
				if(na==8)
				{
				count++;
				}
				su = su/10;
			}
			
		}
		
		System.out.println(count);

	}

}
