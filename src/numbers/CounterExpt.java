package numbers;

import java.io.PrintWriter;

public class CounterExpt {
    public static void main(String[] args) {
        PrintWriter pen = new PrintWriter(System.out, true);
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment();
        c1.increment();
        c2.increment();
        pen.println("c1: " + c1);
        pen.println("c2: " + c2);

        Counter c3 = new Counter(3);
        c3.reset();
        pen.println("c3: " + c3);  // should be 0
    }
}
