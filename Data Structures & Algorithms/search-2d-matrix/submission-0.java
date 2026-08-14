class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int l = 0;
        int r = matrix[0].length - 1;
        int n = matrix[0][(l+r)/2];

        while(n != target && i < matrix.length){
            while(n != target && l <= r){
                int m = (l+r)/2;

                n = matrix[i][m];
                if(n < target){
                    l = m + 1;
                }
                else if(n > target){
                    r = m - 1;
                }
            }
            l = 0;
            r = matrix[0].length - 1;
            i++;
        }

        return n == target;
    }
}
