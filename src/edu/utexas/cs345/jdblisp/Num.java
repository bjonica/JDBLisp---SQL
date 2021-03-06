package edu.utexas.cs345.jdblisp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
/**
 * @author Jonathan Bernard (jdbernard@gmail.com)
 */
public class Num implements SExp, Comparable<Num> {

    private BigDecimal n;

    public Num(String string) {
        /*try { n = Short.parseShort(string); return; }
        catch (NumberFormatException nfe) {}

        try { n = Integer.parseInt(string); return; }
        catch (NumberFormatException nfe) {}

        try { n = Long.parseLong(string); return; }
        catch (NumberFormatException nfe) {}

        try { n = new BigInteger(string); return; }
        catch (NumberFormatException nfe) {}

        try { n = Float.parseFloat(string); return; }
        catch (NumberFormatException nfe) {}

        try { n = Double.parseDouble(string); return; }
        catch (NumberFormatException nfe) {}
*/
        try { n = new BigDecimal(string); return; }
        catch (NumberFormatException nfe) {
            assert(false);
        }
    }

    public Num(BigDecimal n) { this.n = n; }

    /** {@inheritdoc} */
    public SExp eval(SymbolTable table) {
        return this;
    }

    public String display(String offset) {
        return offset + "Num: " + n.toString() + "\n";
    }

    @Override
    public String toString() {
        return n.toString();
    }

    public Num add(Num addend) {
        return new Num(n.add(addend.n));
    }

    public Num subtract(Num subtrahend) {
        return new Num(n.subtract(subtrahend.n));
    }

    public Num multiply(Num multiplicand) {
        return new Num(n.multiply(multiplicand.n));
    }

    public Num divideBy(Num divisor) {
    		BigDecimal quotient = (n.divide((divisor.n), 9, RoundingMode.HALF_UP));
        return new Num(quotient);
    }

    public Num negate() {
        return new Num(n.negate());
    }

    public Num abs() {
        return new Num(n.abs());
    }

    public Num remainder(Num divisor) {
        return new Num(n.remainder(divisor.n));
    }

    @Override
    public int compareTo(Num that) {
        return this.n.compareTo(that.n);
    }
}
