package edu.utexas.cs345.jdblisp;

/**
 * FormEntry
 * @author Jonathan Bernard(jdbernard@gmail.com)
 */
public abstract class FormEntry implements SExp, SymbolTableEntry {

    public final Symbol symbol;
    public HelpTopic helpinfo;
    public boolean letd;

    public FormEntry(Symbol symbol, HelpTopic helpinfo) {
        this.symbol = symbol;
        this.helpinfo = helpinfo;
    }

    public abstract SExp call(SymbolTable table, Seq arguments) throws LispException;
    public abstract String display(String offset);
    public boolean getLetD()
    {
    	return letd;
    }
    
    public boolean setLetD(boolean let)
    {
    	letd = let;
    	return letd;
    }

    public SExp eval(SymbolTable symbolTable) { return this; }

    public Symbol symbol() { return symbol; }
}
