package Notdefault;
import java.util.Scanner;
public class ThisisHardpart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int numb = scanner.nextInt();
		
		for(int j = numb; j>0; j--){
	        for(int k = 0; k<numb-j; k++){
	            System.out.printf(" ");
	        }
	        for(int i = 0; i<j*2-1; i++){
	        	System.out.printf("*");
	        }
	        System.out.printf("\n");
	    }
	/******************************************/
	    for(int j = 2; j<=numb; j++){
	        for(int k = numb-j; k>0; k--){
	        	System.out.printf(" ");
	        }
	        for(int i = j*2-1; i>0; i--){
	        	System.out.printf("*");
	        }
	        System.out.printf("\n");
	    }
	}

}
