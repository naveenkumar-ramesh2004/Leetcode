## [Fractional Knapsack](https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1)
```
class Item {
	int value;
	int weight;
	
	Item(int value, int weight) {
		this.value = value;
		this.weight = weight;
	}
}
class Solution {
	public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
		// code here
		double ans=0;
		Item[] Items = new Item[val.length];
		for (int i = 0; i<val.length; i++) {
			Item temp = new Item(val[i], wt[i]);
			Items[i] = temp;
		}
		Arrays.sort(Items, (a, b)->
		Double.compare((double)b.value/b.weight, (double)a.value/a.weight));
		for (int i = 0; i<Items.length; i++) {
			if (Items[i].weight <= capacity) {
				ans += Items[i].value;
				capacity -= Items[i].weight;
			}
			else {
				ans += (((double)capacity/Items[i].weight)*Items[i].value);
				capacity = 0;
			}
			if (capacity == 0)
				return ans;
		}
		return ans;
	}
}
