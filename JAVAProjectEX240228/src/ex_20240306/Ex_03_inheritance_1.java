package ex_20240306;

// 부모 클래스
// 클래스 정의
class A2 {
	public A2() {
		System.out.println("생성자a2");
	};
}

class B extends A2 {
	public B() {
		System.out.println("생성자B");
	};
}

class C extends B {
	public C() {
		System.out.println("생성자C");
	};
}


public class Ex_03_inheritance_1 {

	public static void main(String[] args) {
		// 클래스 사용
		C c1 = new C();
		System.out.println("부모 클래스 먼저 생성자 호출 확인.");
		// 디버깅 해보기 브레이크 포인트 잡고
		// 디버그 실행 ( f11)

	}

}
