package st1920.automaton;

import java.util.Random;

public class MatchString {
	
	final static String[] alphabet_list = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	final static String[] number_list = {"1","2","3","4","5","6","7","8","9"};
	final static String[] character_list = {"\"",".","[","]","{","}","(",")","-","_","+","*","?","%","^","~","#","@",",","<",">","\\","&","|"};
	final static int seed = 250;
	static Random rnd = new Random(seed);

	public String match;
	
	public MatchString(String m) {
		this.match = m;
	}
	
	public String getMatchString() {
		return this.match;
	}
	
	public static String makeAlphabet() {
		int select = rnd.nextInt(alphabet_list.length);
		return alphabet_list[select];
	}
	
	public static String makeNumber() {
		int select = rnd.nextInt(number_list.length);
		return number_list[select];
	}
	
	public static String makeChar() {
		int select = rnd.nextInt(character_list.length);
		return character_list[select];
	}
	
	public static String makeSpace() {
		return " ";
	}

}