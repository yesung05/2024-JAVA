public class Account {
    private int balance = 0;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    void setBalance(int balance){
        if(balance < 0) return;
        if(!(MIN_BALANCE > this.balance+balance) || (MAX_BALANCE < this.balance+balance))
            this.balance += balance;
    }
    int getBalance(){
        return this.balance;
    }
}
