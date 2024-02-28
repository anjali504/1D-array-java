import java.util.*;
public class sortedMatrix {

    //stair case method to find the number of elements in a
    //sorted matrix.
    public static boolean stairSerch(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col>=0){
            if (matrix[row][col] == key){ 
                System.out.print(key + " found at ( "+ row +","+ col+" )");  
                return true;
               
            }
        
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key = 1111;
        stairSerch(matrix, key);
        
    }
}    

