import java.util.Scanner;

public class Fibonacci { public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Номер числа Фибоначи");
    int n = num.nextInt();
    System.out.println(fibonacci(n));
}
    public static int fibonacci(int n){
        if(n == 0)
            return 0 ;
        if(n == 1)
            return 1 ;
        else
            return fibonacci(n-1) + fibonacci(n-2) ;
    }
}


