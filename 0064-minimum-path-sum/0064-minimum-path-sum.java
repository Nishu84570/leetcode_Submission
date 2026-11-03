class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] arr = new int[n];
        arr[0] = grid[0][0];

        for(int i = 1; i<n; i++){
            arr[i] = grid[0][i] + arr[i-1];
        }

        for(int i = 1; i<m; i++){
            for(int j = 0; j<n; j++){
                if(j > 0){
                    arr[j] = Math.min(arr[j-1] , arr[j]) + grid[i][j];
                }

                else{
                    arr[j] = grid[i][j] + arr[j];
                }
            }
        }

        return arr[n-1];
    }
}