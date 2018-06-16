package factorial;

public class IterativeFactorial implements Factorial {

    @Override
    public int calculateFactorial(int n) throws Exception {
        if (n > 0) {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result*=i;
            }
            return result;
        } else {
            throw new Exception("IterativeFactorial argument exception");
        }
    }
}
