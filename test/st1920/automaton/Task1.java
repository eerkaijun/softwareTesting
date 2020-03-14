package st1920.automaton;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;
 

public class Task1 {
	
	@Test
	public void bug1() {												 
		assertTrue(RegExpMatcher.matches("", ""));
	}
	@Test
	public void bug2() {												 
		assertFalse(RegExpMatcher.matches("a", ""));
	}
	@Test
	public void bug3() {												 
		assertFalse(RegExpMatcher.matches("abc", "(cd)|(yz)"));
	}
	@Test
	public void bug4() {												
		assertFalse(RegExpMatcher.matches("hef123", "~h\\~f\\.123"));
	}
	
	@Test
	public void bug5() {												 
		assertFalse(RegExpMatcher.matches("abc", "[a- ]" ));	
	}
	
	//exceeds 100 chars
	@Test
	public void bug6() {												 
		assertFalse(RegExpMatcher.matches("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "([a-z])*"));
	}
	@Test
	public void bug7() {												 
		assertFalse(RegExpMatcher.matches("xyzxyzxyzxyzxyz", "(xyz){-21,-4}"));
	}
	@Test
	public void bug8() {												 
		assertTrue(RegExpMatcher.matches("abc", "([a-z])**"));
	}
	@Test
	public void bug9() {												 
		assertTrue(RegExpMatcher.matches("abc@xyz", "(<a-c>)\\.([a-z])"));
	}
	@Test
	public void bug10() {												 
		assertTrue(RegExpMatcher.matches("42", "([0-9])+"));
	}
	@Test
	public void bug11() {												 
		assertFalse(RegExpMatcher.matches("abcabcabca", "(abc)?\\."));
	}
	@Test
	public void bug12() {												 
		assertFalse(RegExpMatcher.matches("abcdef", "((abc)|(deg))&(abd)"));
	}
	@Test
	public void bug13() {												 
		assertFalse(RegExpMatcher.matches("abc123", "()+(<0-9>)*"));
	}
	@Test
	public void bug14() {												 
		assertFalse(RegExpMatcher.matches("abc", "([a^e-z])([^5-9)bc++?"));
	}
	@Test
	public void bug15() {												 
		assertFalse(RegExpMatcher.matches("abc", "(ab)&(bc)"));
	}


	@Test	
	public void test1() {												//bug 3
		assertFalse(RegExpMatcher.matches("abc", "(yz)|(ab)"));
 	}
	
	@Test
	public void test2() {												//bug 3
		assertFalse(RegExpMatcher.matches("abc", "(cd)|(yz)"));
	}

	@Test
	public void test3() {												//bug 15
		assertFalse(RegExpMatcher.matches("abc", "(ab)&(bc)"));
	}
	
	@Test
	public void test4() {												//bug 15
		assertFalse(RegExpMatcher.matches("abc", "(gh)&(ab)"));
	}
	
	@Test
	public void test5() {
		assertTrue(RegExpMatcher.matches("xyzxyzxyz", "(xyz){3}"));
	}
	
	@Test
	public void test6() {
		assertTrue(RegExpMatcher.matches("xyzxyzxyz", "(xyz){2,4}"));
	}
	
	@Test
	public void test7() {
		assertFalse(RegExpMatcher.matches("xyzxyzxyz", "(xyz){2}"));
	}
	
	@Test
	public void test8() {
		assertFalse(RegExpMatcher.matches("xyzxyz", "(xyz){3}"));
	}
	
	@Test
	public void test9() {
		assertTrue(RegExpMatcher.matches("xyzxyz", "(xyz){2,4}"));
	}
	
	@Test
	public void test10() {
		assertTrue(RegExpMatcher.matches("xyzxyzxyzxyz", "(xyz){2,4}"));
	}
	
	@Test
	public void test11() {
	        assertTrue(
	                st1920.automaton.RegExpMatcher.matches(
	                "ab+?",
	                "ab\"+\"\"?\""
	                ));
	 }
	
	@Test
	public void test12() {															//bug 3
		assertTrue(RegExpMatcher.matches("a9", "([a-z0-9])+"));
	}
	
	@Test
	public void test13() {															
		assertFalse(RegExpMatcher.matches("a9", "[A-Z]"));
	}
	
	@Test
	public void test14() {															//bug 3
		assertFalse(RegExpMatcher.matches("65", "[a-zA-Z]"));
	}
	
	@Test
	public void test15() {															//bug 3
		assertFalse(RegExpMatcher.matches("65", "[^b-z0-8]"));
	}
	
	@Test
	public void test16() {															//bug 15
		assertTrue(RegExpMatcher.matches("abcc", "abc+"));
	}
 	@Test
	public void test17() {
		assertFalse(RegExpMatcher.matches("ab", "abc+"));
	}
 	
	@Test
	public void test18() {															//bug 11
		assertFalse(RegExpMatcher.matches("abcc", "abc?"));
	}
	
	@Test
	public void test19() {															
		assertTrue(RegExpMatcher.matches("ab", "abc*"));
	}
	
	@Test
	public void test20() {															//bug 3
		assertTrue(RegExpMatcher.matches("bubble", "b[aeiou]bble"));
	}
	
	@Test
	public void test21() {															//bug 15
		assertFalse(RegExpMatcher.matches("b98c", "<90-100>"));
	}
	
	@Test
	public void test22() {															//bug 15
		assertTrue(RegExpMatcher.matches("c", "."));
	}
	
	@Test
	public void test23() {															//bug 8
		assertTrue(RegExpMatcher.matches("abc", "([a-z])***"));
	}
	
	@Test
	public void test24() {															
		assertTrue(RegExpMatcher.matches("hello", "hello"));
	} 
	
	@Test
	public void test25() {															//bug 15
		assertTrue(RegExpMatcher.matches("c", "@"));
	}
	
	@Test
	public void test26() {															//bug 3
		assertFalse(RegExpMatcher.matches("hello", "[~hello]"));
	}
	
	@Test
	public void test27() {															//bug 15
		assertFalse(RegExpMatcher.matches("abcasdas", "#"));
	}
	
	@Test
	public void test28() {															//bug 12
		assertFalse(RegExpMatcher.matches("abcdef", "((abc)&(deg))|(abd)"));
	}
	
	@Test
	public void test29() {															//bug 15
		assertTrue(RegExpMatcher.matches("abc123", "([a-z])+(<0-9>)*"));
	}
	
	@Test
	public void test30() {
		assertTrue(RegExpMatcher.matches("bubble", "b[a.eiou]bble"));
	}
	
	@Test
	public void test31() {															//bug 4
		assertFalse(RegExpMatcher.matches("hef123", "~h\\~f\\.123"));
	}
	
	@Test
	public void test32() {															//bug 14
		assertTrue(RegExpMatcher.matches("abcd1234", "([^e-z])([^5-9)"));
	}
	
	@Test
	public void test33() {
		assertTrue(RegExpMatcher.matches("xyz:", "(xyz)."));
	}
	
	@Test 
	public void test34() {
		assertTrue(RegExpMatcher.matches("abc123", "<[(\\+-\\?)(bb-d)]>"));
	}
	 
	@Test
	public void test35() {															//bug 15
		assertFalse(RegExpMatcher.matches("abc@xyz", "(\"abc@xyz\") "));
	}
	
	@Test
	public void test36() {															//bug 7
		assertTrue(RegExpMatcher.matches("abcabc", "(...){1-4}"));
	}
	
	@Test
	public void test37() {															//bug 7
		assertTrue(RegExpMatcher.matches("abcabc", "(~##){1-4}"));
	}
	
	@Test
	public void test38() {															//bug 4
		assertFalse(RegExpMatcher.matches("abcabc", "{6-4}"));
	}
	
	@Test
	public void test39() {															//bug 9
		assertTrue(RegExpMatcher.matches("abcABC", "(\"abc\")(<d-Z>){1-5}"));
	}
	
	@Test 
	public void test40() {
		assertTrue(RegExpMatcher.matches("abc123", "<abc1234>"));
	}
 
	@Test
	public void test41() {															
		assertTrue(RegExpMatcher.matches("a", "([a-z])"));
	}
	
	@Test 
	public void test42() {
		assertFalse(RegExpMatcher.matches("abc123", "[<(1-9),(11-14)>]"));
	}
 
	@Test
	public void test43() {															//bug 12
		assertFalse(RegExpMatcher.matches("abcdef", "((abc)&(def))?"));
	}
	
	@Test
	public void test44() {															//bug 9
		assertTrue(RegExpMatcher.matches("www.abc.com", "(<w-w>){1-3}.([a-c])\\?\\.(com)"));
	}
	
	@Test
	public void test45() {															//bug 15
		assertFalse(RegExpMatcher.matches("abc", "(abc)&(#\\@)" ));
	}
	
	@Test
	public void test46() {															//bug 15
		assertTrue(RegExpMatcher.matches("abc", "(~ @)" ));
	}
	
	@Test
	public void test47() {															//bug 4
		assertTrue(RegExpMatcher.matches("abc123", "\"abc\"(123)" ));
	}
	
	@Test
	public void test48() {															//bug 11
		assertTrue(RegExpMatcher.matches("abc", "([a-z])+?"));
	}
	 
	@Test
	public void test49() {															//bug 9
		assertTrue(RegExpMatcher.matches("123", "(<1--4>)8" ));
	}
	
	@Test
	public void test50() {
		assertTrue(RegExpMatcher.matches("foo.", "foo@"));
	}
	
	@Test
	public void test51() {															//bug 5
		assertTrue(RegExpMatcher.matches("Foo", "([A- ])([a-z]){1-15}"));
	}
	
	@Test
	public void test52() {															//bug 12	
		assertFalse(RegExpMatcher.matches("c", "((a).|(bb))&\\~c"));
	}
	
	@Test
	public void test53() {
		assertFalse(RegExpMatcher.matches("a", ".(hello)"));
	}
	
	@Test
	public void test54() {															//bug 11
		assertFalse(RegExpMatcher.matches("$�", "[!-*]?"));
	}
	
	@Test
	public void test55() {															//bug 7
		assertTrue(RegExpMatcher.matches("abc123", "([a-z]){1-5}(<>){1-5}"));
	}
	
	@Test
	public void test56() {															//bug 7			
		assertTrue(RegExpMatcher.matches("abc123", "([a-z]){1-5}(<0-9>){1-5}"));
	}
	
	@Test
	public void test57() {															//bug 7
		assertTrue(RegExpMatcher.matches("abc123", "([-]){1-5}(<0-9>){1-5}"));
	}
	
	@Test
	public void test58() {															//bug 7
		assertTrue(RegExpMatcher.matches("abc123", "([a]){1-5}(<0-9>){1-5}"));
	}
	
	@Test
	public void test59() {															//bug 14
		assertTrue(RegExpMatcher.matches("abc123", "([]){1-5}(<0-9>){1-5}"));
	}
	
	@Test	
	public void test60() {															//bug 7
		assertTrue(RegExpMatcher.matches("abc123", "([a-z]){}(<0-9>){1-5}"));
	}
	
	//bug with the number 42....
	@Test
	public void test61() {															//bug 10
		for(int i =0;i<200;i++) {
			boolean dummy = RegExpMatcher.matches(String.valueOf(i), "([0-9])+");
			if(!dummy) {
				//System.err.print(i);
 				assertTrue(dummy);	
				}
			else {
				//System.out.println("no bug on index "+i);
			}
			
		}
		//System.out.println("hello");
		//assertTrue(RegExpMatcher.matches("", "([0-9])+"));
	}
	
	@Test
	public void test62() {															//bug 15
		for(char c= 'a';c<='z';c++) {
		//System.out.println(c);
			boolean dummy = RegExpMatcher.matches(String.valueOf(c), "([a-z])+");
			//stops at c, works fine after
		}
	}
	
	@Test
	public void test63() {															//bug 15
		assertTrue(RegExpMatcher.matches("abc", "([a-z])++"));
	}
	
	@Test
	public void test64() {															//bug 11
		assertFalse(RegExpMatcher.matches("abc", "([a-z])??"));
	}
	
	@Test
	public void test65() {															//bug 11
		assertTrue(RegExpMatcher.matches("abc", "([a-z])*?"));
	}
	
	@Test
	public void test66() {															//bug 8
		assertFalse(RegExpMatcher.matches("a←↑⍅↑↓↱↯⇂⇢⇥⇝!", "a←↑⍅↑↓([a-z0-9])*"));
	}
 
}
