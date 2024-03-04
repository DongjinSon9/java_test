package ex_20240304;

import java.security.PublicKey;

// 클래스 파일을 새로만들어서 분리
// 같은 폴더에 있으면 상관없지만 다른 폴더로 가면 import를 사용해야 한다.
public class Animal {

	// 하나의 클래스에는 각각 한 개씩 원래 사용을 함
	// 지금은 예시로 클래스 안에 또 다른 클래스를 보여주기용
	// 파일을 분리함

	// 클래스 : 설계도, 공장
	// 실체 : 체품 , 인스턴스라고 부른다.

	// 구성 : 멤버(변수), 메서드(기능)

//		private String name;   외부 접근이 안 돼서 public으로 전환
//		private int age; 
	public String name;
	public int age;
	public String soundtype;
	// 동물이 좋아하는 음식
	public String[] favoriateFood;
	
	// 매개변수가 4개인 생성자를 만들기
	
	public Animal(String name, int age, String sound, String[] likefoods) {
		this.name = name;
		this.age = age;
		this.soundtype = sound;
		this.favoriateFood = likefoods;

	}
	
	

	// 매개변수가 2개인 생성자가 정의가 안 돼있음
	// Animal ani4 = new Animal("ani4", 10);
	// Animal ani4 = new Animal(); -> 디폴트 생성자
	// 디폴트 생성자는 생성자가 아무것도 없다면 시스템에서 알아서 만들어 줌
	// 하지만 개발자가 다른 생성자를 하나라도 만들게 되면 시스템에서 안 만들어줌
	// 생성자는 정의를
	// 클래스명()
	// 매개변수가 2개인 생성자를 만들었음 -> 디폴트 생성자는 시스템이 알아서 안 만들어준다.

	public Animal(String name, int age) {
		// 생성자 호출시 입력 받은 이름 나이 등을 현재의 인스턴스 값으로 교체를 하는데
		// 현재 해당 클래스에 속해 있음 this를 사용하는데 현재 클래스의 인스턴스를 가리킴
		this.name = name;
		this.age = age;

	}
	
	// 매개변수가 3개인 생성자
	public Animal(String name, int age, String sound) {
		this.name = name;
		this.age = age;
		this.soundtype = sound;

	}

	// 디폴트 생성자를 만들기
	public Animal() {

	}

	// 메서드 : 소개하는 기능, 소리 기능

	public void introduceMethod() {
//		System.out.println("안녕하세요 현재는 더미로 작업 중, 곧 동적으로 할 예정임");
		System.out.println("안녕하세요 제 이름은 " + this.name + "이고 나이는 " + this.age + "살 입니다.");
	}

	public void soundMethod() {
		System.out.println("제 소리는요 " + soundtype);
	}
	
	// 좋아하는 음식을 출력하는 기능
	public void likeFoodList(String [] likeFoodList) {
		for(int i = 0; i < likeFoodList.length; i++) {
			System.out.println("좋아하는 음식 : " + i + "번) " + likeFoodList[i] +'\t');
		}
	}

}
