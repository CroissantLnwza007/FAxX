import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("n =");
        int n = keyboard.nextInt();
        System.out.print("m =");
        int m = keyboard.nextInt();
        int s = 0;
        int i = 0;
        while(i <= n){
            int j = 0;
            while(j <= m){
                if(i <= j){
                    s += 1;
                }
                j += 1;
            }
            i += 1;
        }
        System.out.print(s);
    }
}