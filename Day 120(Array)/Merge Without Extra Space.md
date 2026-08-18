## [Merge Without Extra Space](https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1)

```

//Better O(n*m)

// class Solution {
//     public void mergeArrays(int a[], int b[]) {
//         // code here
//         for(int i=0;i<a.length;i++){
//             if(a[i]<=b[0]){
//                 continue;
//             }
            
//             int temp=a[i];
//             a[i]=b[0];
//             b[0]=temp;
            
//             int j=0;
//             while(j<b.length-1 && b[j]>b[j+1]){
//                 temp = b[j];
//                 b[j]=b[j+1];
//                 b[j+1] = temp;
//                 j++;
//             }
//         }
//     }
// }

// optimal O(m+n) + (n long n) + (m log m)
class Solution {
    public void mergeArrays(int a[], int b[]) {
        int i=a.length-1;
        int j=0;
        while(i>=0 && j<b.length && a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}


