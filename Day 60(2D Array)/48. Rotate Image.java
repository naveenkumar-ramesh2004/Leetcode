// 48. Rotate Image
// https://leetcode.com/problems/rotate-image/description/


//brute force method to use extra 2D array to store each value in correct place
//and in place the temp arr -> Original array

//Time =>o(n^2) + o(n^2)  => 1.store val in correct place and 2.store the temp arr value to orginal arr
//Space =>o(n^2) => use extra array to rotate the value; 

// class Solution {
//     public void rotate(int[][] matrix) {
//         int n=matrix.length;
//         int[][] arr = new int[n][n];
//         int row=0,col=n-1;
//         for(int[] array:matrix){
//             for(int val:array){
//                 arr[row++][col]=val;
//             }
//             row=0;
//             col--;
//         }
//         row=0;
//         col=0;
//         for(int[] array:arr){
//             for(int val:array){
//                 matrix[row][col++]=val;
//             }
//             row++;
//             col=0;
            
//         }
//     }
// }


//first swap the row 0 n-1 ,1 n-2 ....
//swap the element matrix[i][j]=matrix[j][i];
//Time =>
//1.reverse a row
// ✅ Runs for n/2 iterations → O(n)
// ✅ Each swap takes O(1) time.

// In Big-O notation, we ignore constant factors like 1/2, 2, 3, etc.

//2️⃣ Transpose Matrix
// ✅ Outer loop → n times
// ✅ Inner loop → runs roughly n/2 times for each outer loop
// 👉 Total → O(n × n/2) = O(n²/2)  => o(n^2)

// over all O(n)+O(n^2) =>O(n+n^2) => O(n^2)  coz Big-o notation take only the "major factor "O(n^2)
//But in Big-O, we keep only the "dominant term" (the one that grows fastest).


// space O(1)
// coz The temp variable stores a reference to a row (int[] temp = matrix[i];), not a copy.
// It doesn’t create a new array of size n.

class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i=0;i<len/2;i++){
            int[] temp = matrix[i];
            matrix[i]=matrix[len-1-i];
            matrix[len-1-i] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int k = matrix[i][j];
                  matrix[i][j] = matrix[j][i];
                  matrix[j][i] = k;
            }
        }
    }
}
