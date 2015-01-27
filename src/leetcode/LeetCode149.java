package leetcode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class LeetCode149 {
	public int maxPoints(Point[] points) {
		Hashtable<List<Integer>, Integer> hashTable = new Hashtable<List<Integer>, Integer>();
		if (points.length < 1) {
			return 0;
		}
		if (points.length == 1) {
			return 1;
		}
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				List<Integer> list = new ArrayList<Integer>();
				list = getPara(points[i], points[j]);
				if (hashTable.containsKey(list)) {
					int temp = hashTable.get(list);
					hashTable.put(list, temp + 1);
				} else {
					hashTable.put(list, 2);
				}
			}
		}
		System.out.println(hashTable);
		int result = 0;
		for (Iterator it = hashTable.keySet().iterator(); it.hasNext();) {
			List<Integer> key = (List<Integer>) it.next();
			Integer value = hashTable.get(key);
			if (value > result) {
				result = value;
			}
		}
		return result;
	}

	public List<Integer> getPara(Point point1, Point point2) {
		int k = 0;
		int n = 0;
		if ((point2.x - point1.x) == 0) {
			k = Integer.MAX_VALUE;
			n = point2.x;
		} else {
			k = (point2.y - point1.y) / (point2.x - point1.x);
			n = (point1.y - point1.x * k);

		}
		List<Integer> result = new ArrayList<Integer>();
		result.add(k);
		result.add(n);
		return result;
	}

	public static void main(String[] args) {
		LeetCode149 l = new LeetCode149();
		Point point1 = new Point(1, 1);
		Point point2 = new Point(2, 2);
		Point point3 = new Point(3, 3);
		Point point4 = new Point(3, 1);
		Point[] points = new Point[] { point1, point2, point3, point4};
		System.out.println(l.maxPoints(points));
	}
}
