import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class problemSolver {


    public void BFS(Board initialState){
        if(initialState.isSolvable()){
            System.out.println("the 8  puzzle is unsolvable");
            return;
        }
    }

    public void DFS(Board initialState){
        if(initialState.isSolvable()){
            System.out.println("the 8  puzzle is unsolvable");
            return;
        }

    }

    public void A_Star_Search(Board initialState) {
        if(initialState.isSolvable()){
            System.out.println("the 8  puzzle is unsolvable");
            return;
        }
        Stack<Board> solution=new Stack<>();
        PriorityQueue<Board> frontier = new PriorityQueue<Board>();
        // LinkedList<Board> explored= new LinkedList<>();
        frontier.add(initialState);

        while (!frontier.isEmpty()) {
            Board state = frontier.remove();
            Board previous = state.getParent();

            if (state.goalTest()) {
                solution.add(state);
                break;
            }

            for (Board child : state.getChildren()) {
                if (!child.equals(previous)) {
                    frontier.add(child);
                    child.arrToString();
                }
            }
        }

      while(solution.peek().getParent() != null)
          solution.add(solution.peek().getParent());

      while (!solution.isEmpty()) {
          Board b=solution.pop();
         b.arrToString();
         System.out.println(b.getPriority());

          System.out.println("---------------------------------------");
      }

    }
}
