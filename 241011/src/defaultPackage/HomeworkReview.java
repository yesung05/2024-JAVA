package defaultPackage;

public class HomeworkReview {
    public static void main(String[] args) {
        String[] sSubjects = {"KOR", "MATH", "ENG"};
        int[][] iStuScore = {{90, 80, 72}, {94, 85, 92}, {87, 91, 78}};
        int[] iSbjSum = new int[3];

        for (int i = 0; i < iStuScore.length; i++) {
            int iSum = 0;
            System.out.printf("%d Student ", i + 1);
            for (int j = 0; j < sSubjects.length; j++) {
                System.out.printf(" %s : %d ", sSubjects[j], iStuScore[i][j]);
                iSum += iStuScore[i][j];
                iSbjSum[j] += iStuScore[i][j];
            }
            System.out.printf("[Sumval : %d, Avr : %.2f]\n", iSum, (float) iSum / sSubjects.length);
        }

        for (int i = 0; i < sSubjects.length; i++) {
            System.out.printf("%5s SUM : %d, Avr : %6.2f\n", sSubjects[i], iSbjSum[i], (float) iSbjSum[i] / iStuScore.length);
        }
    }

}
