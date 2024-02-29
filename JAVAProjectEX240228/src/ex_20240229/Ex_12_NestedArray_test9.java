package ex_20240229;

import java.security.PublicKey;
import java.util.Scanner;

public class Ex_12_NestedArray_test9 {

	public static void main(String[] args) {
		// 국영수 3과목의 점수를 입력 받아서 평균 총점
		// 1) 기본 배열을 만들어서 1번 학생 : {70, 80, 90} 이런 형식으로 이중 배열로 5명의 점수를 더미로
		int score[][] = { 
				{ 10, 16 }, 
				{ 12, 90 }, 
				{ 100, 11 }, 
				{ 86, 80 }, 
				{ 96, 19 } 
				};
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score.length; j++) {
				}
			System.out.println((i+1) + "번 학생의 총점 : " + sum + ", 평균 : " + sum/3);
			};
			
			public static void showSumAndAvg() {
				for(int i=0; i<score.length; i++) {
					int sum = 0;
					for(int j=0; j<score.length; j++) {
						}
					System.out.println((i+1) + "번 학생의 총점 : " + sum + ", 평균 : " + sum/3);
					};
			}
			}; 
			
			showSumAndAvg(score);


		// 2) 스캐너에서 학생수 몇 명 입력하고 스캐너에서 해당 임의의 점수를 직접 입력해서 집계
		// 점수 입력하려니까 현타와서 자동으로 할당하기로 함 ㅋ;
			
			
	
		// 3) 학생수도 임의로 1명 이상 10명 미만으로 자동 설정 , 점수도 자동으로 60이상 100 미만 입력되고 집계
		// 함수로 만들기
	}
	}
