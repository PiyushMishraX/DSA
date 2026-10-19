class NumMatrix {

    int[][] prefix2D;
    int row, column;

    public NumMatrix(int[][] matrix) {


// ( m + 1) x ( n + 1)
        row = matrix.length + 1 ;
        column = matrix[0].length + 1 ;

        prefix2D = new int[row][column];

// single pass prefix2D array creation
        for( int i = 1; i < row; i++){
            for(int j = 1; j < column; j ++){
                prefix2D[i][j] = prefix2D[i-1][j] + matrix[i-1][j-1] + prefix2D[i][j-1] - prefix2D[i-1][j-1];

                // - prefix2D[i-1][j-1]; this value is added both in the row and column additions so removing it one time gives accurate value
            }
        }

        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        return prefix2D[row2+1][col2+1] - prefix2D[row2 + 1][col1] - ( prefix2D[row1 ][col2+1] - prefix2D[row1][col1] );

        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */