public class Main {
    public static void main(String[] args) {
        int[] iArray = new int[10];
        int[] iOrderArray = new int[10];

        for(int i = 0 ; i<iArray.length; i++) {
            iArray[i] = (int)(Math.random()*10)+1;
            for(int j = 0; j<i; j++) {
                if(iArray[j] == iArray[i]) {
                    i--;
                    break;
                }
            }
        }
        for (int j : iArray) {
            System.out.printf("%d ", j);
        }

        for(int i = 0 ; i<iArray.length; i++) {
            for (int j : iArray) {
                if (iOrderArray[i] < j) {
                    iOrderArray[i] = j;
                }
            }
            for (int j = 0; j < iArray.length; j++) {
                if (iOrderArray[i] == iArray[j]) {
                    iArray[j] = 0;
                }
            }
        }
        System.out.println();
        for (int j : iOrderArray) System.out.printf("%d ", j);
    }
}