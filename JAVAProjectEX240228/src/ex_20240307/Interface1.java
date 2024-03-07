package ex_20240307;


public interface Interface1 {
		// 인터페이스 설계, 구성 : 1) 상수  2) 추상 메서드
		// 반드시 이 기능은 구현해야하는 것들
		// 1) 실내인지 실외인지 알려주는 기능
		// 2) 사용하는 운동 도구를 알려주는 기능
		// 3) 팀명 또는 팀원을 알려주는 기능
	void showInOutPlace(int checkInOutPlace);
	void showUseItems(String [] items);
	void showTeamNameOrMember(String [] teamOrMember);

}
