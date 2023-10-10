package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class BinarySearchMissingNumber {

	@Test
	public void positive() {
		int[] nums= {2,3,4,7,11};
		int target= 9;
		int k=5;
		//boolean bool=true;
		Assert.assertTrue(binarySearch(nums,k)==target);
	}

	@Test
	public void negative() {
		int[] nums= {1,2,3,4};
		int target= 6;
		int k=2;
		//boolean bool=false;
		Assert.assertTrue(binarySearch(nums,k)==target);
	}
	//@Test
	public void edge() {
		int[] nums= {2,3,4,7,11};
		int target= 9;
		int k=2;
		//boolean bool=false;
		Assert.assertTrue(binarySearch(nums,k)==target);

	}
/*
 * Pseudo code
 *  initialize a variable i with 1 and temp=0
 * Initialize a while loop till the temp==k
 * check if i is not present in the array
 * 		 increament temp
 *
 *  	increament the i
 *return temp
 */
	private int binarySearch(int[] nums, int k) {
		int i=1,temp=0,j=0;
		while(temp <= k)
		{
			if(!(nums[j]==i))temp++;
			else if(j<nums.length-1) j++;
			if(temp==k)return i;
			i++;
		}
		
		return 0;
		
	}
	
}
