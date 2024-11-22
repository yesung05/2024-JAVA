package javapak;

public class Review1 {

	public static void main(String[] args) {
		int iCount = 0;
		for(int i = 1; i<=100; i++) {
			if((i%3)!=0) {
				System.out.printf("%d ",i);
				iCount++;
			}
		}
		System.out.printf("\n1~100중 3의 배수가 아닌 숫자의 개수는 %d개 입니다.",iCount);

	}

}
