/**
 * The Maze class is a class that will check if a maze is solvable
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.15
 */

public class Maze {

    public static int[][] copyMaze(int[][] maze) {
        int[][] tempMaze = new int[maze.length][];
        for (int x = 0; x < maze.length; x++){
            tempMaze[x] = maze[x].clone();
        }
        return tempMaze;
    }

    /**
     * Finds if the maze is exitable
     *
     * @param maze The maze that needs the exit to be found
     * @param x    The row of the maze
     * @param y    The column of the maze
     * @return Whether there is an exit or not
     */
    static boolean exitMaze(int[][] maze, int x, int y) {
        if (x < 0 || x > 4 || y < 0 || y > 4 || maze[x][y] > 0) { //If the spot is either outside of the maze or not part of the path
            return false;
        } else if ((x == 4 || y == 4) && maze[x][y] == 0) { //If the the spot is the exit
            return true;
        }
        if (maze[x][y] == 0)    //If it was a valid path
            maze[x][y] = 2; //Marks the path so it doesn't backtrack
        return exitMaze(maze, x + 1, y) || exitMaze(maze, x - 1, y) || exitMaze(maze, x, y + 1) || exitMaze(maze, x, y - 1);    //Checks the spots next to the current one
    }

    /**
     * This method creates a maze and calls the exitMaze method and outputs what is returned
     *
     * @param args [ ]  String array that allows command line parameters to be used when executing the program.
     */
    public static void main(String[] args) {
        int[][] maze = {
                {0, 1, 0, 1, 1},
                {0, 0, 0, 0, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};

        System.out.println(exitMaze(copyMaze(maze), 0, 0)); //Goes through the maze starting in the top left looking for an entrance and a way to the exit
    }
}
