package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReverVowelsTwoPointer {
	@Test
	public void positive(){
		String s = "hello";
		System.out.println(reversetheVowels(s.toLowerCase().toCharArray()));
		//System.out.println(s.toString());
	}
	@Test
	public void negative(){
		String s = "cdfj";
		System.out.println(reversetheVowels(s.toLowerCase().toCharArray()));
		//System.out.println(s.toString());
	}
	@Test
	public void edge(){
		String s = "aeiou";
		System.out.println(reversetheVowels(s.toLowerCase().toCharArray()));
		//System.out.println(s.toString());
	}
	
	private char[] reversetheVowels(char[] cs) {
		int left=0;
		int right=cs.length-1;
		
		while(left <= right) {
			if(!(cs[left]=='a' || cs[left]=='e' || cs[left]=='i' || cs[left]=='o' || cs[left]=='u')) {
				left++;
			}
			if(!(cs[right]=='a' || cs[right]=='e' || cs[right]=='i' || cs[right]=='o' || cs[right]=='u')) 
			{
				right--;
			}
			if((cs[left]=='a' || cs[left]=='e' || cs[left]=='i' || cs[left]=='o' || cs[left]=='u')|| (cs[right]=='a' || cs[right]=='e' || cs[right]=='i' || cs[right]=='o' || cs[right]=='u')) {
				
			char temp=cs[left];
			cs[left++]=cs[right];
			cs[right--]=temp;
			
			}
			
		}
		return cs;
	}
	

}
