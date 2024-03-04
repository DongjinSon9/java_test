package ex_20240304;

class Animal {
	// 하나의 클래스에는 각각 한 개씩 원래 사용을 함
	// 지금은 예시로 클래스 안에 ㄸ다른 클래스를 보여주기용
	// 파일을 분리함
	
	// 클래스 : 설계도, 공장
	// 실체 : 체품 , 인스턴스라고 부른다.
	
	// 구성 : 멤버(변수), 메서드(기능)
	
	
//	private String name;   외부 접근이 안 돼서 public으로 전환
//	private int age; 
	public String name;
	public int age;
	
	// 메서드 : 소개하는 기능, 소리 기능
	
	public void introduceMethod()  {
		System.out.println("안녕하세요 현재는 더미로 작업 중, 곧 동적으로 할 예정임");
	}
	
	public void soundMethod() {
		System.out.println("현재는 더미로 소리를 냅니다. 곧 동적으로 할 예정임");
	}
	
	
	
}

public class Ex_02_class_1 {

	public static void main(String[] args) {
		// 클래스 사용
		// 기본 문법) 클래스명 레퍼런스변수명 = new 클래스명();
		// new 뒤에 클래스명() => 생성자라고 부름, 해당 인스턴스를 초기화시 사용
		// 지금은 디폴트 생성자로 만들고 매개변수를 이용해서 생성자를 만들 계획
		// 오버로딩이라는 개념도 간단히 언급하고 this라는 키워드도 간단히 언급을 할 예정
		
		Animal ani1 = new Animal();  // 공장에서 찍어내듯이 만들기. 인스턴스
		Animal ani2 = new Animal();  // 각각의 인스턴스는 다르다.
		Animal ani3 = new Animal();  // 프로그래밍에서는 각각의 인스턴스들의 가리키는 메모리 위치 주소와 다릅니다
		
		// 사용방법 객체 사용법 ? -> 점 연산자를 이용해서 표현 수납도구에서 꺼내듯이 사용함
		// 접근지정자를 private으로 선언을 하면 이처럼 외부에서 접근이 안 됨
		// setter/getter를 이용.
		// 다시 접근지정자를 선택을 하면 private -> public
		ani1.name = "ani1";
		ani1.age = 10;
		ani1.introduceMethod();
		ani1.soundMethod();

	}

}
