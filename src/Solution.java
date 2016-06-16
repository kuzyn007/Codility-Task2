//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(Tree T) {
		if (T == null) {
			return -1;
		}
		return visibleNode(T, Integer.MIN_VALUE);
	}
	
	public int visibleNode(Tree T, int max) {
     if(T == null) {
         return 0;
     }

     int suma = 0;

     if(T.x >= max) {
         suma = 1;
         max = T.x;
     }

     return suma + visibleNode(T.l, max) + visibleNode(T.r, max);
 }
}
