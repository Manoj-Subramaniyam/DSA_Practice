package day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TwoSum {

	/*
	 * Given the integer array and the target, 
		find the sum of two distinct indices of given target
	 * int num[]={2,7,11,15}
	 * target=9
	 * output={0,1}
	 * 
	 * 
	 * int num[]={2,2,3,1,4,0,5}
	 * target=5
	 * 0utput={{0,1},{1,2}{3,4}{5,6}}
		
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
	
	public void TestData1()
	{
		int num[]={2,7,11,15};
		 int target=9;
		 twoSum_Bruteforce(num, target);
		 //output={0,1}
	}
	@Test
	public void TestData2()
	{
		int num[]={2,2,3,1,4,0,5};
		 int target=5;
		 twoSum_Bruteforce(num, target);
		 // 0utput={{0,1},{1,2}{3,4}{5,6}}
	}
	public void TestData3()
	{
		int num[]={2,2,3,1,4,0,5};
		 int target=45;
		 // 0utput=-1
	}
	/*
	 * Pseudo code
	 * 
	 * 1. Take the input array
	 * 2.Traverse through the array using two for loop
	 * 3.add the each  element from inner for loop with outer for loop 
	 * 		a. if sum of two elements matched with the target, stre the indices in the list
	 * 		b, if not matches ignore
	 * 4. return the list 
	 */
	private void twoSum_Bruteforce(int[] nums, int target)
	{ 
		List<Integer[]> l1= new ArrayList();
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]== target)
					System.out.println(i+" "+j);
			}
		}
		
	}
	private void twoSum_TwoPointer()
	{
	}
}
