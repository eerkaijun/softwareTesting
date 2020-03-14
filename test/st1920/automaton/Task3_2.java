package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task3_2 {
	
	@Test
	public void test0001() {
		assertTrue(RegExpMatcher.matches("", "\""));
	}
	
	@Test
	public void test0002() {
		assertTrue(RegExpMatcher.matches("abc", "(abc+"));
	}
	
	@Test
	public void test0003() {
		assertTrue(RegExpMatcher.matches("5", "<1-7"));
	}
	
	@Test
	public void test0004() {
		assertTrue(RegExpMatcher.matches("123", "<2>"));
	}
	
	@Test 
	public void test0005() {
		assertFalse(RegExpMatcher.matches("hello", "(([a-z]){1,})&(([A-Z]){0,})"));
	}

	@Test 
	public void test0006() {
		assertFalse(RegExpMatcher.matches("hello", "([a-])*"));
	}

}
