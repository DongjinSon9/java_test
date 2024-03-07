package ex_20240307;

import java.net.NoRouteToHostException;

public class Sports {
	// 주제
	// sports : 부모
	// 공통의 멤버 변수 3개, 1) 이름 2) 인원수 3) 경기 시간 4) 경기 장소
	
	private String sportsName;
	private int sportsMemberCount;
	private String sportsPlayTime;
	private String sportsPlace;
	
	// 스포츠 개막 시즌
	// getter/setter 이용
	private Season season;
	
	// 스포츠 등록시간 샘플
	private String createTime;
	
		
	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	
	
	// 매개변수가 4개인 생성자
	public Sports(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
		this.sportsName = sportsName;
		this.sportsMemberCount = sportsMemberCount;
		this.sportsPlayTime = sportsPlayTime;
		this.sportsPlace = sportsPlace;		
	}
	
	// getter/setter 구성 
	// setter 대신에 매개변수 4개인 생성자에서 미리 정보를 받는다
	
	public String getSportsName() {
		return sportsName;
	}

	public int getSportsMemberCount() {
		return sportsMemberCount;
	}

	public String getSportsPlayTime() {
		return sportsPlayTime;
	}

	public String getSportsPlace() {
		return sportsPlace;
	}
	
	// 공통의 기능 3개, 
	public void showInfo() {
		System.out.print("스포츠명 : " + this.sportsName);		
		System.out.print(", 인원수 : " + this.sportsMemberCount);
		System.out.println(", 경기시간 : " + this.sportsPlayTime);
	}
	
	public void showPlace() {
		System.out.println("경기장소 : " + this.sportsPlace);		
	}
	
	
	// 1) 이름, 인원수, 경기 시간을 알려주는 기능
	// 2) 운동 장소를 알려주는 기능
	// Enum 로 문자열로 만들기, 상수처럼
	
	// 3) 개막 계절을 알려주는 기능
	
	
	// swimming : 자식
	// baseball : 자식2

}
