class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // SEARCH FOR ROW REPLICATION
        for(int i=0; i < 9; i++)
        {   
            Set<Character> seen = new HashSet<>();
            for (int j=0; j<9; j++)
            {
                if(board[i][j] == '.')
                {
                    continue;
                }

                if(seen.contains(board[i][j]))
                {
                    return false;
                }
                seen.add(board[i][j]);
            }
        }

            // COLUMN REPLICATION
             
            for(int i = 0 ; i < 9; i++)
            {
                Set<Character> seen = new HashSet<>();
                for(int j =0 ; j< 9; j++){
                if(board[j][i] == '.')
                {
                    continue;
                }

                if(seen.contains(board[j][i]))
                {
                    return false;
                }
                seen.add(board[j][i]);
                }
                 
            }

            
            for(int squrs = 0; squrs < 9 ; squrs++)
            {
                Set<Character> seen = new HashSet<>();
                for( int i =0 ; i < 3 ; i++)
                {
                    for(int j = 0 ; j < 3 ; j++)
                    {
                        int row = (squrs / 3) * 3 + i;
                        int col = ( squrs % 3 ) * 3 + j; 

                        if(board[row][col] == '.') continue;

                        if(seen.contains(board[row][col])) return false;

                        seen.add(board[row][col]);

                    }
                }
            }


        return true;
    }
}
