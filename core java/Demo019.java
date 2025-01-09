public class Demo019 {
    
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }

    public static void main(String[] args) {
        int n = 10;  // Number of terms in the Fibonacci series
        fibonacciIterative(n);
    }
}
