public class MkAry implements AryInterface{
    private int[][] ary;
    private int iNum;
    MkAry(int iNum){
            this.iNum = iNum;
        this.ary = new int[iNum][iNum];
        MkPtrn(0);
    }
    @Override
    public void MkPtrn(int row) {
        if (row >= this.iNum) {
            return;
        }
        for (int i = 0; i < this.iNum; i++) {
            this.ary[row][i] = row + i + 1;
            if (this.ary[row][i] > iNum) {
                this.ary[row][i] -= iNum;
            }
        }
        MkPtrn(row + 1);
    }
    @Override
    public int[][] getAry(){
        return this.ary;
    }
}
