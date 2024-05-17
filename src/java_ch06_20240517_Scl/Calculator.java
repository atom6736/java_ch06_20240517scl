package java_ch06_20240517_Scl;

public class Calculator {

	int fristNum;  // 인스턴스 멤버
	int secondNum; // 인스턴스 멤버
	
	static int thirdNum; // 정적 맴베( 변수) 스태틱으로 지정하면 인스터스와 구분하기 위해 자동으로 이탤릭체
	
	final static double PI = 3.121592;  //한번 선언될 때 초기화되면 그 값음 변경 불가. 그래서 관례상 대문자로 표기. 눈에 띄도록. 
	// 다른 클레스에서 이 값을 가져다 써도 변경해서 못 쓰는구나라고 알게 함. -> final로 선언.
	
	static final double SALERATE = 0.7; // 상수 선언. 상수 항상상 안변하는 것. 대문자로 쓰면 자동으로 진하고 기울기체로 바뀜.
	// final은 프로그램 내에서 가끔 쓰이미. final의 위치를 보통은 static 다음에 쓴다. 관례상 그렇다. 바꿔써도 에러는 나지 않지만.
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(int fristNum, int secondNum) {
		super();
		this.fristNum = fristNum;
		this.secondNum = secondNum;
	}
	
	public int add() {
		return this.fristNum + this.secondNum;
	}
	
//	public static int minus(int firstNum, int secondNum) {
//		return this.firstNum - this.secondNum;
//	}
}
