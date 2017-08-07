

import java.util.HashSet;


public class Solution {
	
	
	
	
	public static void main(String[] args)
	{
		
		String m = "hellooiamnewhere";
		String k = "ababcdefahijklab";
		String c = "abadef";
		String a = "tmmzuxt";
		String b = "a";
		String q ="ab";
		String p = "abcdhgkior";
		int n = lengthOfLongestSubString(p);
		System.out.println(n);
		//test(q);
		
		
	}
	
	
	/*
	 * for this method, fint the longest non-repeat substring in a string 
	 * 
	 * when scanning a string, have to know if the next character exists in the scanned string
	 * string actually can be anything: digits, characters, special characters, etc
	 */
	
	public static int lengthOfLongestSubString(String s)
	{
		System.out.println(s);
		int head = 0;		//index that needs to track head and tail of the current substring
		int tail = 1;		//let's set this to 1. to make sure the substring atleast 1 char
		
		int currMaxLength = 0;
		
		if(s.length() == 0)
		{
			return 0;
		}
		
		
		String currentString = s.substring(head, tail); //first substring is a char
		currMaxLength = 1; 
		
		System.out.println(currentString);
		
		for(int i = 1; i < s.length(); ++i)
		{
			
			char c = s.charAt(i);
			System.out.println("now c is " + c);
					
		

			if(currentString.indexOf(c) <0)		//c is not 
			{
					currentString = currentString + c;
					System.out.println("length now is " + currentString.length());
					if(currentString.length() >= currMaxLength)
					{
						currMaxLength = currentString.length();
					}
			}
			else	//exist somewhere in substring;
			{
				System.out.println("found at " +currentString.indexOf(c));
				
				currentString = currentString.substring(currentString.indexOf(c)+1) + c;
				System.out.println("length now is " + currentString.length());
			}
			
			System.out.println(currentString);
		}
		
		
		
		
		return currMaxLength;
		
		
		
	}
	
	
	

	private static void test(String s)
	{
		String k = s + 'k';
		System.out.println(k);
		
	}
	/*private static boolean containsChar(String s, char target)
	{
		if(s.length() == 0)
		{
			return false;
		}
		else 
		{
			return s.charAt(0) == target || containsChar(s.substring(1), target);
		}
	}*/
		
	
	
	
	
	
	
	public static String[] parseString(String s)
	{
		String[] arr = s.split(", ");
		for(int i = 0; i < arr.length; ++i)
		{
			System.out.println(arr[i]);
		}
		return arr;
		
	}
	
	
	
	
	
	
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       int carry =0;
	 
	        ListNode newHead = new ListNode(0);
	        ListNode p1 = l1, p2 = l2, p3=newHead;
	 
	        while(p1 != null || p2 != null){
	            if(p1 != null){
	                carry += p1.val;
	                p1 = p1.next;
	            }
	 
	            if(p2 != null){
	                carry += p2.val;
	                p2 = p2.next;
	            }
	 
	            p3.next = new ListNode(carry%10);
	            p3 = p3.next;
	            carry /= 10;
	        }
	 
	        if(carry==1) 
	            p3.next=new ListNode(1);
	 
	        return newHead.next;
	    }
	
    
  
    
    
}
