
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = a * a + 16;
        if(a >= 5) {
            if(b >= 15)  {
                System.out.println("Large a, Large b");
            } else {
                System.out.println("large a, small b");}
        } else  {
            if(b >= 32) {
                System.out.println("small a, Large b");
             } else {
                System.out.println("small a, small b");
             }
        }
    }
}

            

        
     
