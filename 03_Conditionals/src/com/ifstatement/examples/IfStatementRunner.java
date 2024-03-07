package com.ifstatement.examples;

public class IfStatementRunner {
	public static void main(String[] args) {
		puzzle1();
		puzzle2();
		puzzle3();
		puzzle5();
	}
	private static void puzzle1() {
		int k= 15;
		if(k>20) {
			System.out.println(1);
		}else if(k>10) {
			System.out.println(2);
		}else if(k<20) {
			System.out.println(3);		// 앞의 조건이 참이므로 뒤의 else if 확인하지 않음
		}else {
			System.out.println(4);
		}
	}
	
	private static void puzzle2() {
		int l =15;
		// 아래의 조건문은 서로 독립적이므로, 처음 if의 출력문이 출력되고, else의 출력문도 출력됨
		// {}를 확실하게 입력할 것!
		if(l<20)
			System.out.println("l<20");
		if(l>20)
			System.out.println("l>20");
		else
			System.out.println("Who am I");
	}
	
	private static void puzzle3() {
		int m = 15;
		
		if(m>20) {	// 이 코드는 하나의 블럭으로 묶여서 실행 -> m>20이 거짓이므로 아예 실행되지 않음
			if(m<20)
		System.out.println("m>20");
			else
		System.out.println("Who am I?");
		}
	}
	// puzzle4 : 자바는 정수를 조건의 자리에 사용할 수 없음
	
	private static void puzzle5() {		
		int number =5;
		if(number<0)
			number = number +10;
			number++;				// if문에 속하지 않음 number<0이 아니므로 number++ 실행
		System.out.println(number);
		
	}
	
}
