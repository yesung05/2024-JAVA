public class Account {
    private String accNum; // 계좌번호
    private String accOwn; // 계좌주
    private int money;     // 잔액

    public String getAccNum() {
        return accNum;
    }
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getAccOwn() {
        return accOwn;
    }
    public void setAccown(String accOwn) {
        this.accOwn = accOwn;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money += money; // 누적 방식으로 처리
    }
}
