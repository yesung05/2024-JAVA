package packageTwo;
import java.util.Scanner;

public class GetReadLine {
	
	Scanner sc = new Scanner(System.in);
	
	int GetReadLineNo() {
		System.out.println("Input a number between 1 and 20");
		return sc.nextInt();
	}
}
