## [Sorting Elements of an Array by Frequency](https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0)

```
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    HashMap<Integer,Integer> freq = new HashMap<>();
		    for(int j=0;j<n;j++){
		        int val=sc.nextInt();
		        freq.put(val,freq.getOrDefault(val,0)+1);
		    }
		    sortByFreq(freq);
		    System.out.println();
		}
	}
	static void sortByFreq(HashMap<Integer,Integer> freq){
	    ArrayList<Map.Entry<Integer,Integer>> sort = new ArrayList<>(freq.entrySet());
	    Collections.sort(sort,(a,b)->{
	        if(a.getValue().equals(b.getValue())){
	            return a.getKey()-b.getKey();
	        }
	        else{
	            return b.getValue()-a.getValue();
	        }
	    });
	    for(Map.Entry<Integer,Integer> entry:sort){
	        for(int i=0;i<entry.getValue();i++){
	            System.out.print(entry.getKey()+" ");
	        }
	    }
	}
}
