import java.util.Scanner;

public class Sanddirt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iCount = sc.nextInt();
        if(iCount%2 != 1) iCount--; //무조건 홀수만 받기
        for(int i = 0; i<iCount; i++){  // 0 1 2 3 4 5 6 7 8 9 11
            if(i<=iCount/2){
                for(int j=0; j < i; j++){ // 0 1 2 3 4 5 6
                    System.out.print(" ");
                }
                for(int j = iCount-(i*2)-1; j >= 0; j--){
                    System.out.print("*");
                }
            }

            if(i>iCount/2){
                for(int j = (iCount-i); j>1; j--){
                    System.out.print(" ");
                }
                for(int j = 0; j<=i-(iCount-i)+1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
