## [Overlapping Intervals](https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1)

```
class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        return merge(arr);
    }

    ArrayList<int[]> merge(int[][] arr) {

        ArrayList<int[]> ans = new ArrayList<>();

        ans.add(new int[]{arr[0][0], arr[0][1]});

        for (int i = 1; i < arr.length; i++) {

            int[] last = ans.get(ans.size() - 1);

            if (arr[i][0] <= last[1]) {

                last[1] = Math.max(last[1], arr[i][1]);

            } else {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
