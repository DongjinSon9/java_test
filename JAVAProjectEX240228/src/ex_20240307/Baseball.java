package ex_20240307;

public class Baseball extends Sports implements Interface1 {

	public Baseball(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
		super(sportsName, sportsMemberCount, sportsPlayTime, sportsPlace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInOutPlace(int checkInOutPlace) {
		if (checkInOutPlace == 1) {
			System.out.println("실내 스포츠입니다.");
		} else {
			System.out.println("실외 스포츠입니다.");
		}

	}

	@Override
	public void showUseItems(String[] items) {
		System.out.print("사용장비 : ");
		for (String item : items) {
			System.out.println(item + " ");
		}

	}

	@Override
	public void showTeamNameOrMember(String[] teamOrMember) {
		System.out.println("팀원 및 팀원 소개 : ");
		for (String teamMember : teamOrMember) {
			System.out.println(teamMember + " ");
		}

	}

}