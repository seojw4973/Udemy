package udemy01;

public class BiNumber {
	private int num1;
	private int num2;
	
	public BiNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add(){
		int sum = num1 + num2;
		return sum;
	}
	
	public int multiply() {
		int mul = num1*num2;
		return mul;
	}

	public void doubleValue() {
		this.num1 *= 2;
		this.num2 *= 2;
	}

	public int getNumber1() {
		return num1;
	}
	
	public int getNumber2() {
		return num2;
	}
	
	
	
	
}
