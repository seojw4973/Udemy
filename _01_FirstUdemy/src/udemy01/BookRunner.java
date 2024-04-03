package udemy01;

public class BookRunner {
	public static void main(String[] args) {

		Book java = new Book(1000);
		Book js = new Book(2000);
		Book cleanCode = new Book(40);

		System.out.println(java.getNoOfCopies());
		System.out.println(js.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		
		java.setNoOfCopies(2000);
		js.setNoOfCopies(500);
		cleanCode.setNoOfCopies(30);
		
		System.out.println(java.getNoOfCopies());
		System.out.println(js.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		
		java.increadNoOfCopies(300);
		js.increadNoOfCopies(500);
		cleanCode.increadNoOfCopies(70);
		
		System.out.println(java.getNoOfCopies());
		System.out.println(js.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		
		java.decreadNoOfCopies(1300);
		js.decreadNoOfCopies(100);
		cleanCode.decreadNoOfCopies(50);
		
		System.out.println(java.getNoOfCopies());
		System.out.println(js.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}
}
