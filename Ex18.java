import java.util.Scanner;

public class Ex18 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int s = 0;
        System.out.print("n =");
        int n = keyboard.nextInt();
        int i = n;
        while(i >= 0){
        s += i ;
        i -= 2 ;
        }
        System.out.print(s);
    }
}
