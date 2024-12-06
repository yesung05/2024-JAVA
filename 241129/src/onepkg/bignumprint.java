package onepkg;
import java.util.Scanner;

public class bignumprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iForNum = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.print("4개의 숫자를 띄어쓰기로 구분하여 입력하세요: ");
		for(int i = 0 ; i<iForNum.length; i++) {
			iForNum[i] = sc.nextInt(); 
		}
		ArySort as = new ArySort();
		iForNum = as.sortAry(iForNum);
		for(int i = 0; i<iForNum.length; i++) {
			System.out.printf("%d ",iForNum[i]);
		}
		sc.close();
	}
//	static int[] sortAry(int[] iForNum){
//		int iTemp = 0;
//		for(int i = 0 ; i<iForNum.length; i++) {
//			for(int j = 0; j<iForNum.length; j++) {
//				if(iForNum[i] > iForNum[j]) {
//					iTemp = iForNum[i];
//					iForNum[i] = iForNum[j];
//					iForNum[j] = iTemp;
//				}
//			}
//		}
//		return iForNum;
//	}

}
