package defaultPackage;

public class AppleBasketExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iAppleBasketSize = 12;
		int iAppleBasketCount = 100;
		int iAppleCount = 573;
		int iLeftOverBasket = 0;
		
		if(iAppleCount % iAppleBasketSize == 0) {
			iLeftOverBasket = iAppleBasketCount - (iAppleCount/iAppleBasketSize);
		}
		else {
			iLeftOverBasket = iAppleBasketCount - (iAppleCount/iAppleBasketSize)-1;
		}
		System.out.printf("빈 박스 수 : %d", iLeftOverBasket);
	}

}
