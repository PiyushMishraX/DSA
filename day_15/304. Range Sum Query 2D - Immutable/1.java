class NumMatrix {

    int[][] prefix2D;
    int row, column;

    public NumMatrix(int[][] matrix) {

        row = matrix.length;
        column = matrix[0].length;

        prefix2D = new int[row][column];

        // sum of each column till index
        for( int i = 0; i < column; i ++){
            prefix2D[0][i] = matrix[0][i];
        }
        for( int i = 1; i < row; i++){
            for( int j = 0; j < column; j++){
                prefix2D[i][j] = prefix2D[i-1][j] + matrix[i][j];
            }
        }

        // sum of each reactable before the the index ( sum of rows till index in prefix2D)

        for( int i = 1; i < column; i++){
            for( int j = 0; j < row; j++){
                prefix2D[j][i] += prefix2D[j][i-1];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sumOfRegion = 0;

        if( row1 > 0) {
            if(col1 > 0){
                return prefix2D[row2][col2] - prefix2D[row2][col1-1] - ( prefix2D[row1 - 1][col2] - prefix2D[row1-1][col1-1] );
            } else {
                return prefix2D[row2][col2] - prefix2D[row1 -1 ][col2];            }
        } 
        if( col1>0){
            return prefix2D[row2][col2] - prefix2D[row2][col1-1];
        }

        return prefix2D[row2][col2];

        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */