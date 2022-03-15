package chap06_07.Ex02;
public class Car {
	
	String company ; 
	String model ; 
	String color ; 
	int maxSpeed ;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {	// Ram 의 값을 부여함
		this.company = company;					// this : 자신의 개체
	}			// 메소드에 인풋되는 변수명, 인풋되는 변수를 받는 변수명, 메모리에 로드할 변수명이 같을때(this.메모리에로드할변수명)
	public String getModel() {
		return model;
	}
	public void setModel(String mo) {		// 인풋되는변수, 인풋받는변수, 메모리에 로드할변수명 다를경우 this생략가능
		this.model = mo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	

}
