package chap04;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = new int[10];
		int Whereisnum = -1;
		for(int i = 0; i<10; i++) {
			Array[i] = (int)(Math.random()*10)+1;
			System.out.printf("%d ",Array[i]);
		} 
		System.out.println();
		for(int i = 0 ; i<Array.length; i++) {
			if(Array[i] == 7) {
				Whereisnum = i+1;
				break;
			}
		}
		if(Whereisnum == -1) {
			System.out.println("There isn't any 7 on the array");
		} else {
			System.out.printf("7 is %d th number.",Whereisnum);
		}
	}

}
