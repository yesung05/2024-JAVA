package Notdefault;

public class whileHap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.printf("1~%d의 합은 %d입니다.", i-1, sum);
	}

}