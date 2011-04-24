package edu.utexas.cs345.jdblisp;

/**
 * ClosureException
 * @author Pia, Carine
 */
public class ClosureException extends LispException {


    public ClosureException() {
        super("Exception : Closure not defined.");
    }
}
