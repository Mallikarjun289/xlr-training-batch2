public class Demo060 {
    public static void main(String[] args) {
        int n = 20;
        int[] fibSeries = new int[n];
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }

        System.out.println("First 20 numbers of the Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibSeries[i] + " ");
        }
    }
}



