import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class runner {
    public static void main(String[] args) {
    int[][] a=new int[3][3];
        a[0][0]=1;
        a[0][1]=0;
        a[0][2]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[1][2]=5;
        a[2][0]=6;
        a[2][1]=7;
        a[2][2]=8;


     Board b=new Board(a,0,null);
     problemSolver solution=new problemSolver();
     solution.A_Star_Search(b);


    }
}
