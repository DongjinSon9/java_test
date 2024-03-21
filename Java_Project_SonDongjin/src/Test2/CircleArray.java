package Test2;

import java.util.Scanner;

public class CircleArray extends Circle{
	
	public CircleArray(int radius) {
		super(radius);
	}

	public static void main(String[] args) {
		
		int [] circleRadius = new int [4];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < circleRadius.length; i++) {
		System.out.print((i+1) + " 반지름 >> ");
		circleRadius[i] = scanner.nextInt();		
		}

		scanner.close();
		System.out.println("저장하였습니다...");
		
		double total = 0;
		
		for(int i = 0; i < circleRadius.length; i++) {
			Circle circle = new Circle(circleRadius[i]);
			total += circle.getArea();
		}
		
		System.out.println("원의 면적 전체의 합은 " + total);

	}

}
