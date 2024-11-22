package javapak;
import java.util.Scanner;

public class Review4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int[] iNumAry = new int[4];
        
        // 숫자 입력받기
        for (int i = 0; i < iNumAry.length; i++) {
            System.out.printf("%d 번째 숫자를 입력해주세요: ", i + 1);
            iNumAry[i] = Integer.parseInt(sc.nextLine());
        }

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


        for (int i = 0; i < iNumAry.length; i++) {
            System.out.println(iNumAry[i]);
        }

        sc.close();
    }
}
