public class Shortest {
    public static float getShortestPAth(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            int direction=str.charAt(i);
            switch (direction) {
                case 'N':{
                    y++;
                    break;
                }
                case 'S':{
                    y--;
                    break;
                }case 'E':{
                    x++;
                    break;
                }case 'W':{
                    x--;
                    break;
                }
            }
        }
        return (float )Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(getShortestPAth(str));
    }
}
