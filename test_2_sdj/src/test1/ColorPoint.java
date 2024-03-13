package test1;

import java.awt.Point;


public class ColorPoint extends Point {
	public String color;
	
	public ColorPoint(int y, int x, String color) {
	}

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setColor(String color) {	
		this.color = color;
	}
	public void show() {
		System.out.println(color + "색으로 (" + x + ", " + y +")");
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		 cp.setPoint(10, 20);
		 cp.setColor("GREEN");
		 cp.show();
		}
}
