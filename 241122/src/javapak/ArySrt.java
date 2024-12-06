package javapak;

public class ArySrt {
	
    static int[] sortAry(int[] iNumAry) {
    	int iTemp = 0;
        for (int i = 0; i < iNumAry.length; i++) {
            for (int j = i + 1; j < iNumAry.length; j++) {
                if (iNumAry[i] < iNumAry[j]) {
                    iTemp = iNumAry[i];
                    iNumAry[i] = iNumAry[j];
                    iNumAry[j] = iTemp;
                }
            }
        }
        return iNumAry;
    }
}
