package ex_20240304;


//또 다른 예) Idol 클래스 만들고
// 1. 그룹명
// 2. 그룹인원   > 멤버 배열의 크기로 대체
// 3. 그룹원이름
// 4. 앨범들 중에서 몇 개만 넣기

// 기능
// 1. 소개(그룹이름으로), 2. 그룹원의 이름 소개, 3. 앨범이름 소개하는 기능
// 인스턴스 BTS, 블랙핑크

public class Idol {
	public String groupName;
//	public int groupNumber;
	// 해당 멤버를 받는 배열의 크기로 대체.
	public String[] groupMembers;
	public String[] groupAlbums;

	// 매개변수가 3개인 생성자를 만들면 됨
	// 디폴트 생성자는 안 만든다.

	public Idol(String groupName, String[] groupMembers, String[] groupAlbums) {
		this.groupName = groupName;
		this.groupAlbums = groupAlbums;
		this.groupMembers = groupMembers;

		// 인스턴스 생성시 바로 인사하기
		System.out.println("안녕하세요, 아이돌 " + groupName + "입니다.");
	}
		

	// 인스턴스 메서드라고 합니다
	// 기존에 앞에서 사용했던 static을 이용해서 만들었던 클래스 메서드와 비교되는 부분
	// 이 메서드는 인스턴스를 만들고 나서 사용이 가능합니다.
	public void introduceMember() {
		for(String member : this.groupMembers) {
			System.out.println(groupName + "의 " + member + "입니다.");
		};
	}

	public void introduceAlbum() {
		for(String album : this.groupAlbums) {
			System.out.println("앨범은 " + album + " 등이 있습니다.");
		};
	}

}
