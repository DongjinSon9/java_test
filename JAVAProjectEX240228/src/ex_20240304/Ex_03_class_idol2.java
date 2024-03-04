package ex_20240304;

import java.util.Scanner;

public class Ex_03_class_idol2 {

	public static void main(String[] args) {
		// Idol 클래스 사용
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이돌 그룹명을 입력해주세요>>");
		String groupNameString = scanner.next();

		System.out.println("그룹은 몇명인가?>>");
		int groupMemberNumber = scanner.nextInt();

		System.out.println("아이돌 그룹멤버를 입력해주세요(예, 공백으로 구분해서 넣기)>>");
		String[] groupMember = new String[groupMemberNumber];
		for (int i = 0; i < groupMember.length; i++) {
			groupMember[i] = scanner.next();
		}

		System.out.println("대표 앨범 3개만 입력해주세요(예, 공백으로 구분해서 넣기)>>");
		String[] groupAlbum = new String[3];
		for (int i = 0; i < groupAlbum.length; i++) {
			groupAlbum[i] = scanner.next();
		}

		System.out.println("주요 활동 지역 3개만 입력해주세요(예, 공백으로 구분해서 넣기)>>");
		String[] areaActivity = new String[3];
		for (int i = 0; i < areaActivity.length; i++) {
			areaActivity[i] = scanner.next();
		}

		// Idol(String groupName, String[] groupMembers, String[] groupAlbums)
		// BTS
//		Idol idol = new Idol(groupNameString, groupMember, groupAlbum );
//		idol.introduceMember();
//		idol.introduceAlbum();
		
		// 블랙핑크라고 만들었고, 아이돌 클래스를 상속을 받았음. 
		// 사용하기. 
//		BlackPink blackPink = new BlackPink(groupNameString, groupMember, groupAlbum, areaActivity);
//		blackPink.introduceMember();
//		blackPink.introduceAlbum();
//		blackPink.infoActivityArea();
		
		
		// 다형성 보여주기
		// 부모 타입으로 받는다. 작은 집 -> 큰 집으로 갈때는 문제가 없다
		// 주의사항) blackpink는 idol이면서 blackpink이다.
		// 하지만 타입이 부모이기 때문에 이 인스턴스를 실행하게 되면 바라보는 레퍼런스는 부모를 보게 됩니다.
		// 부모의 기능만 구현이 되고 자식의 클래스를 사용하고 싶다면 다운캐스팅을 해야한다.
		// 부모 클래스 -> 자식 클래스 다운 캐스팅 함
		Idol blackPink = new BlackPink(groupNameString, groupMember, groupAlbum, areaActivity);
		blackPink.introduceMember();
		blackPink.introduceAlbum();
		// 자식에서 기능을 하나 추가했지만 객체로 점 찍고 메서드를 확인해도 자식에서 정의한 메서드가 안 보인다.
		// 다형성을 이용해서 사용을 하지만 실제 사용은 부모 클래스 것 밖에 사용을 못 한다.
		
		// 부모타입을 다시 자식 타입으로 변경을 해서 원래 자식에서 만들었던 활동 지역 기능을 사용해보기
		// 형변환 ' () ' 을 이용해서 강제로 자식형으로 변경시킨다.
		BlackPink blackpink2 = (BlackPink)blackPink;
		blackpink2.infoActivityArea();  // 사용가능
		
		// 왜 굳이 다형성으로 하냐?
		// 재정의를 할 때 유연한 작업을 하기 위해서   . 유지보수<<
		// 상속에서 모든 클래스들의 최고 부모 클래스는 Object 클래스. 암묵적으로 다 상속을 받고 있다.
		// 부모-자식 간에 타입 변환을 용이하게 해서 유지보수를 편하게 하기 위해서.
		
		
		scanner.close();

	}


}
