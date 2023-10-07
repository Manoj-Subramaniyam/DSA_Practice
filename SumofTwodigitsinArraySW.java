package day3;

import java.util.Iterator;

import org.junit.Test;

public class SumofTwodigitsinArraySW {
	@Test
	public void positive(){
		int[] nums1 = {8,4,2,3,11,15,2,1};
		int k=2;
		slidingWindow(nums1,k);

	}

	private void slidingWindow(int[] nums1, int k) {
		// TODO Auto-generated method stub
		int sum1=0,left=0;
		for (int i = 0; i < k; i++) sum1+=nums1[i];
		int max=sum1;
		for (int right = k; right < nums1.length; right++) {
			sum1-=nums1[left++];
			sum1+=nums1[right];
			//if(sum1>max) max=sum1;
			max=Math.max(max, sum1);
		}
		System.out.println(max);
	}

}
