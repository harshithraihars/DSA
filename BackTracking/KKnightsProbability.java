public class KKnightsProbability {
    public static boolean isvalid(int row,int column,int n){
        if(row>=0 &&row<n && column>=0 && column<n){
            return true;
        }
        return false;
    }

    public static double Solve(int n, int k, int row, int column){

    }
    public double knightProbability(int n, int k, int row, int column) {

        boolean board[][]=new boolean[n][n];
        board[row][column]=true;
        double way1=0,way2=0,way3=0,way4=0,way5=0,way6=0,way7=0,way8=0;
        if(isvalid(row-1, column-2,n)){
            way1*=Solve(n,k-1,row-1,column-2);
        }
        if(isvalid(row-1, column+2,n)){
            way2*=Solve(n,k-1,row-1,column+2);
        }
        if(isvalid(row-2, column-1,n)){
            way3*=Solve(n,k-1,row-2,column-1);
        }
        if(isvalid(row-2, column+1,n)){
            way4*=Solve(n,k-1,row-2,column+1);
        }
        if(isvalid(row+1, column-2,n)){
            way5*=Solve(n,k-1,row+1,column-2);
        }
        if(isvalid(row+1, column+2,n)){
            way6*=Solve(n,k-1,row+1,column+2);
        }
        if(isvalid(row+2, column-1,n)){
            way7*=Solve(n,k-1,row+2,column-1);
        }
        if(isvalid(row+2, column+1,n)){
            way8*=Solve(n,k-1,row+2,column+1);
        }

        return way1+way2+way3+way4+way5+way6+way7+way8;
    }
}
