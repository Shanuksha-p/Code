package Leetcode.Topics.BinarySearch;

public class countNegativeNumbersInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int i=0,j=m-1;
        int count=0;
        while(i>=0 && i<n && j>=0 && j<m){
            if(grid[i][j]<0){
                count+=(n-i);
                j--;
            }
            else if(grid[i][j]>=0){
                i++;
            }
        }
        return count;
    }
}
