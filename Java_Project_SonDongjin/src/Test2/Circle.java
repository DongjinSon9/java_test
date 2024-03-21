package Test2;

public class Circle {
	
	private int radius;
	public Circle(int radius) { 
	this.radius = radius;
	}
	public double getArea() { 
	return radius*radius*3.14; 
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
