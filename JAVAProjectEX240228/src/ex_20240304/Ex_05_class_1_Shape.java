package ex_20240304;

public class Ex_05_class_1_Shape {

	public static void main(String[] args) {
		// 자식 클래스에서 부모 클래스의 접근 지정자가 protected이면 보인다
		Triangle tri1 = new Triangle();
		int protectedVarString = tri1.edgePoint;
		
		// 자식 클래스가 아니라서 상속을 안 받았고 protected가 안 보인다
		Rectangle rec1 = new Rectangle();
		rec1.
	}

}
