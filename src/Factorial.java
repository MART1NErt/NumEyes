import java.util.Scanner;

public class Factorial {    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Num for factorial");
    int n = num.nextInt();
    System.out.println(factorial(n));
}
    public static int factorial(int n){
        if(n == 1)
            return 1 ;
        if(n == 0)
            return 0 ;
        else
            return factorial(n-1) * n ;
    }
}

