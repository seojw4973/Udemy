package com.ifstatement.examples;

public class SwitchStatementRunner {

	public static void main(String[] args) {
		puzzle2();
		puzzle3();
		puzzle4();
	}
	
	private static void puzzle2() {
		int number =2;
		switch(number) {
		case 1:
			System.out.println(1);
			break;
		case 2:						// case에 구문이 없을 경우, fall through 현상 발생 : 다음 case문의 구문이 실행됨. 
		case 3:
			System.out.println("Number is 2 or 3");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
		
	private static void puzzle3() {
		int number = 10;
		switch(number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("Default");
			break;
		}
	}
		
		private static void puzzle4() {
			int number = 10;
			switch(number) {
			default:
				System.out.println("Default");
				break;
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			
			}
			// puzzle5 : char, int, byte, short 등에서만 switch 사용가능 string/enum도 가능
			// puzzle6 : 조건이 case안에 올 수 없음
	
	}

}
