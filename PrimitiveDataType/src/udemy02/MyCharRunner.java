package udemy02;

public class MyCharRunner {
	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');
		System.out.println(myChar.isVoewl());
		System.out.println(myChar.isDigit());
		
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets();
		System.out.println();
		MyChar.printUpperCaseAlphabets();		
	}
}
