grammar Formatter;
@members {
    private int eol = 0, events = 0;
    private String name;
}
	   
	/* type 
    : n = CPU { name = $n.text; } rest_of_type eol // { System.out.println("Saw and cpu");
	| n = ID { name = $n.text; } rest_of_type eol // { System.out.println("Saw and id"); 
	| n = FUNC { name = $n.text; } rest_of_type eol // { System.out.println("Saw and func"); 
	| n = BEGIN { name = $n.text; } rest_of_type eol // { System.out.println("Saw and begin");} */
 /*  
rest_of_type 
     : e = INTEGER { events = (Integer.valueOf($e.text)); }EVENTS FLOAT SECONDS INTEGER EPERS
	 ;
*/

output
@init { eol
    String s = "";
    String s1 = "";
}
     : (eol)*
	 
	  CPU ID FUNC eol
       
       INTEGER INTEGER BEGIN eol
	   INTEGER events = INTEGER t = TICK eol
	   INTEGER INTEGER END eol
       DASHES KS DASHES eol 
		   sidenum = INTEGER eol
		   { System.out.println("insert into ibprofile (line, events, ticks, cpu, count, function, stack) values(" +
		                        eol() + ", " + events + ", " +  t +  ", " + sidenum
                                + ", " + $count.text + ", '" + $funct.text +  "', '" + s.replace('\'', '^') + "') ;"); 
             s = ""; 
           }
	  ;
	
eol : EOL+ { eol++; }
 ;

WS :       (' ' | '\t')+ { $channel=HIDDEN; } ;
COLON:    ':' ;
CPU:      'CPU' ;
ID:       'ID' ;
FUNC:     'FUNCTION:NAME' ;
BEGIN:    ':BEGIN' ;
END:      ':END' ;
TICK:     ':tick-' ('0'..'9')+ 's' ;
DASHES:   ('-')+ ;
KS:       'Kernel stacks' ;
INTEGER:  ('0'..'9')+ ;
STACKELEM: '0x' ('!'..'~')+ | ('a'..'z' | 'A'..'Z' | '_' | '\'')? ('!'..'~')+  ; // A string of any printable ascii characters (except space) that begins with an alpha or 0x or '_'
EOL:       '\n' | '\r' | '\n\r' | '\r\n' ;
