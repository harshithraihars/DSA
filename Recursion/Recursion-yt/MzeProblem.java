public class MzeProblem {
    public static int FindSol(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int down=FindSol(r-1, c);
        int right=FindSol(r, c-1);
        return down+right;
    }

    public static void FindSol2(int r,int c,String s){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r!=1) FindSol2(r-1, c,s+"D");
        if(c!=1) FindSol2(r, c-1,s+"R");
    }

    public static void Diag(int r,int c,String s){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r!=1) Diag(r-1, c,s+"D");
        if(c!=1) Diag(r, c-1,s+"R");
        if(r!=1 && c!=1) Diag(r-1,c-1,s+"X");
    }

    public static void BoardWithObstacles(int r,int c,String s,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(s);
            return;
        }
        if(!maze[r][c]) return;
        if(r!=maze.length-1) BoardWithObstacles(r+1, c,s+"D",maze);
        if(c!=maze[0].length-1) BoardWithObstacles(r, c+1,s+"R",maze);
        if(r!=maze.length-1 && c!=maze[0].length-1) BoardWithObstacles(r+1,c+1,s+"X",maze);
    }

    public static void main(String[] args) {
        boolean maze[][]={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        BoardWithObstacles(0, 0,"", maze);
    }
}
