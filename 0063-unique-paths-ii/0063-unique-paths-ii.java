class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1){
            return 0;
        }

        int[] arr = new int[n];
        arr[0] = 1;

        for(int i = 1; i<n; i++){

            if(obstacleGrid[0][i] == 1){

                for(int j = i; j<n; j++){
                    arr[j] = 0;
                }

                break;
            }

            else{
                arr[i] = 1;
            }
        }

        for(int i = 1; i<m; i++){
            for(int j = 0; j<n; j++){

                if(obstacleGrid[i][j] == 1){
                    arr[j] = 0;
                }

                else if(j > 0){
                    arr[j] = arr[j] + arr[j-1];
                }
            }
        }

        return arr[n-1];
    }
}