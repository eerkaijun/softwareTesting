package st1920.automaton;

/**
 * Utility class to provide a simple interface to the package.
 */
public class RegExpMatcher {
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
}
