package javapak;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iCount = 0;
		for(int i = 1; i<=100; i++) {
			if((i%7)==0) {
				System.out.printf("%d ",i);
				iCount++;
			}
		}
		System.out.printf("\n1~100중 7의 배수는 %d개 입니다.",iCount);
	}

}
