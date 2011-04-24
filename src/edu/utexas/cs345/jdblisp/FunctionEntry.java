package edu.utexas.cs345.jdblisp;

/**
 * FunctionEntry
 * @author Jonathan Bernard (jdbernard@gmail.com)
 */
 
 import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class FunctionEntry extends FormEntry {

    protected final Symbol[] parameters;
    protected final SExp body;

    protected boolean traceEnabled;

    //private Logger traceLog = Logger.getLogger(getClass());

    public FunctionEntry(Symbol symbol, Symbol[] parameters, SExp body) {
        super(symbol, null);

        // build invocation help string
        String invokation = "(" + symbol.name;
        for (Symbol param : parameters) invokation += " <" + param.name + ">";
        invokation += ")";
        String bodyInfo = "Function body: " + body.toString();

        // build help topic
        FormHelpTopic helpinfo = new FormHelpTopic(symbol.name, null, invokation, bodyInfo);

        this.parameters = parameters;
        this.body = body;
        this.helpinfo = helpinfo;
    }

    public FunctionEntry(Symbol symbol, Symbol[] parameters, SExp body,
    HelpTopic helpinfo) {
        super(symbol, helpinfo);
        this.parameters = parameters;
        this.body = body;
    }

    public boolean isTraceEnabled() { return traceEnabled ;}

    public void enableTrace(boolean enable) { this.traceEnabled = enable; }

    public String display(String offset) {
        return offset + "Function: " + symbol.toString();
    }

    public String toString() { return "<FUNCTION " + symbol.toString() + ">"; }
    
    public SExp call(SymbolTable symbolTable, Seq arguments) throws LispException
    {
    	  String traceString = null;
          SExp evaluatedArg, retVal;

          if (traceEnabled)
              traceString = "(" + symbol.name;

          // bind arguments to parameters
          SymbolTable localScope = new SymbolTable(symbolTable);
      //    System.out.println("FE newtable: " + localScope.toString());
          int i = 0;
          while (i < parameters.length) {

  		//		System.out.println("FE param: " + parameters[i]);
              // too few arguments
              if (arguments == null){
     //         	System.out.println("too few args?");
                  throw new InvalidArgumentQuantityException(
                      toString(), parameters.length, i);}

              // bind one arg to param
              evaluatedArg = arguments.car.eval(symbolTable);
     //         System.out.println("FE evaluatedArg : " + arguments.car + " " + evaluatedArg);
              localScope.bind(parameters[i], new VariableEntry(parameters[i],
                  evaluatedArg));

              if (traceEnabled) traceString += " " + evaluatedArg.toString();

    	//			System.out.println("FE while : " + arguments);
              arguments = arguments.cdr;
              ++i;
          }

          // too many arguments
          if (arguments != null)
              throw new InvalidArgumentQuantityException(
                  toString(),parameters.length, (i + arguments.length()));

          if (traceEnabled) traceString += ")";
          if (traceEnabled) System.out.println(traceString);


          retVal = body.eval(localScope);

          if (traceEnabled)
              traceString = symbol.name + " returned " + retVal.toString();
          if (traceEnabled) System.out.println(traceString);

  	//	  System.out.println("FE retval :" + retVal);
          return retVal;
    }

    public SExp call(SymbolTable symbolTable, SymbolTable closure,   Seq arguments) throws LispException {

			//System.out.println("FE args: " + arguments);
			System.out.println("FE table " + symbolTable.toString());
			System.out.println("FE closure " + closure.toString());
			
        String traceString = null;
        SExp evaluatedArg, retVal;
        //Map closuremap = closure.getMap();
        
        Map<Symbol, VariableEntry> symbolmap = symbolTable.getMap();

        if (traceEnabled)
            traceString = "(" + symbol.name;

		 ClosureSymbolTable	combinedTable = new ClosureSymbolTable(symbolTable, closure);
        // bind arguments to parameters
        SymbolTable localScope = new SymbolTable(combinedTable);
     //   System.out.println("FE newtable: " + localScope.toString());
        int i = 0;
       /* boolean availableClosure = false;
        
        (for(int j = 0; j < parameters.length; j++)
        {
        	System.out.println("parameter  " + parameters[j]);
        	if(closure.lookupVariable(parameters[j]) != null){
        			availableClosure = true;
        			break;}
        }*/
               
        if(closure.getNumVariables() == 0)
        {
        		throw new ClosureException();
        }
        
        while (i < parameters.length) {

			//	System.out.println("FE param: " + parameters[i]);
            // too few arguments
            if (arguments == null){
            //	System.out.println("too few args?");
                throw new InvalidArgumentQuantityException(
                    toString(), parameters.length, i);}
           
          
            if(closure.lookupVariable(parameters[i]) != null){
            // bind one arg to param
           		 evaluatedArg = arguments.car.eval(closure);
           	//	 System.out.println("FE evaluatedArg in Closure: " + arguments.car + " " + evaluatedArg);
            		localScope.bind(parameters[i], new VariableEntry(parameters[i], evaluatedArg));
            		//closuremap.remove(parameters[i]);
              }
              else
              {
            //  		System.out.println("in else, trying outerscope");
              		evaluatedArg = arguments.car.eval(symbolTable);
              //	System.out.println("FE evaluatedArg in ST : " + arguments.car + " " + evaluatedArg);
            		localScope.bind(parameters[i], new VariableEntry(parameters[i], evaluatedArg));
            		//symbolmap.remove(parameters[i]);
              }
			
				

					
			//	System.out.println("local scope " + localScope.toString());
            if (traceEnabled) traceString += " " + evaluatedArg.toString();

  			//	System.out.println("FE while : " + arguments);
            arguments = arguments.cdr;
            ++i;
        }
        
       // Num val = new Num("17");
       // Symbol z = new Symbol("Z");
       // Symbol minus = new Symbol("-");
        //FormEntry f = new FormEntry(minus, new HelpTopic("name", "desc", "body"));
        //localScope.bind(z, new VariableEntry(z, val));
        //localScope.bind(minus, f);
        	/*for(Iterator<Symbol> j = closuremap.entrySet().iterator(); j.hasNext(); )
        	{
        	Symbol s = j;
        	System.out.println("s " + s);
        	System.out.println("j " + j);
        	System.out.println("j next " + j.next());
        	System.out.println("closuremap get j next " + closuremap.get(j.next()));
        	
        	//	localScope.bind(j, j.next());
        	}*/
        	/*for(Object s: symbolmap.entrySet().toArray())
        	{
        		localScope.bind(s, symbolmap.get(s));	
        	}
        	*/
		// System.out.println("NEW FINAL local scope " + localScope.toString());
        // too many arguments
        if (arguments != null)
            throw new InvalidArgumentQuantityException(
                toString(),parameters.length, (i + arguments.length()));

        if (traceEnabled) traceString += ")";
        if (traceEnabled) System.out.println(traceString);


        retVal = body.eval(localScope);

        if (traceEnabled)
            traceString = symbol.name + " returned " + retVal.toString();
        if (traceEnabled) System.out.println(traceString);

	//	  System.out.println("FE retval :" + retVal);
        return retVal;
    }

    public HelpTopic helpinfo() { return helpinfo; }

	public boolean getLetD()
	{	return super.getLetD();
	}
	

	public boolean setLetD(boolean l)
	{
		return super.setLetD(l);
	}
		
}	