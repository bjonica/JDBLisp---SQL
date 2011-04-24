package edu.utexas.cs345.jdblisp;

/**
 * Car
 * @author Jonathan Bernard (jdbernard@gmail.com)
 */
public class Car {

    public final SExp sexp;

    public Car(SExp e) {
        sexp = e;
    }

    public String display(String offset) {

        StringBuilder sb = new StringBuilder();
        sb.append(offset);
        sb.append("SExp: \n");
        
        sb.append(sexp.display(offset + "  "));

        if (sexp != null) sb.append(sexp.display(offset));

        return sb.toString();
    }
    
    public SExp getSexp()
    {
    	return sexp;
    }

    public String toString() {
	   return sexp.toString();
    }
}
