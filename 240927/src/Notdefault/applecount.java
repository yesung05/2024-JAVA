package Notdefault;

public class applecount {

	public static void main(String[] args) {
		int iApple = 123;
        int iBasket = 10;
        int iNeedBasket = (iApple%iBasket == 0) ? iApple/iBasket : iApple/iBasket+1;
        System.out.println("Total Need Bundle Count: " + iNeedBasket);
	}

}
