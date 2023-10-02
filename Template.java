package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class Template {

	/*
	 * Given the integer array and the target, 
remove the matching target from the array
	 */
	/*
	 * is it in sorted order
	 * should i retain the output in same order
	 * 
	 */
	
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
		int[] arr = { 4, 8, 11, 13, 15 };
		int target = 11;
		Assert.assertEquals(true,Arrays.equals(removeElement(arr,target), new int[] {4, 8, 13, 15}) );
	
		//	output = {4, 8, 13, 15};
	}
	
	@Test
	public void edge() {
		int[] arr = { 4, 8, 4, 13, 15 };
		int target = 4;
		Assert.assertTrue(Arrays.equals(removeElement(arr,target), new int[] {8,13,15}));
	}
	@Test
	public void negative() {
		int arr[] = { 4,5,7,8 };
		int target = 0;
		Assert.assertTrue(Arrays.equals(removeElement(arr,target), new int[] {4,5,7,8}));
	}
	/*
	 * ---Pseudo code ----
	 * 1. create a new Arraylist
	 * 2.transverse through the array
	 *   2a.match it with the target and add the unmatched elements to the list
	 * 4.convert list to array
	 * 5.return the array
	 *  
	 */
	private int[] removeElement(int[] inputArray, int target) {
		List<Integer> lst = new ArrayList<>();
		for(int i=0;i<inputArray.length;i++)
			if(inputArray[i]!=target) lst.add(inputArray[i]);
		int[] output= new int[lst.size()];
		for (int i=0;i<lst.size();i++) 
			output[i]=lst.get(i);
					
				
		return output;
				
	}
	
	
}