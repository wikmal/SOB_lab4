package fibonacci;

public class ArrayFibonacci {
    private static ArrayFibonacci ourInstance = new ArrayFibonacci();

    public static ArrayFibonacci getInstance() {
        return ourInstance;
    }

    private ArrayFibonacci() {
    }
}
