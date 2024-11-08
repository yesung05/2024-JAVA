package defaultPackage;

public class ReverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 25, rep;
		rep=star+1; 
		for(int i=0;i<star;i++){
			for(int j=0; j<i; j++){
				System.out.printf(" ");
			}
			for(int k=0; k<rep-1;k++){
				System.out.printf("*");
				
			}
			rep=rep-2;
			System.out.println();
			
		}
	}

}
