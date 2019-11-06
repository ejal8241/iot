package fruit;

public class Fruitsellermain {
public static void main(String[] args) {
		
		// 셀러 생성
		Fruitseller seller;   // 참조변수 생성 : 인스턴스의 주소를 저장
	    //seller = new Fruitseller(0, 30, 1500);   // new : 인스턴스 생성 -> 인스턴스 메모레의 주소값을 반환
		seller = new Fruitseller();  
		// 바이어 생성
	    
	    // 셀러 2생성
//	    Fruitseller seller2 = new Fruitseller(0, 10, 1000);
	    Fruitseller seller2 = new Fruitseller(seller);
		
		
	    // 바이어 생성
	    Fruitbuyer buyer = new Fruitbuyer(10000);
	    
	    // 구매자가 5000원 어치 사과를 구매
	    buyer.buyApple(seller, 3000);
	    buyer.buyApple(seller2, 3000);
	    
	    System.out.println("판매자의 현재 상황");
	    seller.showSaleResult();
	    
	    System.out.println("구매자의 현재 상황");
	    buyer.showBuyResult();
	    
		

	}
}
