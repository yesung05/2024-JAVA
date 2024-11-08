package chap04;

public class ReverseStarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iRepeatCount = 20;
		
		for(int i = 1; i<=iRepeatCount; i++) {
			for(int j = iRepeatCount; j > i; j--) {
				System.out.printf(" ");
			}
			for(int k = 0; k<i; k++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		for(int i = 0; i<=iRepeatCount; i++) {
			for(int k = 0; k < i; k++) {
				System.out.printf(" ");
			}
			for(int j = iRepeatCount; j>i; j--) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}

}
