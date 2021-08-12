import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class runner {
    public static void main(String[] args) {

     String a="1,6,0,2,5,3,4,7,8";

     Board board=new Board(a);
     problemSolver solution=new problemSolver();
     solution.A_Star_Search(board);



    }
}
