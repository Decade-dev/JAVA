/*
在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
现有矩阵 matrix 如下：

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
给定 target = 5，返回 true。
给定 target = 20，返回 false。

限制：
0 <= n <= 1000
0 <= m <= 1000
*/
//方法1 对行列进行二分查找
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0){
            return false;
        }
        int list = matrix[0].length;
        int n = Math.min(list,row);
        for(int i = 0; i < n; i++){
            boolean flag1 = binary_search_list(matrix,i,target);
            boolean flag2 = binary_search_row(matrix,i,target);
            if(flag1 || flag2){
                return true;
            }
        }
        return false;
    }

    public boolean binary_search_row(int[][] arr, int n, int target){
        int left = n;
        int right = arr[0].length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[n][mid] == target){
                return true;
            }else if(arr[n][mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }

    public boolean binary_search_list(int[][] arr, int n, int target){
        int left = n;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid][n] == target){
                return true;
            }else if(arr[mid][n] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}
