package Pack_3;

import Pack_1.Plus;
import Pack_2.Minus;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plus ps = new Plus();
		int iRsltP = ps.PlusMethod(7, 3);
		System.out.println("1.iRslt : " + iRsltP);
		
		Minus ms = new Minus();
		int iRsltM = ms.MinusMethod(7, 3);
		System.out.println("2.iRslt : " + iRsltM);
	}

}
