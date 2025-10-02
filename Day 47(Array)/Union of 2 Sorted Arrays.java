//Union of 2 Sorted Arrays
//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1


 class Solution{
     public static ArrayList<Integer> findUnion(int a[], int b[]) {
         Set<Integer> union = new TreeSet<>();

         for(int val:a){
             union.add(val);
         }
         for(int val:b){
             union.add(val);
         }
         return new ArrayList<>(union);
     }
 }
/*
Hashset------------
Time Complexity: O(n + m) (average, due to HashSet insertions).
Space Complexity: O(n + m).
Output: Unordered union

TreeSet--------------
Time: O((n + m) log(n + m)) (because each insert into TreeSet costs O(log n)).
Space: O(n + m).
*/
 
 
 // class Solution {
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {
//         // code here
//         ArrayList<Integer> union = new ArrayList<>();
//         int i=0,j=0;
//         while(i<a.length && j<b.length){
//             int size=union.size();
//             if(a[i]<=b[j]){
//                 if(size==0||!union.get(size-1).equals(a[i])){
//                 union.add(a[i]);
//                 i++;}
//             }
//             else{
//                 if(size==0||!union.get(size-1).equals(b[j])){
//                 union.add(b[j]);
//                 j++;}
//             }
//         }
//         while(i<a.length){
//             int size=union.size();
//              if(size==0||!union.get(size-1).equals(a[i])){
//                 union.add(a[i]);
//                 i++;}
//         }
//         while(j<b.length){
//             int size=union.size();
//              if(size==0||!union.get(size-1).equals(b[j])){
//                 union.add(b[j]);
//                 j++;}
//         }
//         return union;
//     }
// }

/*
You have two sorted arrays a[] and b[].

You’re using two pointers (i for a[], j for b[]) to merge them into a new list.

At each step, you pick the smaller of a[i] or b[j].

Before adding, you check if the element is not equal to the last element in the union (union.get(size-1)) — this prevents duplicates.

Then you continue until one array finishes.

After that, you copy the remaining elements from the other array (again checking for duplicates).
You can replace union.get(size-1) != a[i] with !union.get(size-1).equals(a[i]) (safer for objects, though for int autoboxing it’s fine).
*/
