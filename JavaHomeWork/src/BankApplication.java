import java.util.Scanner;

public class BankApplication {
    private int[] iBalance = new int[100];
    private String[] sBankNumb = new String[100];
    private String[] sUser = new String[100];
    Scanner sc = new Scanner(System.in);
    private int ui = 0;

    public void CreateAccount(){

        shortline();
        print("계좌생성\n");
        shortline();

        print("계좌변호: ");
        this.sBankNumb[ui] = sc.nextLine();
        print("계좌주: ");
        this.sUser[ui] = sc.nextLine();
        print("초기입금액: ");
        this.iBalance[ui] = Integer.parseInt(sc.nextLine());
        print("결과: 계좌가 생성되었습니다.\n");
        ui++;
    }
    public void AccountList(){
        shortline();
        print("계좌목록\n");
        shortline();
        for(int i = 0; i<this.ui; i++){
            System.out.printf("%s %10s %10d\n",this.sUser[i],this.sBankNumb[i],this.iBalance[i]);
        }
    }
    public void addMoney(){
        shortline();
        print("예금\n");
        shortline();
        int i = selAcc();
        print("예금액: ");
        this.iBalance[i] += Integer.parseInt(sc.nextLine());
    }
    public void outMoney(){
        shortline();
        print("출금\n");
        shortline();
        int i = selAcc();
        print("출금액: ");
        int iTempMoney = Integer.parseInt(sc.nextLine());
        if(iTempMoney > this.iBalance[i]){
            print("결과: 잔액이 부족합니다.");
        } else {
            this.iBalance[i] -= iTempMoney;
            print("결과: 출금이 성공되었습니다.");
        }
    }
    public boolean endProgram(){
        print("프로그램 종료");
        return false;
    }
    public void longline(){
        System.out.println("----------------------------------------");
    }
    public void shortline(){
        System.out.println("------------");
    }
    public void print(String text){
        System.out.print(text);
    }
    public int selAcc(){
        print("계좌번호: ");
        String ScNum = sc.nextLine();
        for (int i = 0; i < this.ui; i++) {
            if (this.sBankNumb[i].equals(ScNum)) {
                return i;
            }
        }
        print("결과: 해당 계좌번호를 찾을 수 없습니다.\n");
        return selAcc();
    }
}
