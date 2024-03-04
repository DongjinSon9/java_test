package ex_20240304;

public class Ex_04_class_Circle {

	public static void main(String[] args) {
		// 클래스 사용.
		// 클래스명 레퍼런스 변수 = new 클래스명();
		// 클래스명() = 디폴트 생성자.
		// 생성자를 호출한다.

		Circle koreanPizza = new Circle();
		// 클래스 필드의 접근 지정자가, public 이면 보여서, 접근이 가능함.
//		koreanPizza.radius = 10;
//		koreanPizza.name = "김치전";
		// 안보이네 , 그러면 어쩔? setter/ getter 로 접근이 가능한 매개체를 만들기.
		// 클래스에서 만들기.
		// setter 이용해서 값 설정
		koreanPizza.setName("부추전");
		koreanPizza.setRadius(15);
		// 메서드를 이용해서 정보 접근
		koreanPizza.showInfo();
		
		// getter 이용해서 정보 접근
		System.out.println("getter로 접근 " + koreanPizza.getName());
		System.out.println("getter로 접근 " + koreanPizza.getRadius());
		
		
		// 김치전
		Circle kimchiPizza = new Circle(20, "김치전");
		kimchiPizza.calcGetArea();
		kimchiPizza.showInfo();
		System.out.println("----------------------------");
		
		
		// 배열에 담을 타입을 레퍼런스형으로 변경
		Circle[] koreanPizzas = new Circle[5];
		koreanPizzas[0] = koreanPizza;
		koreanPizzas[1] = kimchiPizza;
		koreanPizzas[2] = new Circle(10, "감자전");
		koreanPizzas[3] = new Circle(10, "육전");
		koreanPizzas[4] = new Circle(15, "명태전");
		
		// 배열의 선언과 초기화를 동시에 하기
		Circle[] koreanPizzas2 = {koreanPizza, kimchiPizza, new Circle(10, "감자전"), new Circle(10, "육전"), new Circle(15, "명태전")};
		
		
		// 반복문을 이용해서 배열에 담은 circle 타입의 레퍼런스에 각각 접근해서
		// showinfo에 호출 해보기
		// for ~ each 문법 : for(담을변수타입 변수명 : 컬렉션(배열))
		for(Circle koreanFood  : koreanPizzas) {
			koreanFood.showInfo();
		}
		
		for(Circle koreanFood2  : koreanPizzas2) {
			koreanFood2.showInfo();
		}

	}

}
