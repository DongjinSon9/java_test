package ex_20240307;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Sports swimming = new Swimming("수영", 1, "10분 이내", "부산 사직 아시아드");
		swimming.showInfo();
		swimming.showPlace();
		
		// 시즌 설정
		Season summer = Season.SUMMER;
		swimming.setSeason(summer);
		System.out.println("개막 시즌 : " + swimming.getSeason());
		
		
		// 시간 설정
		// date 타입 -> 문자열 타입으로 변환
		LocalDate currentDate = LocalDate.now();
		String createTime = currentDate.toString();
		swimming.setCreateTime(createTime);
		System.out.println("수영 등록 시간 : " + swimming.getCreateTime());
		
		

	}

}
