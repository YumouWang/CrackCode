package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode57 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	List<Interval> result = new ArrayList<Interval>();
    	if (intervals.size() == 0) {
    		result.add(newInterval);
    		return result;
    	}
    	int begin = newInterval.start;
    	int end = newInterval.end;
    	int i = 0;
    	boolean b = false;
    	for (i = 0; i < intervals.size(); i++) {
    		if (intervals.get(i).start <= newInterval.start && intervals.get(i).end >= newInterval.end) {
    			b = true;
    			break;
    		} else {
    			if (intervals.get(i).start < newInterval.start && intervals.get(i).end < newInterval.start) {
        			result.add(intervals.get(i));
        		} else if (intervals.get(i).start <= newInterval.start && intervals.get(i).end >= newInterval.start) {
        			begin = intervals.get(i).start;
        		} else if (intervals.get(i).start > newInterval.start && intervals.get(i).end < newInterval.end) {
        			
        		} else if (intervals.get(i).start <= newInterval.end && intervals.get(i).end >= newInterval.end) {
        			end = intervals.get(i).end;
        		} else {      			
        			break;
        		}
    		}
    	}
    	int j = i;
    	if (!b) {
    		result.add(new Interval(begin, end));
    	}
    	while (j < intervals.size()) {
    		result.add(intervals.get(j));
    		j++;
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	Interval interval1 = new Interval(1, 5);
    	Interval interval2 = new Interval(3, 5);
    	Interval interval3 = new Interval(6, 7);
    	Interval interval4 = new Interval(8, 10);
    	Interval interval5 = new Interval(12, 16);
    	List<Interval> list = new ArrayList<Interval>();
    	list.add(interval1);
//    	list.add(interval2);
//    	list.add(interval3);
//    	list.add(interval4);
//    	list.add(interval5);
    	LeetCode57 l = new LeetCode57();
    	List<Interval> result = l.insert(list, new Interval(1, 7));
    	for (int i = 0; i < result.size(); i++) {
    		System.out.println(result.get(i).start + "," + result.get(i).end);
    	}
    	
    }

}
