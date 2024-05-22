import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final int wall = 1;
    private static final int path = 0;

    public static int shortestPath(int[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0});//start from

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int dist = current[2];

            if (row == rows - 1 && col == cols) {
                return dist;
            }
            int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] move : moves) {
                int newRow = row + move[0];
                int newCol = col + move[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && maze[newRow][newCol] == path) {
                    queue.add(new int[]{newRow, newCol, dist + 1});
                    maze[newRow][newCol] = wall;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int[][] maze={
            {0,1,0,0},
            {0,0,0,1},
            {1,1,0,0},
            {1,1,1,0}
    };
    int shortestDistance=shortestPath(maze);
    if (shortestDistance!=-1)
    {
        System.out.println("shortest distance from start to end : "+shortestDistance);
    }else {
        System.out.println("not path found from start to end");
       }
    }
}
