/**
 * StairCaseSearch
 */
public class StairCaseSearch {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        int row=0;
        int col=matrix[0].length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==target){
                System.out.println("("+row+","+col+")");
                break;
            } else if(matrix[row][col]>target){
                col--;
            } else if(matrix[row][col]<target){
                row++;
            }
        }
    }
}