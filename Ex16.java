import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int d = keyboard.nextInt();
        if(a <= b){
            if(c >= d){
                System.out.println("bird");
            }else{
                System.out.println("Ant");
            }
        }else{
            if(c <= d){
                System.out.println("Dog");
            }else{
                System.out.println("Cat");
            }
        }
    }
}
