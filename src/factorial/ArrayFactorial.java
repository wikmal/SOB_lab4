package factorial;

public class ArrayFactorial implements Factorial {
    @Override
    public int calculateFactorial(int n) throws Exception {
        if(n<1)
            throw new Exception("RecursiveFactorial argument exception");

        int[] factorials = new int[n];
        factorials[0] = 1;
        for(int i = 1; i<n; i++){
            factorials[i] = factorials[i-1]*n;
        }
        return factorials[n-1];
    }
}
