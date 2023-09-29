package day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesBF {
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
		int[] nums= {1,1,1,1,0,1,1,1,1,1,0,1,1,1};
		int target=5;
		Assert.assertTrue(consecutiveOnes(nums)== target);
	}
	@Test
	public void negative() {
		int[] nums= {1,0,1};
		int target=1;
		Assert.assertTrue(consecutiveOnes(nums)== target);
	}
	@Test
	public void edge() {
		int[] nums= {0};
		int target=0;
		Assert.assertTrue(consecutiveOnes(nums)== target);
	}
	/*
	 * Psudo code
	 * 1.Create two interger variables
	 * 2.initialize for loop
	 * 	2a.add if loop for checking 1's add increase the counter
	 * 	2b. else add assign counter to another variable
	 * return the variable
	 */
	private int consecutiveOnes(int[] nums) {
		int max=0,counter=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) counter+=1;
			else counter=0;
			if(max<counter) max= counter;
		}
		System.out.println(max);
		return max;

	}
}
