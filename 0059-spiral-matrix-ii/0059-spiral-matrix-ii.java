class Solution {
    public int[][] generateMatrix(int n) {
         int arr[][] = new int[n][n];

         int srow = 0, erow = n-1;
         int scol = 0, ecol = n-1;
         int val = 1;

         while(srow <= erow && scol <= ecol) {

            for(int i=scol;i<=ecol;i++) {
                arr[srow][i] = val++;
            }

            for(int j=srow+1;j<=erow;j++){
                arr[j][ecol] = val++;
            }

                for(int k=ecol-1;k>=scol;k--){
                    arr[erow][k] = val++;
                }
                
                for(int l=erow-1;l>srow;l--){
                    arr[l][scol] = val++;
                }

            srow++;erow--;scol++;ecol--;
         }
        return arr;

    }
}