package fruit;

public class Fruitseller {
	
	// 상태값 : 사과의 개수, 수익금, 사과의 가격
//	  int numofApple = 20;      // 사과의 개수
//    int myMoney = 0;          // 판매금액
//    final int APPLE_PRICE = 1000; // 사과 1개의 금액
    
    int numofApple;      // 사과의 개수
    int myMoney;          // 판매금액
    final int APPLE_PRICE; // 사과 1개의 금액
    
    // 생성자 만들기
    // 이름은 클래스이름과 동일하게, 매서드와 같이 매개변수를 정의할 수 있다.
    // return이 없다, 반환형 타입을 정의하지 않는다. -> 특징
    // 인스턴스 생성시에 단 한번 실행한다. -> 멤버변수의 초기화목적으로 사용한다. -> 초기화 매서드라고 한다. 
    // 디폴트 생성자는 생략 가능
    
//    public Fruitseller(int numofApple, int myMoney, int price) {     // 생성자를 만드는 것
//		this.numofApple = numofApple;
//		this.myMoney = myMoney;
//		APPLE_PRICE = price;
//		
//	} 
   
    
    
    public Fruitseller(int numofApple, int myMoney, int aPPLE_PRICE) {
		this.numofApple = numofApple;
		this.myMoney = myMoney;
		APPLE_PRICE = aPPLE_PRICE;
	}

    public Fruitseller(Fruitseller fs) {     // fs : 참조변수 주소
    	this.numofApple = fs.numofApple;
    	this.myMoney = fs.myMoney;
    	this.APPLE_PRICE = fs.APPLE_PRICE;
    	
    }
    
    public Fruitseller() {
    	this(0,20,500);  // this -> 다른 생성자를 호출함. 호출하는 기준 : 매개변수 
    }
	// 기능 : 판매, 판매 데이터 출력
    
    // 판매기능 : 돈을 받고 -> 사과의 개수를 계산 -> 사과의 개수를 변경 -> 돈의 수치 변경 -> 사과의 개수를 반환
    
    int saleApple(int money) {
    	// 판매할 사과의 개수
    	int num = money/APPLE_PRICE;    // num -> 사과의 개수
    	numofApple = numofApple - num; // 현재 보유한 사과의 개수 변경
    	myMoney = myMoney + money; // 보유한 돈의 데이터 변경
    	
    	return num;   // 사과의 개수 반환
    }
    
    // 판매 결과 출력
    void showSaleResult() {  
    	System.out.println("남은 사과의 개수 : " + numofApple); 
    	System.out.println("판매 수익 : " + myMoney);
    	
    	}
}
