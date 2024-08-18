
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int s = 0;
        int i = 1;
        while(i <= n){
            if(i % 3 == 0);
                s += i;
                i += 1;
        }
        System.out.print(s);
    }
}
