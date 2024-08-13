package BinarySearch.medium.ques1;

class MySolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 7,20,30,40,50,60

        int row = matrix.length;
        int col = matrix[0].length;
        if(target > matrix[row-1][col-1]){
            return false;
        }
        if(target < matrix[0][0]){
            return false;
        }
        int l = 0;
        int r = row-1;
        int g = row;
        if(row==1){
            g = 0;
        }else{
            while(l<=r){
                int mid = (l+r)/2;
                if(target==matrix[mid][col-1]){
                    return true;
                }else if(target<matrix[mid][col-1]){
                    g = mid;
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
        }
        l = 0;
        r = col-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(target == matrix[g][mid]){
                return true;
            }else if(target<matrix[g][mid]){
                // g = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return false;

    }
}
