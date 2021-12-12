package week3;



public class Task9 {
    static int r_fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return r_fib(n - 1) + r_fib(n-2);

    }

    static int r_Factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * r_Factorial(n - 1);
    }

    static int factorial(int n){
        int x = 1;
        for(int i = 1; i <= n; i++){
            x = x * i;
        }
        return x;
    }

    static int fib (int n){
        int fib1 = 1;
        int fib2 = 1;
        int fib = 0;
        for (int i = 0; i < n - 2; i++){
            fib = fib1+fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }
    public static void main(String[] args) {
          int y = 6;
          fib(y);
          int f = fib(y);
        System.out.println(r_fib(y));
        //System.out.println(fib(y));
    }

}
