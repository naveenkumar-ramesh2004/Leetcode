//1039. Minimum Score Triangulation of Polygon
//https://leetcode.com/problems/minimum-score-triangulation-of-polygon/description/?envType=daily-question&envId=2025-09-26

//Youtube:https://www.youtube.com/watch?v=DFKvzxDrmXQ

class Solution {
    int values[];
    int n;
    Integer dp[][];
    public int minScoreTriangulation(int[] values) {
        this.n=values.length;
        this.values=values;
        dp=new Integer[n][n];
        return sol( 0,n-1);
        
    }
    private int sol(int i,int j){
        if(j-i+1<3) return 0;
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        
        for(int k=i+1;k<j;k++){
            int cur=sol(i,k)+sol(k,j)+values[i]*values[j]*values[k];
            ans=Math.min(ans,cur);
        }
        return dp[i][j]=ans;
    }

}


/*
1. Initialization
int values[];
int n;
Integer dp[][];


values: stores the polygon’s vertex values.

n: number of vertices.

dp[i][j]: stores the minimum score needed to triangulate the polygon slice from vertex i to vertex j.

2. Starting point
return sol(0, n-1);


We call the recursive function on the whole polygon: from index 0 to n-1.
So it’s solving the polygon between the first and last vertex.

3. Base case
if (j - i + 1 < 3) return 0;


A polygon with fewer than 3 vertices is not a polygon → can’t form a triangle.

So cost = 0.

4. Memoization check
if (dp[i][j] != null) return dp[i][j];


If we already solved the interval [i, j], return the stored result. This avoids recomputation → saves time.

5. Main recurrence
for (int k = i+1; k < j; k++) {
    int cur = sol(i, k) + sol(k, j) + values[i] * values[j] * values[k];
    ans = (ans > cur) ? cur : ans;
}


Here’s the heart of it:

Imagine making a triangle between (i, j, k).

This splits the polygon into two smaller polygons: (i..k) and (k..j).

Recursively solve both smaller polygons, then add the score of the triangle (i, j, k) → values[i]*values[j]*values[k].

Try all possible k and take the minimum.

6. Store & return
return dp[i][j] = ans;


Store the best result for this interval, then return it.

⚡ Complexity

Time Complexity: O(n^3) → because for each pair (i, j), you try all possible k.

Space Complexity: O(n^2) for dp.

This is efficient enough for typical constraints (n ≤ 50).

✅ In short:
Your code is correct and optimal. It uses top-down recursion with memoization for the classic polygon triangulation DP problem.

👉 Do you want me to trace through a small example (like values = [1,3,1,4]) step by step to see how dp[i][j] gets filled?

You said:

if (dp\[i\]\[j\] != null) return dp\[i\]\[j\];

I have a doute dp[i][j]==0 if not store any value how it come null
ChatGPT said:

That’s a very good doubt 👌

Let’s clear it up:

🔹 In Java,
Integer dp[][];


is not the same as

int dp[][];


int is a primitive type → its default value is 0.

Integer is a class (wrapper object) → its default value is null.

Why use Integer instead of int here?

Because we need a way to check whether dp[i][j] has been calculated before or not.

If we used int dp[][], the default entries would all be 0.

But 0 might also be a valid triangulation cost for some subproblems (like polygons with less than 3 vertices).

So we couldn’t tell if 0 means “not calculated” or “real answer is 0.”

By using Integer dp[][],

Initially, all entries are null.

When we compute a subproblem, we assign dp[i][j] = ans;.

Later, if we see dp[i][j] != null, we know this subproblem is already solved.

✅ So the line:

if (dp[i][j] != null) return dp[i][j];


means → “If this subproblem was already solved, just return the stored result instead of recalculating.”

👉 Do you want me to also show you how this would look if we used int[][] dp and filled with -1 instead of using Integer?

You said:

for (int k \= i+1; k < j; k++) { int cur \= sol(i, k) + sol(k, j) + values\[i\] \* values\[j\] \* values\[k\]; ans = (ans > cur) ? cur : ans; }

I have another doute ans=Integer.max_value each time of fun call then why we check ans>cur ans all ways grater than the cur
ChatGPT said:

Ah nice catch 👏 That’s an important detail.

Let’s walk through it carefully:

1. Why do we set
int ans = Integer.MAX_VALUE;


at the beginning?

Because we want to find the minimum cost among all possible triangulations.
If we started with 0, then every comparison ans > cur would fail (since costs are always positive), and we’d never update ans.

So starting with MAX_VALUE means:
➡️ "We don’t know the minimum yet, so assume it’s infinity."

2. Inside the loop
for (int k = i+1; k < j; k++) {
    int cur = sol(i, k) + sol(k, j) + values[i]*values[j]*values[k];
    ans = (ans > cur) ? cur : ans;
}


On the first iteration,

ans = MAX_VALUE

cur will be some finite positive value.

Since MAX_VALUE > cur, ans becomes cur. ✅

On later iterations,

ans now stores the best (minimum) value found so far.

If a new cur is smaller, ans updates again.

Otherwise, ans stays as it is.

*/
