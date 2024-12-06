package onepkg;

public class ArySort {
	static int[] sortAry(int[] iForNum){
		int iTemp = 0;
		for(int i = 0 ; i<iForNum.length; i++) {
			for(int j = 0; j<iForNum.length; j++) {
				if(iForNum[i] > iForNum[j]) {
					iTemp = iForNum[i];
					iForNum[i] = iForNum[j];
					iForNum[j] = iTemp;
				}
			}
		}
		return iForNum;
	}
}
