package udemy01;

public class Book {
	private int noOfCopies;
	
	public Book(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	
	public void increadNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}
	
	public void decreadNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}
