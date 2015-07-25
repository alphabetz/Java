import java.util.Scanner;

public class Hello{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello World");
        
        System.out.print("Enter a number: ");
        int a;
        a = input.nextInt();
        
        System.out.println(a);
    }
}
