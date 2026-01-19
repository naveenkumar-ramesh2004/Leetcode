## [Smallest and Largest word](https://www.geeksforgeeks.org/problems/smallest-and-largest/1)
```
class Solution {
    public ArrayList<String> smallerAndLarge(String s) {
        // code here
        String[] words=s.split("\\s+");
        String min=words[0];
        String max=words[0];
        for(String c:words){
                if(c.length()<min.length()){
                    min=c;
                }
                if(c.length()>=max.length()){
                    max=c;
                }
            }
        ArrayList<String> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
        }
        
        
    }
