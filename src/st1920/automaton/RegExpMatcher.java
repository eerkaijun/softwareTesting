package st1920.automaton;

import java.util.Random;

/**
 * Utility class to provide a simple interface to the package.
 */
public class RegExpMatcher {
	final static int seed = 250;
	static Random rnd = new Random(seed);

	public static boolean matches(MatchString m, REString re) {
		return matches(m.getMatchString(), re.getREString());
	}
	
	/**
	 * Tells whether the string <code>m</code> matches the regular expression <code>re</code>.
	 * @param m string to be matched
	 * @param re regular expression
	 */
	
	public static boolean matches(String m, String re) {
		RegExp regExp = new RegExp(re);
		Automaton a = regExp.toAutomaton();
		return a.run(m);
	}
	
	public static REString makeRepeatZeroOrOne(String p) {
		return new REString(p + "?");
	}
	
	public static REString makeRepeatZeroOrMore(String p) {
		return new REString(p + "*");
	}
	
	public static REString makeRepeatOneOrMore(String p) {
		return new REString(p + "+");
	}
	
	public static REString showOccurence(String p) {
		int select = rnd.nextInt(3);
		String dummy = p;
		switch(select) {
		case 0: 
			dummy+= "{" + MatchString.makeNumber() + "}";
 		case 1: 
 			dummy+= "{" + MatchString.makeNumber() + ",}";
 		case 2: 
 			dummy+= "{" + MatchString.makeNumber() + "," + MatchString.makeNumber() + "}";
 
		}
		return new REString(dummy);
	}
	
	public static REString makeOr(String p, String q) {
		return new REString(p + "|" + q);
	}
	
	public static REString makeAnd(String p, String q) {
		return new REString(p + "&" + q);
	}
	
	public static REString makeNot(String p) {
		return new REString("~" + p);
	}
	
	public static REString makeCharClass(String p) {
		int select = rnd.nextInt(3);
		String dummy = p;
		switch(select) {
		case 0: 
			dummy +="[" + MatchString.makeAlphabet() + "-" + MatchString.makeAlphabet() + "]";
 		case 1: 
 			dummy += "[" + MatchString.makeAlphabet() + "]";
 		case 2: 
 			dummy+="[^" + MatchString.makeAlphabet() + "-" + MatchString.makeAlphabet() + "]";
		}
		return new REString(dummy);
	}
	
	public static REString makeAnySingleChar(String p) {
		return new REString(p + ".");
	}
	
	public static REString makeNone(String p) {
		return new REString(p + "#");
	}
	
	public static REString makeAny(String p) {
		return new REString(p + "@");
	}
	
	public static REString makeEntireString(String p) {
		return new REString("\"" + p + "\"");
	}
	
	public static REString makeNumClass(String p) {
			return new REString("<" + MatchString.makeNumber() + "-" + MatchString.makeNumber() + ">");
	}
	
	public static MatchString makeConcatenation() {
		String m = "";
		//Create a string with length between 0 and 10
		int string_length = rnd.nextInt(10);
		for (int i=0; i<string_length; i++) {
			 int select = rnd.nextInt(4);
			 switch(select) {
			 case 0:
				 m = m + MatchString.makeAlphabet();
			     break;
			 case 1:
				 m = m + MatchString.makeNumber();
			     break;
			 case 2:
				 m = m + MatchString.makeChar();
			     break;
			 case 3:
				 m = m + MatchString.makeSpace();
			     break;
			 }
		}
		return new MatchString(m);
	}
}
