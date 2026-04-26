class Solution {
    private boolean betterSol(char [][] board)
    {
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
    private boolean optimalSol( char [][] board)
    {
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();
        for( int r = 0 ; r < 9 ; r ++)
        {
            for(int c = 0; c < 9; c++ )
            {
                Character curr = board[r][c];

                if(curr == '.') continue;

                String squareKey = (r / 3) + "," + (c / 3);

                boolean condition = row.computeIfAbsent(r , k -> new HashSet<>()).contains(curr) ||
                col.computeIfAbsent(c , k -> new HashSet<>()).contains(curr)||
                squares.computeIfAbsent(squareKey , k -> new HashSet<>()).contains(curr); 
                
                if(condition)
                {
                    return false;
                }

                row.get(r).add(curr);
                col.get(c).add(curr);
                squares.get(squareKey).add(curr);

            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        
        // return betterSol(board);
        return optimalSol(board);
       
    }
}
