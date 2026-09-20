class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length;
        int col = mat[0].length;
        int answer[][] = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){

int sum=0;
                for(int r=i-k;r<=i+k;r++){
                    for(int c = j-k;c<=j+k;c++){
                        if(r>=0  && r<rows && c>=0 && c<col){
                            sum+= mat[r][c];
                        }
                    }
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}