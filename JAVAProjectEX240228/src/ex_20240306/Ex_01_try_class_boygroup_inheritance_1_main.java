package ex_20240306;

import ex_20240304.Idol;

public class Ex_01_try_class_boygroup_inheritance_1_main {

	public static void main(String[] args) {
		// 부모 클래스는 Idol이고 상속 받은 자식 클래스는 Ex_01_try_class_boygroup_inheritance_1 이다
		// 사용하기 -> 클래스명과 이름이 동일한 생성자로 초기화를 한다.
		// 기본 문법 : 클래스명 레퍼런스 변수명 = new 클래스명();
		// 클래스명() -> 생성자. 해당 객체를 인스턴스화해서 사용하기 위해.
		// 생성자 포맷 (String groupName, String[] groupMembers, String[] groupAlbums)
		
		// 배열 정의
		// 기본 문법
		// 방법 1 
		// 타입  [] 배열명 = new 타입[크기];		
		// String [] boygroups = new String[3];
		// 방법 2
		// 타입 [] 배열명 = {1, 2, 3};
		String [] boygroups = {"연습생1", "연습생2", "연습생3"};
		
		String [] boygroupsAlbum = {"앨범1", "앨범2", "앨범3"};
		
		Ex_01_try_class_boygroup_inheritance_1 boyGroup1 = new Ex_01_try_class_boygroup_inheritance_1("연습생 보이그룹1", boygroups, boygroupsAlbum);
		
		boyGroup1.introduceMember();
		boyGroup1.introduceAlbum();
		
		
		
		
		// 부모클래스명으로 참조형변수 = new 자식클래스명();
		// 참조형변수. >>>> 접근 가능한 메서드는 부모꺼만
		// 업캐스팅
//		Idol test = new Ex_01_try_class_boygroup_inheritance_1(null, boygroups, boygroupsAlbum);
//		test.   >>>>> 부모 메서드만 보인다.
		
		
		// 해당 인스턴스에서 부모 메서드만 보인다면, 자식 메서드를 보려면? 1) 업캐스팅 2) 다운캐스팅   >> 답 : 2) 다운캐스팅
		// 자식클래스명 레퍼런스명 = (자식클래스명) 부모클래스의인스턴스;
//		Ex_01_try_class_boygroup_inheritance_1 test2 = (Ex_01_try_class_boygroup_inheritance_1)test;
		
		
		
		// 접근 지정자 
		// 1) public : 모든 곳에서 접근 가능
		// 2) private : 해당 클래스 내부에서만 다 보이고, 다른 위치에서는 보이지 않는다. 접근해서 값을 설정하거나 가져오거나 할 때는 getter/stter가 필요
		// 3) default : 같은 패키지내부에서만 보인다
		// 4) protected : 상속 받은 자식 클래스에서만 보임
		// 1) call by value, 2) call by referance
		// 1) 매서드에서 인자값으로 전달시 복사해서 사용하고 지역변수에서 이용 후 소멸함
		// 2) 참조형으로(레퍼런스, 인스턴스) 메서드에 전달하면 해당 메모리 위치 주소값을 재사용하고
		// 메서드를 사용 후 소멸하지 않는다.

		
	}

}
