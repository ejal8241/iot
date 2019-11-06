package fruit;

public class Fruitbuyer {
	// 상태 값 : 보유금액, 사과의 개수
		int myMoney = 10000;   // 보유금액 : 초기값은 10000
		int numofApple = 0;    // 보유한 사과의 개수 : 기본 값 0
		
		Fruitbuyer(int money){
			myMoney = money;
			// numOfApple = 0
		}
		// 기능 : 구매, 현재 구매현황
	  
		// 구매 : 
		// 구매할 셀러, 구매할 금액 -> 
		// 셀러에게 판매 요청(금액 전달) -> 
		// 반환 받은 사과의 개수로 사과의 개수를 변경 -> 
		// 보유한 금액 변경
		void buyApple(Fruitseller seller, int money) {   // 괄호안 : 매개변수 지정  -> 구매할 셀러 
			// 구매한 사과의 개수 = num
			int num = seller.saleApple(money);
			//numofApple = numofApple + num;
			numofApple += num;   // 위의거랑 같은 뜻         사과의 개수 변경
			myMoney -= money;    // 보유 금액 변경
			
			}
		
		void showBuyResult() {
			System.out.println("현재 보유금액 : " + myMoney);
			System.out.println("사과의 개수 : " + numofApple);
			
		}
		
}
