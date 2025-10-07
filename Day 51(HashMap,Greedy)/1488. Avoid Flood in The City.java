// 1488. Avoid Flood in The City
// https://leetcode.com/problems/avoid-flood-in-the-city/description/?envType=daily-question&envId=2025-09-26

class Solution {
    public int[] avoidFlood(int[] nums) {
        int ans[] = new int[nums.length];
        Map<Integer,Integer> lakes = new HashMap<>();
        TreeSet<Integer> dry = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                dry.add(i);
                ans[i]=1;
            }
            else{
                ans[i]=-1;
                if(lakes.containsKey(nums[i])){
                    Integer whendry=dry.higher(lakes.get(nums[i]));
                    if(whendry==null){
                        return new int[0];
                    }
                    ans[whendry]=nums[i];
                    dry.remove(whendry);
                    lakes.put(nums[i],i);
                }
                else{
                    lakes.put(nums[i],i);
                }
            }
        }
        return ans;
    }
}
/*
Input:
rains = [1, 2, 0, 1, 2]

Meaning:

Day 0: Rain fills lake 1

Day 1: Rain fills lake 2

Day 2: Dry day (you can dry any lake)

Day 3: Rain again in lake 1

Day 4: Rain again in lake 2

We must never rain on a lake that’s already full before drying it.

💡 Step-by-Step
Day	Rain/Dry	What Happens	Dry Day Set	Full Lakes Map	Answer
0	rain 1	Lake 1 full	∅	{1→0}	[-1]
1	rain 2	Lake 2 full	∅	{1→0, 2→1}	[-1, -1]
2	dry day	we can choose later which lake to dry	{2}	same	[-1, -1, 1]
3	rain 1	Lake 1 already full → need a dry day after 0	{2} → pick 2	{1→3, 2→1}	[-1, -1, 1, -1]
4	rain 2	Lake 2 full → need dry > 1 → none left ⇒ OK since we dried 1	final map OK	[-1, -1, 1, -1, -1]	

✅ works fine.

🧠 Core ideas to remember

Use a map to remember when each lake was last filled.

Use a TreeSet to store dry days (sorted automatically).

When a lake rains again, find the smallest dry day after its last rain → dry that lake there.

If no such dry day exists → impossible.

Would you like me to show this example visualized in code form (just the logic, not full code) next? It’ll make everything click.

You said:
give another example
ChatGPT said:

Perfect 👍 let’s take another one — a bit trickier:

🌧 Example 2

rains = [1, 2, 0, 2, 3, 0, 1]

We’ll go day by day.

Day	rains[i]	Action	Dry Days Available	Full Lakes Map	ans[i]	Explanation
0	1	Rain fills lake 1	∅	{1 → 0}	-1	Lake 1 is full now
1	2	Rain fills lake 2	∅	{1 → 0, 2 → 1}	-1	Lake 2 is full now
2	0	Dry day	{2}	{1 → 0, 2 → 1}	1 (dry lake 1 or 2 later)	We’ll decide which to dry later
3	2	Oh! rain again in lake 2	{2}	{1 → 0, 2 → 1}	-1	Need to dry lake 2 after day 1 and before day 3 → dry at day 2. So day 2 = dry lake 2. Remove dry day {2}. Update map {1→0, 2→3}
4	3	Rain fills lake 3	∅	{1→0, 2→3, 3→4}	-1	New lake full
5	0	Dry day	{5}	same	1	Can use later
6	1	Oh! rain again in lake 1	{5}	{1→0, 2→3, 3→4}	-1	Need to dry lake 1 after day 0 and before day 6 → day 5 is perfect → dry at 5. Remove dry day {5}. Update {1→6, 2→3, 3→4}

✅ Final ans = [-1, -1, 2, -1, -1, 1, -1]

💡 Summary

We used a map to track which lake got full and when.

We used a sorted set (TreeSet) to pick the nearest dry day that comes after a lake’s last fill.

When no such day exists → flood = ❌ impossible.


Method	When No Match	Return Value
higher(x)	no element > x	null return gratest element ,otherwise nul coz itis Integer
lower(x)	no element < x	null
ceiling(x)	no element ≥ x	null
floor(x)	no element ≤ x	null
*/
