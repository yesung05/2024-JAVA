public class Main {
    public static void main(String[] args) {
        MkAry Pt1 = new MkAry(10);

        int[][] ar1 = Pt1.getAry();
        for(int i = 0 ; i<ar1.length; i++){
            for(int j = 0; j<ar1[i].length; j++){
                System.out.printf("%d ",ar1[i][j]);
            }
            System.out.println();
        }
    }
}