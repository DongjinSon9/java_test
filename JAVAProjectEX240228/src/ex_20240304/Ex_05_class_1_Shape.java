package ex_20240304;

import ex_20240228_2.Shape_otherPackage;

public class Ex_05_class_1_Shape {

	public static void main(String[] args) {
		// 자식 클래스에서 부모 클래스의 접근 지정자가 protected이면 보인다
		Triangle tri1 = new Triangle();
		int protectedVarString = tri1.edgePoint;
		
		// 자식 클래스가 아니라서 상속을 안 받았고 protected가 안 보인다
		Rectangle rec1 = new Rectangle();
//		rec1.
		
		
		// 다른 패키지에 있는 파일을 불러오기
		// ctrl + shift + O       : 자동 Import
		Shape_otherPackage shape_otherPackage = new Shape_otherPackage();
//		shape_otherPackage.edgePoint2
//		shape_otherPackage.
		// 다른 패키지에 있는 디폴트 접근 지정자는 안 보인다
	
	}

}
