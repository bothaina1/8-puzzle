import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class problemSolver {


    public void BFS(Board initialState){
    }

    public void DFS(Board initialState){
    }

    public void A_Star_Search(Board initialState) {
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
