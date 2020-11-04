package numbers;


import java.io.PrintWriter;

/**
 * A simple experiment using fractions.
 *
 * @author Samuel A. Rebelsky.
 * @author YOUR NAME HERE
 */
public class FractionExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    Fraction f1;
    f1 = new Fraction(3, 10);
    Fraction f2;
    f2 = new Fraction(2, 5);
    pen.println("First fraction: " + f1);
    pen.println("Second fraction: " + f2);
    pen.println("Sum: " + (f1.add(f2)));
    pen.println("Product: " + (f1.multiply(f2)));

    Fraction  f;
    f = new Fraction(11,3);
    pen.println(f.fractional());  // 2/3
  
    f = new Fraction(1,2);
    pen.println(f.fractional());  // 1/2
  
    f = new Fraction (5,2);
    pen.println(f.fractional());  // 1/2
  
    f = new Fraction(4,2);
    pen.println(f.fractional());  // 0/2 or 0

    f = new Fraction("1/4");
    pen.println(f.numerator()); // 1
    pen.println(f.denominator()); // 4
    f = new Fraction("11/5");
    pen.println(f.numerator()); // 11
    pen.println(f.denominator()); // 5
    f = new Fraction("120/3");
    pen.println(f.doubleValue()); // Approximately 40

    f = new Fraction("12/24");
    pen.println(f);

  } // main(String[])
} // class FractionExpt
