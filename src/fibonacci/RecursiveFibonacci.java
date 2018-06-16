package fibonacci;

public class RecursiveFibonacci implements Fibonacci{

    @Override
    public int calculateFibonacci(int n) throws Exception {
        if(n>46)
            throw new Exception("RecursiveFibonacci too big number for Integer");
        if(n<0)
            throw new Exception("RecursiveFibonacci argument exception");
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }
}
