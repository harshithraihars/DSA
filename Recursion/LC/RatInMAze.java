public class RatInMAze {

    public static boolean isvalid(int maze[][], int i, int j) {
        if (i >= 0 && i < maze.length && j >= 0 && j < maze.length) {
            return true;
        }
        return false;
    }

    public static void Solve(int maze[][], StringBuilder path, int i, int j) {
        if (i == maze.length - 1 && j == maze.length - 1) {
            System.out.println(path);
            return;
        }
        if (isvalid(maze, i + 1, j)) {
            if (maze[i + 1][j] != 0) {
                maze[i][j] = 0;
                path.append("D");
                Solve(maze, path, i + 1, j);
                maze[i][j] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }

        if (isvalid(maze, i, j + 1)) {
            if (maze[i][j + 1] != 0) {
                maze[i][j] = 0;
                path.append("R");
                Solve(maze, path, i, j + 1);
                maze[i][j] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }

        if (isvalid(maze, i - 1, j)) {
            if (maze[i - 1][j] != 0) {
                maze[i][j] = 0;
                path.append("U");
                Solve(maze, path, i - 1, j);
                maze[i][j] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }

        if (isvalid(maze, i, j - 1)) {
            if (maze[i][j - 1] != 0) {
                maze[i][j] = 0;
                path.append("L");
                Solve(maze, path, i, j - 1);
                maze[i][j] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }
        return;

    }


    public static int findways(int maze[][], StringBuilder path, int i, int j) {
        if (i == maze.length - 1 && j == maze.length - 1) {
            System.out.println(path);
            return 1;
        }
        int count=0;
        if (isvalid(maze, i + 1, j)) {
            if (maze[i + 1][j] != 0) {
                maze[i][j] = 0;
                path.append("D");
                count+=findways(maze, path, i + 1, j);
                maze[i][j] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }

        if (isvalid(maze, i, j + 1)) {
            if (maze[i][j + 1] != 0) {
                maze[i][j] = 0;
                path.append("R");
                count+=findways(maze, path, i, j + 1);
                maze[i][j] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }

        if (isvalid(maze, i - 1, j)) {
            if (maze[i - 1][j] != 0) {
                maze[i][j] = 0;
                path.append("U");
                count+=findways(maze, path, i - 1, j);
                maze[i][j] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }

        if (isvalid(maze, i, j - 1)) {
            if (maze[i][j - 1] != 0) {
                maze[i][j] = 0;
                path.append("L");
                count+=findways(maze, path, i, j - 1);
                maze[i][j] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 1, 0, 1 },
                { 0, 1, 1, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 }
        };

        Solve(maze, new StringBuilder(""), 0, 0);
        System.out.println(findways(maze, new StringBuilder(""), 0, 0));

    }
}
