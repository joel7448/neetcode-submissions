class Solution {
    public int uniquePaths(int m, int n) {
        // int[][] path = new int[m][n];
        
        int[] path = new int[n];
        Arrays.fill(path, 1);
        // for (int i = 0; i < m; i++) {
        //     Arrays.fill(path[i], 1);
        // }
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                // path[i][j] = path[i-1][j] + path[i][j-1];
                path[j] = path[j] + path[j-1];               


            }


        }

        return path[n-1];
        
    }
}
