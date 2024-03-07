package udemy01;

public class MotorBike {
	private int speed;
	
	MotorBike(){
		this(5); // -> this(5);가 아래의 MotorBike 생성자를 호출
	}
	
	// 생성자의 메서드명은 클래스명과 동일(대소문자도 동일해야함)
	MotorBike(int speed){
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("Bike Started");
	}
	
	public void setSpeed(int speed) {
		if(speed>0)
			this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}
