package ex_20240307;

public class Main {

	public static void main(String[] args) {
//		Util util = new Util();
		
		Sports swimming = new Swimming("수영", 1, "10분 이내", "부산 사직 아시아드");
		swimming.showInfo();
		swimming.showPlace();
		
		// 시즌 설정
//		Season summer = Season.SUMMER;
//		swimming.setSeason(summer);
//		System.out.println("개막 시즌 : " + swimming.getSeason());
		Util.showSeason(swimming, 2);
		
		
		// 시간 설정
		// date 타입 -> 문자열 타입으로 변환
//		LocalDate currentDate = LocalDate.now();
//		String createTime = currentDate.toString();
//		swimming.setCreateTime(createTime);
//		System.out.println("수영 등록 시간 : " + swimming.getCreateTime());
		Util.showDate();  // 전역변수를 통해 간소화

		
		// 인터페이스에서 정의한 추상 메서드 사용
//		void showInOutPlace(int checkInOutPlace);
//		void showUseItems(String [] items);
//		void showTeamNameOrMember(String [] teamOrMember);
		// 현재 다형성으로 부모 타입으로 받아서 현재 보이는 메서드는 부모만 보임
		//  다운캐스팅
		Swimming swimming2 = (Swimming)swimming;
		// 다시 메서드를 조회해보면 자식이 재정의한 것도 보인다.
		swimming2.showInOutPlace(1);
		// 수영 선수 소개
		String [] members = {"선수1", "선수2", "선수3", "선수4", "선수5", "선수6", "선수7", "선수8"};
		swimming2.showTeamNameOrMember(members);
		// 수영 아이템
		String [] itemStrings = {"수경", "수영모", "수경", "귀마개", "오리발"};
		swimming2.showUseItems(itemStrings);
		
		
		
		
		Sports baseball = new Baseball("야구", 9, "약 3시간 전후", "사직야구장");
		baseball.showInfo();
		baseball.showPlace();
		Util.showDate();
		Util.showSeason(baseball, 1);
		

	}

}
