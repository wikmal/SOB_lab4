package factorial;

public class RecursiveFactorial implements Factorial {
    @Override
    public int calculateFactorial(int n) throws Exception {
        if(n<1)
            throw new Exception("RecursiveFactorial argument exception");
        if(n==1){
            return 1;
        }
        return calculateFactorial(n-1)*n;
    }
}
