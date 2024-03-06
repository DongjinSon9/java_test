package ex_20240306;

// 부모 클래스
// 클래스 정의

// 클래스 구조 : C -> B -> A2
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
		
		
		// instance of 예제
		// 다형성. 업캐스팅
		// 문제점 : 원래의 객체를 알기가 어렵다.
		A2 test1 = new A2();
		A2 test2 = new B();
		A2 test3 = new C();
		
		boolean result1 = (test2 instanceof B) ? true : false;
		System.out.println("test2 instanceof B : " + result1);
		
		boolean result2 = (test2 instanceof A2) ? true : false;
		System.out.println("test2 instanceof A2 : " + result2);
		
		boolean result3 = (test2 instanceof C) ? true : false;
		System.out.println("test2 instanceof C : " + result3);
		
	}

}
