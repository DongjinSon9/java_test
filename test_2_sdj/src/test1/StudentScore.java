package test1;


public class StudentScore {

	int[][] scores = { { 80, 60, 70 }, 
					   { 90, 95, 80 }, 
					   { 75, 80, 100 }, 
					   { 80, 70, 95 }, 
					   { 100, 65, 80 } };
	
	public static void main(String[] args) {	
		
		StudentScore studentScore = new StudentScore();
		
		System.out.println("학생번호   국어  영어   수학   총점   평균");
		System.out.println("==================================");
		studentScore.showScore();
	}
	
	
	public void showScore() {
	    for (int i = 0; i < scores.length; i++) {
	    	int total = 0;
	        System.out.print((i + 1) + "번 학생 : ");
	        for (int j = 0; j < scores[i].length; j++) {
				total += scores[i][j];
	            System.out.print(scores[i][j] + "   ");
	        }
	        System.out.print(total + "   " + total/3 + ".0");
	        System.out.println();
	    }
	}
}
