package udemy04;

public class Review {
	private int id;
	private String description;
	private int rating;
	
	// 생성자
	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}
	
	
	
}
