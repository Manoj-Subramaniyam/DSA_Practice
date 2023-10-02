package day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class StringSubsequence {
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
		String s="abc";
		String t= "ahbgdc";
		boolean bool=true;
		Assert.assertTrue(stringSubsequenceComparision( s,  t)==bool);
	}

	@Test
	public void negative() {
		String s = "ef"; 
		String t = "ahbgdc";
		boolean bool=false;
		Assert.assertTrue(stringSubsequenceComparision( s,  t)==bool);
	}
	@Test
	public void edge() {
		String s = "ca"; 
		String t = "ahbgdc";
		boolean bool=false;
		Assert.assertTrue(stringSubsequenceComparision( s,  t)== bool);

	}
	/*
	 * Pseudo code
	 * 1.Initialize new Array
	 * 2.Initialize the for loop for s
	 * 	2a.Initialize the for loop for t
	 * 	2b.compare the swith t and  store the index then break
	 * 3.check the length with s length
	 * 		3a.Check the index is in ascending order
	 * 			Use for loop to check for Ascending order
	 * 		3b.return false
	 */
	private boolean stringSubsequenceComparision(String s, String t) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<Integer>();
		char[] ch=s.toCharArray(),ch1=t.toCharArray();
		int temp=0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if (ch[i]==ch1[j]) nums.add(j);
			}
		}
		if (nums.size()==ch.length) {
			for (int i = 0; i < nums.size()-1; i++) {
				if (nums.get(i)<nums.get(i+1)) temp+=1;
			}
			if (temp==nums.size()-1) return true;
		}

		return false;
	}
}
