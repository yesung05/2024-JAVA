package chap04;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1==arr2);
		
		System.out.println(arr2 == arr3);
	}
}