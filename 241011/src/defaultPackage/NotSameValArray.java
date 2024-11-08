package defaultPackage;

public class NotSameValArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = new int[10];
		
		for(int i = 0 ; i<iArray.length; i++) {
			iArray[i] = (int)(Math.random()*10)+1;
			for(int j = 0; j<i; j++) {
				if(iArray[j] == iArray[i]) {
					i--;
					break;
				}
				
			}
		}
		for(int i = 0; i<iArray.length;i++) {
			System.out.printf("%d " , iArray[i]);
		}
		
	}

}
