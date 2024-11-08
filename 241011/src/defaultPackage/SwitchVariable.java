package defaultPackage;

public class SwitchVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iValue1 = 5;
		int iValue2 = 8;
		int temp = 0;
		
		System.out.println("1. iValue1: " + iValue1);
		System.out.println("1. iValue2: " + iValue2);
		System.out.println("Change Value -----------------");
		temp = iValue1;
		iValue1 = iValue2;
		iValue2 = temp;
		System.out.println("2. iValue1: " + iValue1);
		System.out.println("2. iValue2: " + iValue2);
		
	}	

}
