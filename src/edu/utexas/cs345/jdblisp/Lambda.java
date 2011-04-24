package edu.utexas.cs345.jdblisp;

import java.util.ArrayList;
/**
 * Lambda
 */
public class Lambda extends FunctionEntry {

    private SymbolTable closure;

    public Lambda(Symbol[] parameters, SExp body, SymbolTable closure, boolean inletd) {
        super(new Symbol("L()"), parameters, body);

        this.closure = closure;
       super.setLetD(inletd);
       // System.out.println("LAMBDA CLASS 1 in lambda letd is " + super.getLetD());
    }

    public Lambda(Symbol[] parameters, SExp body, SymbolTable closure,
    HelpTopic helpinfo, boolean inletd) {
        super(new Symbol("L()"), parameters, body, helpinfo);

        this.closure = closure;
        super.setLetD(inletd);
       // System.out.print("2 LAMBDA CLASS in lambda letd is " + super.getLetD());
    }

    public String display(String offset) {
        StringBuilder sb = new StringBuilder();
        sb.append(offset).append("Lambda : \n");

        for (Symbol param : parameters)
            sb.append("  ").append(offset).append("Parameter: \n")
                .append(param.display(offset + "  "));

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<LAMBDA (");
        for (Symbol param : parameters)
            sb.append(param.toString()).append(" ");
        sb.append(") >");

        return sb.toString();
    }

    @Override
    
    public SExp call(SymbolTable symbolTable, Seq arguments)
    throws LispException {

        // we are going to pass a ClosureSymbolTable into the
        // FunctionEntry.call() method. But the first thing FE.call() is going
        // to do is evaluate the arguments and bind them to the parameters
        // expected by the function (lambda in this case). The
        // ClosureSymbolTable looks in the closure context first, then in the
        // calling context. This is correct inside the body of the closure but
        // incorrect for the argument evaluation, which should happen in the
        // calling context, so let's preemptivly evaluate the arguments.
     //   System.out.println("WHEN DOES THIS HAPPEN?");
     //   System.out.println("lambda ARGS:" + arguments);
     //   System.out.println(symbolTable.toString());
     //    System.out.println("lambda closure: " + closure.toString());
      /*Seq evaledArguments;
        ArrayList<SExp> temp = new ArrayList<SExp>();

        for (;arguments != null; arguments = arguments.cdr)
            temp.add(arguments.car.eval(symbolTable));

        evaledArguments = new Seq(temp.toArray(new SExp[]{}));
        
       
        
        return super.call(new ClosureSymbolTable(symbolTable, closure), arguments);*/
     //    System.out.println("SUPERGETLETD " + super.getLetD());
        if (super.getLetD()){
       // 	 System.out.println("in letd lambda");
             return super.call(symbolTable, arguments);
        }

         else       	 
        	 return super.call(symbolTable, closure, arguments);
    }


}
