import java.util.*;

public class shortestpath {

   
    public static float shortestPath(String str){
        int x=0, y=0; // starting point (x,y)
        for(int i =0;i<str.length();i++){
            char dir = str.charAt(i);
            if (dir == 'S') {
                y--;
            }
            else if (dir == 'N'){
                y++;
            }
            else if (dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;  
        int Y2 = y*y; 
        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
