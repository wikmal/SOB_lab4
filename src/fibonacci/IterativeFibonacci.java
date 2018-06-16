package fibonacci;

public class IterativeFibonacci implements Fibonacci {

    @Override
    public int calculateFibonacci(int n) throws Exception {
        if(n>46)
            throw new Exception("IterativeFibonacci too big number for Integer");
        if (n < 0)
            throw new Exception("IterativeFibonacci argument exception");
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int y = 0;
        int x = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = x;
            x = x + y;
            y = temp;
        }
        return x;
    }
}
