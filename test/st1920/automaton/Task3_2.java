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
	@Test 
	public void test0007() {
		assertTrue(RegExpMatcher.matches("k", "@?&k"));
	}

	@Test 
	public void test0008() {
		assertFalse(RegExpMatcher.matches("hello", "(hello)((?)\\|\\(+))"));
	}
	
	@Test 
	public void test0009() {
		assertFalse(RegExpMatcher.matches("hello", "(hello)((?)\\(~(&))\\(+))"));
	}
	
	@Test 
	public void test0010() {
		assertFalse(RegExpMatcher.matches("abcd", "([a-c])*\\&([a-d])+"));
	} 
	
	@Test
    public void tes0011() {
        assertTrue(RegExpMatcher.matches("a", "a{0,7}"));
    }

    @Test
    public void test0012() {
        assertTrue(RegExpMatcher.matches("hello", "([a-z])*&([a-z])*"));
    }
    
    @Test
    public void test0013() {
        assertTrue(RegExpMatcher.matches("hello", "([a-z])*&.*"));
    }
    
    @Test
    public void test0014() {
        assertTrue(RegExpMatcher.matches("hello", ".*&.*"));
    }
    
    @Test
    public void test0015() {
        assertFalse(RegExpMatcher.matches("03", "<0-0>"));
    }

 
 
}
