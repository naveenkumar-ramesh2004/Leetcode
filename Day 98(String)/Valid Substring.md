## [Valid Substring](https://www.geeksforgeeks.org/problems/valid-substring0624/1)
```
class Solution {
    public int maxLength(String s) {
        // code here
        int max=0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    max=Math.max(max,i-stack.peek());
                }
            }
        }
        return max;
    }
}
