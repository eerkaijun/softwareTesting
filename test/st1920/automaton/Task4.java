package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4 {

	@Test
	public void test1() {
		assertTrue(RegExpMatcher.matches("\n", "$"));
	}

}
