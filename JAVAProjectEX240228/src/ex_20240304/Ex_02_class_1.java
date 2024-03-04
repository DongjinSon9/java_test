package ex_20240304;

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
		
		ani2.name = "ani2";
		ani2.age = 10;
		ani2.introduceMethod();
		ani2.soundMethod();
		
		// 불만사항, 요구사항
		// 1. 클래스 내부에 또다른 클래스가 있음
		//    => 파일을 분리 했음.
		// 2. 인스턴스를 생성시 매번 인스턴스에 점을 찍고 재할당하는 부분
		//    => 선언시 기본값을 미리 할당하고 생성하기
		//       Animal ani4 = new Animal("ani4", 10);
		Animal ani4 = new Animal("ani4", 10);
		ani4.introduceMethod();
		ani4.soundMethod();
		
		// 매개변수가 3개인 생성자
		Animal ani5 = new Animal("개", 10, "멍멍");
		ani5.introduceMethod();
		ani5.soundMethod();
		
		
		// 3. 해당 기능들이 각각의 동물 이름이나 나이 등을 각각 출력하는 방법
		
		String [] likeFoodLiStrings = {"고기", "사료"};
		
		
		Animal ani6 = new Animal("똘똘이", 5, "멍멍", likeFoodLiStrings);
		ani6.introduceMethod();
		ani6.soundMethod();
		ani6.likeFoodList(likeFoodLiStrings);
		
		
		
		
		
		// 또 다른 예) Idol 클래스 만들고
		// 1. 그룹명, 2. 그룹인원, 3. 그룹원이름
		
		// 기능
		// 1. 소개(그룹이름으로), 2. 그룹원의 이름 소개, 3. 앨범이름 소개하는 기능
		// 인스턴스 BTS, 블랙핑크

	}

}
