package day3;

import java.util.Iterator;

import org.junit.Test;

public class SumofArraySW {
	@Test
	public void positive(){
		int[] nums1 = {1,3,4,3,1,2,1,5,1};
		int k=7;
		slidingWindow(nums1,k);

	}

	private void slidingWindow(int[] nums1, int k) {
		// TODO Auto-gen erated method stub
		int m= nums1.length;
		int  left=0,temp=0;
		for(int right=0;right<m;right++) {
			temp+=nums1[right];
			while(temp>k)
			{
				temp-= nums1[left++];
			}
			if(temp==k) System.out.println(left+","+right);
			
			//System.out.println(temp);
		}

	}
}
