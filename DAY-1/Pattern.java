// public class Pattern {
//     public static void main(String[] args) {
//         for(int i=0;i<4;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {
//     public static void main(String[] args) {
//         for(int i=4;i>=0;i--){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

public class Pattern {
    public static void main(String[] args) {
        char current = "A".charAt(0);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(current);
                current=(char) (current+1);
            }
            System.out.println();
        }
    }
}