package day4;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class LongestUniquessubStringLengthSW {
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
		String s="abcabcbb";
		int target= 3;
		//boolean bool=true;
		Assert.assertTrue(longestUniqueSustring(s)==target);
	}

	@Test
	public void negative() {
		String s = "pwwkew"; 
		int target = 3;
		//boolean bool=false;
		Assert.assertTrue(longestUniqueSustring(s)==target);
	}
	@Test
	public void edge() {
		String s = "dvdf"; 
		int target= 3;
		//boolean bool=false;
		Assert.assertTrue(longestUniqueSustring(s)==target);

	}

	private int longestUniqueSustring(String s) {
		// TODO Auto-generated method stub
		int max=0,tempMax=0,left=0,right=0;
		char[] chars=s.toCharArray();
		HashMap<Character,Integer>map1= new HashMap<>();
		for (left = 0;  left< chars.length; left++) {
			if(!map1.containsKey(chars[left])) {
				map1.put(chars[left], 1);
				tempMax=left-right+1;
			}
			else
			{
				map1.remove(chars[left]);
				map1.put(chars[left], 1);
				right++;
				while(right<left) if(map1.getOrDefault(chars[right], 0)==1) right++;	
			}
			if (tempMax>max) max=tempMax;	
		}
		System.out.println(max);
		
		return max;
	}
	
}
