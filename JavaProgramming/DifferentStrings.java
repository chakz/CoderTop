package com.tutorialspoint;
import java.io.*;
import java.util.Arrays;
import java.lang.*;
public class DifferentStrings{
	public int minimize(String string1, String string2){
		String s1 = string1;
		String s2 = string2;
		char[] S1 = s1.toCharArray();
		char [] S2 = s2.toCharArray();
		
		int longestStringLength, numNull = 0;
		int count = 0;
		
		StringBuilder sb = new StringBuilder(64);
		
		if(S1.length != S2.length){
			longestStringLength = Math.max(S1.length, S2.length);
			if(S1.length < S2.length){
				numNull = longestStringLength - S1.length;
				char [] temp = Arrays.copyOfRange(S2, 0, numNull);
				sb.append(temp);
				sb.append(S1);
				S1 = sb.toString().toCharArray();
			}
			else{
				numNull = longestStringLength - S2.length;
				char [] temp = Arrays.copyOfRange(S1, S1.length - numNull, S1.length);
				sb.append(S2);
				sb.append(temp);
				S2 = sb.toString().toCharArray();
			}
		}
		System.out.println(S1);
		System.out.println(S2);
		
		for (int i = 0; i < S1.length; i ++){
			if(S1[i] != S2[i])
				count++;
		}
		
		return count;
	}
	
	public static void main(String args[]){
		DifferentStrings ds = new DifferentStrings();
		String one = "motherhood";
		String two = "father";
		int result = ds.minimize(one, two);
		System.out.println("Difference between the two strings: " + result);
	}
}