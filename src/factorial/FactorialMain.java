package factorial;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FactorialMain {
    private LinkedList<Factorial> factorialList = new LinkedList<>();

    public int calculate(int n) throws Exception {
        initFactorialList();
        try {
            int result = compareResults(getResults(n));
            System.out.println("Silnia z " + n + " to " + result);
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("FactoryMain calculate exception");
        }
    }

    private void initFactorialList() {
        factorialList.addLast(new ArrayFactorial());
        factorialList.addLast(new IterativeFactorial());
        factorialList.addLast(new RecursiveFactorial());
    }

    private List<Integer> getResults(int n) {
        List<Integer> results = new LinkedList<>();

        for (Factorial f : factorialList) {
            try {
                results.add(f.calculateFactorial(n));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return results;
    }

    private int compareResults(List<Integer> results) throws Exception {
        Collections.sort(results);

        for (int i = 1; i < results.size(); i++) {
            if (results.get(i).equals(results.get(i - 1))) {
                return results.get(i);
            }
        }
        throw new Exception("FactorialMenu no equal results found!");
    }
}

