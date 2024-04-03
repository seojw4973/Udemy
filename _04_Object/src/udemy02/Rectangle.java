package udemy02;

public class Rectangle {
	
	// 필드
	private int length;
	private int width;
	
	// 생성자
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	
	
	// 메소드
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2 * (length + width);
	}
		
	public String toString() {
		return String.format("length - %d, width - %d, area - %d, perimeter - %d", length, width, area(), perimeter());
	}
	
	
}
