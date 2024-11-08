package chap04;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		
		for(int i = 0 ; i<3; i++) {
			System.out.print("arr1["+i+"] : " + arr1[i]+", ");
		}
		System.out.println();
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0 ; i<3; i++) {
			System.out.print("arr1["+i+"] : " + arr1[i]+", ");
		}
		System.out.println("\n");
	}

}
