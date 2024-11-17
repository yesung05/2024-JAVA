import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankApplication Ba = new BankApplication();
        Scanner sc = new Scanner(System.in);
        boolean bRun = true;
        while (bRun){
            Ba.longline();
            Ba.print("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료\n");
            Ba.longline();
            Ba.print("선택> ");
            int iNum = Integer.parseInt(sc.nextLine());
            switch (iNum){
                case 1:
                    Ba.CreateAccount();
                    break;
                case 2:
                    Ba.AccountList();
                    break;
                case 3:
                    Ba.addMoney();
                    break;
                case 4:
                    Ba.outMoney();
                    break;
                case 5:
                    bRun = Ba.endProgram();
                    break;
                default:
                    Ba.print("잘못된 선택입니다. 다시 선택하여주세요. \n");

            }
        }
    }
}