package defaultPackage;

public class Starv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iMaxStar = 11;
		for(int i = iMaxStar-1; i>=0; i--) { //11 10 9 8 7 6 5 4 3 2 1 0
			for(int j=0; j<iMaxStar; j++) {
				if(j<i) System.out.printf(" ");
				else System.out.printf("*");
			}
			System.out.println();
		}
        for(int i = 1; i<iMaxStar; i++) { // 0 1 2 3 4 5 6 7 8 9 10
			for(int j = 0; j<iMaxStar; j++) {
			    if(i>j)
				    System.out.printf(" ");
				else
				    System.out.printf("*");
			}
			System.out.println();
        }
	}

}
