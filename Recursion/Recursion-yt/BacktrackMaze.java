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

    public static void Printpath(int r,int c,String s,boolean[][] maze,int path[][],int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int i=0;i<maze.length;i++){
                for(int j=0;j<maze[0].length;j++){
                    System.out.print(path[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // mark it as visited
        if(!maze[r][c]) return;
        path[r][c]=step;
        maze[r][c]=false;
        if(r!=maze.length-1) Printpath(r+1, c, s+"D", maze,path,step+1);
        if(c!=maze[0].length-1) Printpath(r, c+1, s+"R", maze,path,step+1);
        if(r>0) Printpath(r-1, c, s+"U", maze,path,step+1);
        if(c>0) Printpath(r, c-1, s+"L", maze,path,step+1);

        // revert the changes you made
        maze[r][c]=true;
        path[r][c]=0;
    }

    public static void main(String[] args) {
        boolean maze[][]={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int arr[][]=new int[3][3];
        Printpath(0, 0, "", maze, arr, 1);
    }
}
