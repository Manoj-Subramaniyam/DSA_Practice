package day3;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArraySW {

	@Test
	public void positive(){
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,5,6};
		mergeSortArray(nums1,nums2);
		
	}
	private void mergeSortArray(int[] nums1,int[] nums2) {
		// TODO Auto-generated method stub
		int pointer1 = 0, pointer2=0,index=0;
		int m=nums1.length;
		int n= nums2.length;
		
		int[] nums3= new int[m+n];
		while (m> pointer1 || n> pointer2) {
			if (m==pointer1) nums3[index++]=nums2[pointer2++];
			else if(n==pointer2) nums3[index++]=nums1[pointer1++];
			else if (nums1[pointer1]<= nums2[pointer2]) nums3[index++]=nums1[pointer1++];
			else nums3[index++]=nums2[pointer2++];
		
		}
		System.out.println(Arrays.toString(nums3));
	}
	
	
}
