## [Largest subarray with 0 sum](https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1)
```
class Solution {
	int maxLength(int arr[]) {
		// code here
		HashMap<Integer, Integer> mapp = new HashMap<>();
		int sum = 0;
		int maxLength = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
			if (sum == 0) {
				maxLength = i + 1;
			}
			else {
				if (mapp.containsKey(sum)) {
					maxLength = Math.max(maxLength, i - mapp.get(sum));
				}
				else {
					mapp.put(sum, i);
				}
			}
		}
		return maxLength;
	}
}
```
