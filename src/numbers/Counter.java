package numbers;

public class Counter {
    // Fields
    private int count;

    // Constructor
    public Counter() {
        this(0);
    }

    public Counter(int num) {
        count = num;
    }

    public void increment() {
        count++;
    }

    public int get() {
        return count;
    }

    public String toString() {
        return "<" + count + ">";
    }

    public void reset() {
        count = 0;
    }
}