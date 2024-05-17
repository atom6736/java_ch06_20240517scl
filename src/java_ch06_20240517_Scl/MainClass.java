package java_ch06_20240517_Scl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal1 = new Calculator(10, 20);
		
		int result1 = cal1.add(); // 10+20=30 이 반환됨.
		
		System.out.println(cal1.fristNum); // 10 이 찍힐 것.위의 9번 줄이 없다면 이런 값은 나오지 않을 것.
		
		Calculator.thirdNum = 0; // 정적 멤버는 클래스 이름을 쓰고 점을 찍으면 갖다 쓸 수가 있음(인스턴스멤버와 차이). 초기화가 안 되어 있으면 에러표시
		// 정적멤버로 선언하면 메모리에 thirtNum 이 자동으로 만들어짐. 그러니까 객체를 선언하지 않고도 메인클레스에서 갖다 쓸 수 있음.
		// 그것은 메모리에 상주하는 것을 의미하는 거니까 cal1에도 있고 그 밖에도 있는 것이 됨. 
		// 고정된 멤버로 사용하지 않고, 즉 객체를 생성하지 않고도 사용할 수 잇는 필드. 메소드도 선언할 때 앞에 static을 써 주면
		cal1.thirdNum = 10;
		
		Calculator.minus(20, 10);
		
		//
	}

}
