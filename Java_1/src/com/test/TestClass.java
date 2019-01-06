package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Hello");
		// TODO Auto-generated method stub
		/*
		List<String> list = new ArrayList<String>();
		List<Integer> listN = new ArrayList<Integer>();
		System.out.println("Hello World...!");

		String s = "I am an android Developer Madhur Jain";
		
		String[] array = s.split(" ");
		
		List<String> listOriginal = Arrays.asList(array);
		
		for(String word : listOriginal)
		{
			if(!list.contains(word)) {
				list.add(word);
				listN.add(listOriginal.)
			}
			
		}
		
		*/
		
		
		List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");
		List<String> uniqueList = new ArrayList<String>();
		/*
		List<Integer> listn = new ArrayList<Integer>();

		Set<String> distinct = new HashSet<>(list);
		for (String s: distinct) {
			int count = 0;
			for(int i =0; i< list.size() ; i++)
			{
				if(list.get(i).equals(s))
				{
					count++;
				}
			}
			listn.add(count);
			uniqueList.add(s);
	}
		for(int i = 0; i<uniqueList.size() ; i++)
		{
			System.out.println(uniqueList.get(i) + "  " + listn.get(i));
		}
	}
	*/
	
	Map<String,Integer> hashMap = new HashMap<String,Integer>();
	
	for(String s : list)
	{
		if(hashMap.containsKey(s)) {
			int p = hashMap.get(s);
			hashMap.replace(s, ++p);
		}
		else
		{
			hashMap.put(s, 1);
		}
		
	}
	
	for(Map.Entry<String,Integer> entry : hashMap.entrySet())
	{
    System.out.println(entry.getKey() + 
                     ": " + entry.getValue()); 
	}
}
	
	
}
		
	
