package factorial;

import java.util.LinkedList;
import java.util.List;

public class FactorialMain {
    List<Factorial> factorialList = new LinkedList<>();

    private void initFactorialList(){
        factorialList.add(new ArrayFactorial());
        factorialList.add(new IterativeFactorial());
        factorialList.add(new RecursiveFactorial());
    }

    private List<Integer> getResults(int n){
        List<Integer> results = new LinkedList<>();
        for(Factorial f:factorialList){
            try {
                results.add(f.calculateFactorial(n));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return results;
    }

    private int compareResults(List<Integer> results) throws Exception {
        if(results.get(0).equals(results.get(1))){
            return results.get(0);
        }else if(results.get(0).equals(results.get(2))){
            return results.get(0);
        }else if(results.get(1).equals(results.get(2))){
            return results.get(1);
        }else
            throw new Exception("FactorialMenu no equal results found!");
    }
}

