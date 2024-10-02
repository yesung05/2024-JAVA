
public class AppleBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iAppleCount = 120;
		int iBasketCount = 0;
		int iBasketMax = 10;
		
		iAppleCount = 1123;
		iBasketCount = 0;
		if(iAppleCount % iBasketMax == 0 ) {
			iBasketCount = (int)iAppleCount / iBasketMax;
		}
		else {
			iBasketCount = (int)(iAppleCount / iBasketMax)+1;
			
		}
		
		System.out.println("Basket Need : " +iBasketCount);
		
	}

}
