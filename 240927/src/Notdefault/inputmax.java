package Notdefault;
import java.util.Scanner;	

public class inputmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("1. Input Integer value : ");
		int iNum1 = Integer.parseInt(scanner.nextLine());
		System.out.printf("2. Input Integer value : ");
		int iNum2 = Integer.parseInt(scanner.nextLine());
		int iTemp = 0;
		if(iNum2 >= iNum1) {
			iTemp = iNum2;
			iNum2 = iNum1;
			iNum1 = iTemp;
		}
		System.out.printf("Oubput iSecVal : %d\n", iNum1);
		System.out.printf("Oubput iSecVal : %d\n", iNum2);
	}

}
