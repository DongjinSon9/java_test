package ex_20240306;

// 부모 클래스
// 클래스 정의

// 클래스 구조 : C -> B -> A2
class A2 {
	public A2() {
		System.out.println("생성자a2");
	}
}

class B extends A2 {
	public B() {
		System.out.println("생성자B");
	}
	public void showInfo() {
		System.out.println("b클래스");
	}
}

class C extends B {
	public C() {
		System.out.println("생성자C");
	}
	
	// 부모클래스의 메서드를 오버라이딩 했음
	// 내가 부모메서드를 재정의 했으니 시스템에게 알려줌
	// 혹시라도 컴파일러 체크시 문제가 있다면 알려달라고
	@Override
	public void showInfo() {
		System.out.println("c클래스");
	}
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
		
		// b, c 에 같은 이름의 메서드가 있음
		// c는 부모 클래스의 메서드를 재정의 했음
		
		// 원래 자기 타입으로 인스턴스를 생성 작은집 = 작은집
		System.out.println("===========오버라이딩 확인중============");
		
		B testB = new B();
		testB.showInfo();
		
		
		// 부모 타입으로 인스턴스를 생성 (다형성) 큰집 = 작은집
		B testC = new C();
		testC.showInfo();
		
		// 결론, 자식클래스가 부모클래스의 메서드를 오버라이딩 하면 자식이 우선이다.
		
	}

}
