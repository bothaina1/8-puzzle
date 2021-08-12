import java.util.*;

public class problemSolver {

    Stack<Board> solution;

    public void BFS(Board initialState){
        if(!initialState.isSolvable()){
            System.out.println("the 8  puzzle is unsolvable");
            return;
        }
        solution=new Stack<>();
        Queue<Board> frontier=new ArrayDeque<>();
        LinkedList<Board> explored= new LinkedList<>();
        frontier.add(initialState);

        while (!frontier.isEmpty()) {
            Board state = frontier.remove();
            explored.add(state);
            //Board previous = state.getParent();

            if (state.goalTest()) {
                solution.add(state);
                break;
            }

            for (Board child : state.getChildren()) {
                if (!explored.contains(child)&& !frontier.contains(child)) {
                    frontier.add(child);
                    child.arrToString();
                }
            }
        }

        System.out.println("cost of path : "+solution.peek().getMoves());
        System.out.println("expanded nodes : " +explored.size());
        System.out.println("depth of path : "+solution.peek().getMoves());
        System.out.println("frontier nodes : " +frontier.size());
        this.getSolution();
    }

    public void DFS(Board initialState){
        if(!initialState.isSolvable()){
            System.out.println("the 8  puzzle is unsolvable");
            return;
        }
        solution=new Stack<>();
        Stack<Board> frontier=new Stack<>();
        LinkedList<Board> explored= new LinkedList<>();
        frontier.add(initialState);

        while (!frontier.isEmpty()) {
            Board state = frontier.pop();
            explored.add(state);
            //Board previous = state.getParent();

            if (state.goalTest()) {
                solution.add(state);
                break;
            }

            for (Board child : state.getChildren()) {
                if (!explored.contains(child)&& !frontier.contains(child)) {
                    frontier.add(child);
                    child.arrToString();
                }
            }
        }

        System.out.println("cost of path : "+solution.peek().getMoves());
        System.out.println("expanded nodes : " +explored.size());
        System.out.println("depth of path : "+solution.peek().getMoves());
        System.out.println("frontier nodes : " +frontier.size());
        this.getSolution();    }






    public void A_Star_Search(Board initialState) {
        if(!initialState.isSolvable()){
            System.out.println("the 8  puzzle is unsolvable");
            return;
        }
        solution=new Stack<>();
        PriorityQueue<Board> frontier = new PriorityQueue<Board>();
        LinkedList<Board> explored= new LinkedList<>();
        frontier.add(initialState);

        while (!frontier.isEmpty()) {
            Board state = frontier.remove();
            explored.add(state);
            //Board previous = state.getParent();

            if (state.goalTest()) {
                solution.add(state);
                break;
            }

            for (Board child : state.getChildren()) {
                if (!explored.contains(child)&& !frontier.contains(child)) {
                    frontier.add(child);

                }
            }
        }
        System.out.println("cost of path : "+solution.peek().getMoves());
        System.out.println("expanded nodes : " +explored.size());
        System.out.println("depth of path : "+solution.peek().getMoves());
        System.out.println("frontier nodes : " +frontier.size());
        this.getSolution();


    }

    public void getSolution(){
        while(solution.peek().getParent() != null)
            solution.add(solution.peek().getParent());

        while (!solution.isEmpty()) {
            Board b=solution.pop();
            b.arrToString();


            System.out.println("---------------------------------------");
        }
    }
}
