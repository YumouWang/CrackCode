package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode56 {
    public List<Interval> merge(List<Interval> intervals) {
    	if (intervals == null || intervals.size() == 0) {
    		return null;
    	}
    	List<Interval> result = new ArrayList<Interval>();
    	if (intervals.size() == 1) {
    		result.add(intervals.get(0));
    		return result;
    	}
    	result.add(intervals.get(0));
    	
    	for (int i = 0; i < intervals.size(); i++) {
    		for (int j = i; j < intervals.size(); j++) {
    			if (intervals.get(i).start > intervals.get(j).start) {
    				Interval temp = intervals.get(i);
    				intervals.set(i, intervals.get(j));
    				intervals.set(j, temp);
    			}
    		}
    	}
    	
    	for (Interval interval : intervals) {
    		System.out.print("[" + interval.start + "," + interval.end + "]" + " ");
    	}
    	System.out.println();
    	
    	for (int i = 1; i < intervals.size(); i++) {
    		if (result.get(result.size() - 1).end > intervals.get(i).start) {   			
    			Interval interval = new Interval(result.get(result.size() - 1).start, Math.max(result.get(result.size() - 1).end, intervals.get(i).end));		
    			result.remove(result.size() - 1);
    			result.add(interval);
    		} else {
    			result.add(intervals.get(i));
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	LeetCode56 l = new LeetCode56();
    	List<Interval> intervals = new ArrayList<Interval>();
    	intervals.add(new Interval(2,6));
    	intervals.add(new Interval(1,3));   	
    	intervals.add(new Interval(8,10));
    	intervals.add(new Interval(15,18));
    	
    	List<Interval> result = l.merge(intervals);
    	for (Interval interval : result) {
    		System.out.print("[" + interval.start + "," + interval.end + "]" + " ");
    	}
    }

}
