package basic4;

public class CalculatorExpr {
	
	 int num1 ;
	 int num2 ;
	
	public CalculatorExpr () {}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getAddition() {
		return num1 + num2 ;
		
	}
	public int getSubtraction() {
		return num1 - num2 ;
	}
	public int getMultiplication() {
		return num1 * this.num2 ;
	}
	public double getDivision() {
		return num1 / (double)num2 ;
	}
	
	public void output() {
		System.out.println("덧셈: " + getAddition());
		System.out.println("뺏셈: " + getSubtraction());
		System.out.println("곱셈: " + getMultiplication());
		System.out.println("나눗셈: " + getDivision());
	}
	

	

}
