package leecode;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

public int eraseOverlapIntervals(Interval[] intervals) {
      if(intervals == null ||intervals.length == 0) return 0 ;
      Arrays.sort(intervals, new myComparator());
      int end = intervals[0].end;
      int count = 1;
      for(int i=1;i<intervals.length;i++){
    	  if(intervals[i].start >= end){
    		  count ++;
    		  end = intervals[i].end;
    	  }
      }
      return intervals.length-count;
    }

    class myComparator implements Comparator<Interval>{

		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.end-o2.end;
		}
    	
    }

	class Interval {
		      int start;
		      int end;
		      Interval() { start = 0; end = 0; }
		      Interval(int s, int e) { start = s; end = e; }
		  }
}
