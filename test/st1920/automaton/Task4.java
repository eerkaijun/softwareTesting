package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4 {

	@Test
	public void test1() {
		assertTrue(RegExpMatcher.matches("\n", "$"));
	}
	
	@Test
	public void test2() {
		assertTrue(RegExpMatcher.matches("\r", "$"));

	}
	
	@Test
	public void test3() {
		assertTrue(RegExpMatcher.matches("\r\n", "$"));
	}
	
	@Test
	public void test4() {
		assertFalse(RegExpMatcher.matches("", "$"));
	}
	@Test
	public void test5() {
		assertTrue(RegExpMatcher.matches("\r\n", "$$"));
	}
	@Test
	public void test6() {
		assertFalse(RegExpMatcher.matches("\n\n\n\n\n", "$"));
	}
	@Test
	public void test7() {
		assertTrue(RegExpMatcher.matches("a\naaa\r\n", "(a+$)+"));
	}
	
	@Test
	public void test8() {
		assertFalse(RegExpMatcher.matches(" ", "$"));
	}
	@Test
	public void test9() {
		assertTrue(RegExpMatcher.matches("hello", "([a-z])+&(~$)"));
	}
	@Test
	public void test10() {
		assertFalse(RegExpMatcher.matches("\n\n", "$?"));
	}
	@Test
	public void test11() {
		assertTrue(RegExpMatcher.matches("\n\n", "$+"));
	}
	@Test
	public void test12() {
		assertTrue(RegExpMatcher.matches("\n\r\r\n", "$*"));
	}
	@Test
	public void test13() {
		assertTrue(RegExpMatcher.matches("\r\n", "$?"));
	}
	@Test
	public void test14() {
		assertFalse(RegExpMatcher.matches("", "$+"));
	}
	@Test
	public void test15() {
		assertTrue(RegExpMatcher.matches("\n", "."));
	}
	@Test
	public void test16() {
		assertTrue(RegExpMatcher.matches("\r", "."));
	}
	//this should be true?
	@Test
	public void test17() {
		assertTrue(RegExpMatcher.matches("\r\n", "."));
	}
	@Test
	public void test18() {
		assertTrue(RegExpMatcher.matches("hello\nhi\r\n", "(([a-z])*$)+"));
	}
	@Test
	public void test19() {
		assertTrue(RegExpMatcher.matches("\n\r\r\n", "${3}"));
	}
	@Test
	public void test20() {
		assertTrue(RegExpMatcher.matches("\n\r\r\n", "${4}"));
	}
}
