package defaultPackage;

public class arraytest1 {

	public static void main(String[] args) {
		int[] iTenRandom = new int[10];
		boolean bIsThereNum = false;
		
		for(int i = 0; i<iTenRandom.length; i++) {
			iTenRandom[i] = (int)(Math.random()*10)+1;
			System.out.printf("%d ", iTenRandom[i]);
		}
		for(int i = 0; i<iTenRandom.length; i++) {
			if(iTenRandom[i] == 7) {
				System.out.printf("\n7 is %dth number.\n", i+1);
				bIsThereNum = true; //7 유무 체크하는 값
				break;
			}
		}
		if(bIsThereNum == false) System.out.printf("\nThere is No number 7.\n");
	}

}
