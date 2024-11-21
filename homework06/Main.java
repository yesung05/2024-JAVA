import java.util.Scanner;

public class Main {
    static Account[] account = new Account[100];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        boolean rep = true;
        while (i<=100 && rep){
            printll();
            print("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료\n");
            printll();
            print("선택> ");
            int iSel = Integer.parseInt(sc.nextLine());

            switch (iSel){
                case 1:
                    printsl();
                    print("계좌생성\n");
                    printsl();
                    account[i] = new Account();
                    print("계좌번호:");
                    account[i].setAccNum(sc.nextLine());
                    print("계좌주: ");
                    account[i].setAccown(sc.nextLine());
                    print("초기입금액: ");
                    account[i].setMoney(Integer.parseInt(sc.nextLine()));
                    print("결과: 계좌가 생성되었습니다.\n");
                    i++;
                    break;
                case 2:
                    for(int j = 0; j<i; j++){
                        System.out.printf("%6s %15s %10d\n", account[j].getAccOwn(), account[j].getAccNum(), account[j].getMoney());
                    }
                    break;
                case 3:
                    printsl();
                    print("예금\n");
                    printsl();
                    int j = selAcc(i);
                    print("예금액: ");
                    account[j].setMoney(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    printsl();
                    print("출금\n");
                    printsl();
                    int k = selAcc(i);
                    print("출금액: ");
                    int iTempMoney = Integer.parseInt(sc.nextLine());
                    if(iTempMoney > account[k].getMoney()){
                        print("결과: 잔액이 부족합니다.\n");
                    } else {
                        account[k].setMoney(-iTempMoney);
                        print("결과: 출금이 성공되었습니다.\n");
                    }
                    break;
                case 5:
                    print("프로그램 종료");
                    rep = false;
                    break;
                default:
                    print("잘못된 입력입니다.");
            }
        }
    }
    static void print(String val){
        System.out.print(val);
    }
    static void printll(){
        System.out.println("----------------------------------");
    }
    static void printsl(){
        System.out.println("------------");
    }

    public static int selAcc(int i) {
        print("계좌번호: ");
        String ScNum = sc.nextLine();
        for (int j = 0; j < i; j++) {
            if (account[j].getAccNum().equals(ScNum)) {
                return j;
            }
        }
        print("결과: 해당 계좌번호를 찾을 수 없습니다.\n");
        return selAcc(i);
    }
}
