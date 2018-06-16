package fibonacci;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FibonacciMain {
    private List<Fibonacci> factorialList = new LinkedList<>();

    public int calculate(int n) throws Exception {
        initFibonacciList();
        try {
            int result = compareResults(getResults(n));
            System.out.println(n + "th number of Fibonacci Sequence is " + result);
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("FibonacciMain calculate exception");
        }
    }

    private void initFibonacciList(){
        factorialList.add(new ArrayFibonacci());
        factorialList.add(new IterativeFibonacci());
        factorialList.add(new RecursiveFibonacci());
    }

    private List<Integer> getResults(int n){
        List<Integer> results = new LinkedList<>();
        for(Fibonacci f:factorialList){
            try {
                results.add(f.calculateFibonacci(n));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return results;
    }

    private int compareResults(List<Integer> results) throws Exception {
        Collections.sort(results);

        for(int i = 1; i<results.size(); i++){
            if(results.get(i).equals(results.get(i - 1))){
                return results.get(i);
            }
        }
        throw new Exception("FibonacciMenu no equal results found!");
    }
}
