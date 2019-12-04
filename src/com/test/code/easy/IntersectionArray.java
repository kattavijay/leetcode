package com.test.code.easy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntersectionArray {
	
public int[] intersection(int[] nums1, int[] nums2) {
	
	if(nums1.length==0||nums2.length==0)
		return new int[0];
	
	Map<Integer,Integer> list = new HashMap<>();
	
	for(int i=0;i<nums1.length;i++) {
		list.put(nums1[i], 1);
	}
	

	Map<Integer,Integer> list2 = new HashMap<>();
	
	for(int i1=0;i1<nums2.length;i1++) {
		list2.put(nums1[i1], 1);
	}
	
	for(int j=0;j<nums2.length;j++)
	{
		if(list.containsKey(nums2[j]))
		{
			list.replace(nums2[j], list.get(nums2[j]),list.get(nums2[j])+1);
		}else
			list.put(nums2[j], 1);
	}
	
	List<Integer> result = new ArrayList<>();
	
	Set<Integer> keys= list.keySet();
	
	for(Integer key:keys)
	{
		if(list.get(key)>1)
		{
			result.add(key);
			
		}
	}
	
	int[] returnV = new int[result.size()];
	for(int k=0;k<result.size();k++) {
        returnV[k] = result.get(k);
    }
	
	return returnV;
}
}
