package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ArrayIntersectionusingEquidiretional {
	@Test
	public void positive(){
		int[] arr1 = {2,3,5,6,8,10};
		int[] arr2 = {2,4,5,7,8};
		int[] target= {2,5,8};
		Assert.assertTrue(Arrays.equals(intersectionArray(arr1,arr2), target));

	}
	@Test
	public void negative(){
		int[] arr1 = {2,3,5,6,8,10};
		int[] arr2 = {11,12};
		int[] target= {};
		Assert.assertTrue(Arrays.equals(intersectionArray(arr1,arr2), target));

	}
	@Test
	public void edge(){
		int[] arr1 = {2,2,3,5,6,8,10};
		int[] arr2 = {1,2,3};
		int[] target= {2,3};
		Assert.assertTrue(Arrays.equals(intersectionArray(arr1,arr2), target));

	}
	/*
	 * Pseudo Code
	 * 
	 */

	private int[] intersectionArray(int[]arr1,int[] arr2){
		int pointer1=0,pointer2=0;
		List<Integer> l1=new ArrayList<Integer>();
		while(pointer1<arr1.length && pointer2<arr2.length) {
			if (arr1[pointer1]==arr2[pointer2]) {
				l1.add(arr1[pointer1]);
				pointer1+=1;
				pointer2+=1;
			}
			else {
				if (arr1[pointer1]<arr2[pointer2]) pointer1+=1;
				else pointer2+=1;
			}	
		}
		int[] arr3=new int[l1.size()];
		for (int i = 0; i < l1.size(); i++) {
			arr3[i]=l1.get(i);
		}
		//System.out.println(Arrays.toString(l1.toArray()));
		return arr3;

	}
}
