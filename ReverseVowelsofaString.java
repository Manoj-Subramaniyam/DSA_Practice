package day1;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ReverseVowelsofaString {
	/*
	 * 1. Did I understand the problem? yes or no
	        If no ask the person to provide with more details with examples
	        If yes go to the next step
	        What is the input(s)? 
	        What is the expected output? 
	        Do I have any constraints to solve the problem? 
	        Do I have all the information to go to the next steps 
	        How big is your test data set will be? 

	2. Test data set
	        Minimum  3 data set including positive, negative and edge
	        Validate with the interviewer if the data set is fine by his/ her assumptions
	3. Do I know to solve it?
	        Yes- great is there an alternate ?
	        No - can I break the problem into sub problems?
	4. Ask for hint (if you dont know how to solve this
	5.  Do I know alternate solutions as well
	        Yes- what are those?
	        No- that is still fine, proceed to solve by what you know
	6. If you know the alternate solution find out the O-notations (performance)
	7. Then, explain either both are the best (depends on the time)
	        Approach 1:- start with the worst-> improve (optimize) ->  End up with the best
	        Approach 2: Write down the options and benefits and code the best
	8. Start always with the Pseudo code
	9. Test against different test data
	10. If it fails then debug to solve it
	 */
	@Test
	public void positive() {
		String s = "hello";
		String target="holle";
		Assert.assertTrue(reverseVowelsofastring(s.toLowerCase().toCharArray()).equals(target));
	}
	
	@Test
	public void negative() {
		String s= "leetcode";
		String target="leotcede";
		Assert.assertTrue(reverseVowelsofastring(s.toLowerCase().toCharArray()).equals(target));
	}
	@Test
	public void edge() {
		String s= "aeiou";
		String target="aeiou";
		Assert.assertTrue(reverseVowelsofastring(s.toLowerCase().toCharArray()).equals(target));
	}
	/*
	 * Pseudo code
	 * 1.initialize the temp as length of string
	 * 2. initialize the for loop
	 * 	2a.initialize the inner for loop(reverse order and also start from temp)
	 * 	2b.check the characters for vowels
	 * 
	 */
	private String reverseVowelsofastring(char[] s) {
		// TODO Auto-generated method stub
		int temp=0,temp2=0;
		char temp1;
		for (int i  = 0;  i< s.length/2; i++) {
			if (checkforVowels(s[i])) {
				temp2=0;
				for (int j = s.length-1; j >i ; j--) {
					if (checkforVowels(s[j])) {
						if (temp2==temp) {
							temp1=s[i];
							s[i]=s[j];
							s[j]=temp1;
							//System.out.println(String.valueOf(s));
							temp+=1;
							break;
						}
						temp2+=1;
						
						
					}
						
				}
			}
		}
		System.out.println(String.valueOf(s));
		return String.valueOf(s);
	}
	private boolean checkforVowels(char cs) {
		if((cs=='a' || cs=='e' || cs=='i' || cs=='o' || cs=='u')) 
			return true;
		return false;
		
	}
}
