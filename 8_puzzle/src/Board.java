import java.lang.Math;
import java.util.Collection;
import java.util.LinkedList;

public class Board implements Comparable<Board>{

    private int priority;
    private int moves;
    private int[][] grid;
    private String gridString;
    private Board parent;
    private int zeroRow=-1;
    private int zeroCol=-1;
    private Collection<Board> neighbours;

    public  Board(String s) {
        int[][] arr = new int[3][3];
        int x = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(s.charAt(x)));
                x += 2;
            }

        }
        this.gridString=s;
        this.grid=arr;
        this.moves=0;
        this.setPriority();
        this.parent=null;
    }

    public Board(int[][] grid,int moves,Board parent) {
       this.grid=grid;
       this.moves=moves;
       this.setPriority();
       this.parent=parent;

    }

    public int getPriority(){
        return this.priority;
    }

    public void setPriority(){
        this.priority=this.moves+Manhatten();
    }
    @Override
    public int compareTo(Board other) {

        int cmp = this.priority - other.priority;
        return Integer.compare(cmp, 0);
    }

    public int[][] getGrid(String s) {
        int[][] arr = new int[3][3];
        int x = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(s.charAt(x)));
            }
            x += 2;
        }
        return arr;
    }

     public Board getParent() {
         return this.parent;
     }
     public Collection<Board> getChildren(){
         if (this.zeroRow == -1 && this.zeroCol == -1) findZeroTile();
         this.neighbours=new LinkedList<>();

         if (zeroRow - 1 >= 0)           generateNeighbor(zeroRow - 1, true);
         if (zeroCol - 1 >= 0)           generateNeighbor(zeroCol - 1, false);
         if (zeroRow + 1 < 3)  generateNeighbor(zeroRow + 1, true);
         if (zeroCol + 1 < 3)  generateNeighbor(zeroCol + 1, false);



         return neighbours;

     }

    private void findZeroTile() {
        outerloop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if (grid[i][j] == 0) {
                    this.zeroRow = i;       // index starting from 0
                    this.zeroCol = j;
                    break outerloop;
                }
            }
        }
    }


    private void generateNeighbor(int toPosition, boolean isRow) {
        int[][] copy = copyArray(this.grid);
        if (isRow)  swapEntries(copy, zeroRow, zeroCol, toPosition, zeroCol);
        else        swapEntries(copy, zeroRow, zeroCol, zeroRow, toPosition);
        Board newBoard=new Board(copy,this.moves+1,this);
        neighbours.add(newBoard);

    }
    private int[][] copyArray(int[][] grid){
        int[][] copy=new int[grid.length][grid.length];
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[i].length; j++)
                copy[i][j]=grid[i][j];
            return copy;
    }


    private void swapEntries(int[][] array, int fromRow, int fromCol, int toRow, int toCol) {
        int i = array[fromRow][fromCol];
        array[fromRow][fromCol] = array[toRow][toCol];
        array[toRow][toCol] = i;
    }

    public  boolean equalgrid(Board other){
        if(other==null) return false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.grid[i][j] != other.grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean goalTest () {
            int x = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (this.grid[i][j] != x) {
                        return false;
                    }
                    x++;
                }
            }
            return true;
    }

    public String arrToString (){
        StringBuilder s = new StringBuilder() ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.grid[i][j]+" ");
              s.append(this.grid[i][j]).append(',');
            }
            System.out.println();
        }
        s.setLength(s.length()-1);
        return s.toString();
    }


    private int Manhatten() {
        int manhattan = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] != 0 ) {
                    int expectedRow = grid[i][j]  / 3;
                   int expectedCol = grid[i][j] % 3;
                    manhattan += Math.abs(expectedRow - i) + Math.abs(expectedCol - j);
                }
            }
        }
        return manhattan;
    }

    private double Euclidean(int[][] arr) {
        double d = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Integer x = new Integer(3);
                String retval = x.toString(arr[i][j], 3);
                x = Integer.parseInt(retval);
                int y =x%10; x=x/10;
                d+= Math.sqrt(  Math.pow((x-1),2) + Math.pow((y-0),2) );
            }
        }
        return d;
    }


    private int getInvCount(String s) {
        int inv_count = 0;
        for (int i = 0; i < s.length(); i = i + 2){
            for (int j = i + 2; j < s.length(); j = j + 2) {
                int num1=Integer.parseInt(String.valueOf(s.charAt(i)));
                int num2=Integer.parseInt(String.valueOf(s.charAt(j)));
                if (num1>0 && num2>0 && num1> num2)
                    inv_count++;
            }
    }

        return inv_count;
    }

    // This function returns true
    // if given 8 puzzle is solvable.
    public boolean isSolvable()
    {
        // Count inversions in given 8 puzzle
        int invCount = getInvCount(this.gridString);

        // return true if inversion count is even.
        return (invCount % 2 == 0);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        return this.equalgrid((Board) obj);
    }
    public int getMoves(){
        return this.moves;
    }

}