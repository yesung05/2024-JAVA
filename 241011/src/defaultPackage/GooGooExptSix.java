package defaultPackage;

public class GooGooExptSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iExeption = 6;
		for(int i = 2; i<=9; i++) {
			if(i == iExeption) continue;
			System.out.printf("--------%d단---------\n",i);
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", i,j,i*j);
			}
			System.out.println();
		}
	}

}
