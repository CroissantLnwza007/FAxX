import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("n =");
        int n = keyboard.nextInt();
        int s = 0;
        int i = 0;
        while(i <= n){
           int j = 0;
           while(j <= n){
            s += i + j;
            j += 1;
           }
           i += 1;
        }
        System.out.print(s);
    }
}
