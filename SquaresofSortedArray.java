package day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SquaresofSortedArray {
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
		int[] nums= {-4,-1,0,3,10};
		int[] target= {0,1,9,16,100};
		Assert.assertTrue(Arrays.equals(squaresofSortedArray(nums), target));
	}
	
	@Test
	public void negative() {
		int[] nums= {-4,-1,0,1,4};
		int[] target= {0,1,1,16,16};
		Assert.assertTrue(Arrays.equals(squaresofSortedArray(nums), target));
	}
	@Test
	public void edge() {
		int[] nums= {0};
		int[] target= {0};
		Assert.assertTrue(Arrays.equals(squaresofSortedArray(nums), target));
	}
	/*
	 * Pseudo Code
	 * 
	 * 1. Initialize the for loop 
	 * 		1a.Square each number and replace the existing integer
	 * 2.Initialize the for loop 
	 * 		2a.Initialize the for loop 
	 * 			2a.a compare the elements and store it in the previous element
	 * return the array
	 */
	private int[] squaresofSortedArray(int[] nums) {
		// TODO Auto-generated method stub
		int temp=0;
		for (int i = 0; i < nums.length; i++) nums[i]=nums[i]*nums[i];
		//System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i]>nums[j]) 
					{
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					}
			}
			
		}
		//System.out.println(Arrays.toString(nums));
		return nums;
	}
}
