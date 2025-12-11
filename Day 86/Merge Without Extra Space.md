## [Merge Without Extra Space](https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1)

```
class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i=0;
        while(i<a.length){ // check each value in a[i] to b[0] coz b[0] always sorted
            if(a[i]>b[0]){
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;
                for(int j=0;j<b.length-1;j++){ // each time swaped the second arry become unsorted so sort the array 
                    if(b[j]>b[j+1]){
                        temp=b[j];
                        b[j]=b[j+1];
                        b[j+1]=temp;
                    }
                    else{   // stop swap coz once the if fail the after element all was grater than so
                        break;
                    }
                }
            }
            i++;
        }
    }
}
