package Notdefault;

public class Starfromright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10+1; i++){
			for(int b=0; b<10-i; b++){
				System.out.printf(" ");
			}
			for(int c=0; c<i; c++){
				System.out.printf("*");
			}
		System.out.println();
		}
	}
}
