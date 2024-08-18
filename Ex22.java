import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int s = 0;
        int i = 0;
        while(i <= n){
            int j = 0;
            while(j <= n){
                s += 1;
                j += 1;
            }
            i += 1;
        }
        System.out.print(s);
    }
}
