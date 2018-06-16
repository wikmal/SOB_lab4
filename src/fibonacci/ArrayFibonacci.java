package fibonacci;

public class ArrayFibonacci implements Fibonacci {

    @Override
    public int calculateFibonacci(int n) throws Exception {
        if(n>46)
            throw new Exception("ArrayFibonacci too big number for Integer");
        if (n < 0)
            throw new Exception("ArrayFibonacci argument exception");

        int[] results = new int[n];
        results[0] = 1;
        results[1] = 1;

        for (int i = 2; i < n; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }
        return results[n - 1];
    }
}
