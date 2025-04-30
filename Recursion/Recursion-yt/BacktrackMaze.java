public class BacktrackMaze {
    public static void Backtrack(int r,int c,String s,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(s);
            return;
        }

        // mark it as visited
        if(!maze[r][c]) return;

        maze[r][c]=false;
        if(r!=maze.length-1) Backtrack(r+1, c, s+"D", maze);
        if(c!=maze[0].length-1) Backtrack(r, c+1, s+"R", maze);
        if(r>0) Backtrack(r-1, c, s+"U", maze);
        if(c>0) Backtrack(r, c-1, s+"L", maze);

        // revert the changes you made
        maze[r][c]=true;
    }

    public static void main(String[] args) {
        boolean maze[][]={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        Backtrack(0,0,"",maze);
    }
}
