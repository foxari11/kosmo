package Account;

    class ac {
	int in = 0;
	int out = 0;
	String accountNum = "145454-456";
	String name = "자바맨";
	int last= 0 ;
	
	
	
	
	   void moneyin(int in) {
		System.out.println("입금액은 : " + in + " 입니다. ");
		System.out.println("남은 잔액은 : " + (last + in) + " 입니다. ");
		last += in;
}
	 
	   void moneyout(int out) {
		 System.out.println("인출액은 " + out + "입니다.");
		 if(last-out <0) {
			 System.out.println("잔액부족이여"); 
		 }else 
			 System.out.println("남은 잔액은 : " + (last - out)+ "입니다.");
		 last -= out;
	 }
	   
	   @Override
		public String toString() {
			return "[예금주 : " + name + "," +  "계좌번호: " + accountNum + "," 
					+ " 잔액 = " + last + "]";
		}
	 
    }
public class Main {

	public static void main(String[] args) {


		ac aaa = new ac();
		
		aaa.moneyin(500000);
		aaa.moneyout(60000);
		System.out.println(aaa);
		
		

	}

}
