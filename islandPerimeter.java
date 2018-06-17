/***
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
***/

class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int row = 0;
        while (row < grid.length){
            int col = 0;
            while(col < grid[0].length){
                ans = ans + getPerimeter(grid, row, col);
                col++;
            }
            
            row++;
        }
        return ans;
    }
    private int getPerimeter(int[][] grid, int row, int col){
        int num = 0;
        //check adjacent cells
        
        //if land is...
        if(grid[row][col] == 1){
            //...in first row
            if( row == 0)
                num++;
            //... in first col
            if(col == 0)
                num++;
            //... in last col
            if(col == grid[row].length -1)
                num++;
            //... in last row
            if(row == grid.length -1)
                num++;
            //...in elsewhere, check its sides
            int left = col - 1;
            int right = col + 1;
            int above = row - 1;
            int below = row + 1;
            if (left >= 0 && grid[row][left] == 0)
                num++;
            if(right <= grid[row].length-1 && grid[row][right] == 0)
                num++;
            if(above >= 0 && grid[above][col] == 0)
                num++;
            if(below <= grid.length-1 && grid[below][col] == 0)
                num++;
        }
        return num;
        
    }
}