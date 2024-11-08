package defaultPackage;
import java.util.Scanner;
public class BasicVaribleInputOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int iNum1 = 0, iNum2=0, iNum3=0; 
		int max = 0, min = 999, mid = 0;
		System.out.printf("1. Insert 1 ~ 10 Value : \n");
		iNum1 = sc.nextInt();
		System.out.printf("2. Insert 1 ~ 10 Value : \n");
		iNum2 = sc.nextInt();
		System.out.printf("3. Insert 1 ~ 10 Value : \n");
		iNum3 = sc.nextInt();
		
		if(iNum1 > max) max = iNum1;
		if(iNum2 > max) max = iNum2;
		if(iNum3 > max) max = iNum3;
		//비효율..
		if(iNum1 < min) min = iNum1;
		if(iNum2 < min) min = iNum2;
		if(iNum3 < min) min = iNum3;
		
		if(iNum1 != max && iNum1 !=min) mid = iNum1;
		if(iNum2 != max && iNum2 !=min) mid = iNum2;
		if(iNum3 != max && iNum3 !=min) mid = iNum3;
		System.out.printf("[First]. %d, [Second].%d, [Third].%d", max ,mid, min);
	}
}
