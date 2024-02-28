import java.util.*;

public class spiral {

    public static void printSpiral(int matrice[][]){
        int starRow =0;
        int startCol =0;
        int endRow =matrice.length-1;
        int endCol =matrice[0].length-1;
        while(starRow<=endRow&& startCol<=endCol){
            //top bound
            for(int j=startCol;j<=endCol;j++){
                
                System.out.print(matrice[starRow][j]+" ");
            }
            //right
            for(int i=starRow+1;i<=endRow;i++){
                System.out.print(matrice[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(starRow==endRow){
                    break;
                }
                System.out.print(matrice[endRow][j]+" ");
            }
            for(int i=endRow-1;i>=starRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrice[i][startCol]+" ");
            }

            starRow++;
            endRow--;
            startCol++;
            endCol--;
           
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrice [][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16},
                            {17,18,19,20}};

        printSpiral(matrice);                    
    }
}
