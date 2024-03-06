package udemy02;

public class MyChar {
	private char c;
	
	public MyChar(char c) {
		this.c = c;
	}

	public boolean isVoewl() {
		if(c == 'a' || c=='e'|| c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'|| c=='U') {
			return true;
		}else {
		return false;
		}
		
	}

	public boolean isDigit() {
		if(c >=48 && c<=57) {		// c가 0~9사이에 속하면 true, 아니면 false
		return true;
		}else {
		return false;
		}
	}
	public boolean isAlphabet() {
		if(c>=97 && c<=122) {		// c가 a~z 중에 속하면 true, 아니면 false
		return true;
		}
		if(c>=65 && c<=90) {		// c가 A~Z 중에 속하면 true, 아니면 false
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isConsonant() {		// 알파벳이면서 자음이면 true, 둘 중 하나라도 아니면 false
		if(isAlphabet() && !isVoewl() ) {
			return true;
		}else {
		return false;
		}
	}

	public static void printLowerCaseAlphabets() {	// 소문자 a~z 출력
		 for(char ch ='a';ch<='z';ch++) {
			 System.out.print(ch);
		 }
	}
	public static void printUpperCaseAlphabets() {	// 대문자 A~Z 출력
		for(char ch ='A';ch<='Z';ch++) {
			 System.out.print(ch);
		 }
	}
	
	
	

}
