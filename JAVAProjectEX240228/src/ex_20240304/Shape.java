package ex_20240304;

public class Shape {
	private String name;
	// 잡근 지정자 생략하면 디폴트
	// 같은 패키지 내부에서 접근이 가능함
	String color;
	
	// 상속 받은 자식 클래스에서만 접근이 가능함.
	protected int edgePoint;

}
