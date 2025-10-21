package Daily;

import java.util.ArrayList;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(i==1) return s;
        ArrayList<ArrayList<Character>> ar = new ArrayList();
        int index = 0;
        int i = 0;
        int j = 0;

        for (int k = 0; k < numRows; k++)
            ar.add(new ArrayList<>());

        while (index < s.length()) {
            if (j % (numRows - 1) == 0) {
                while (index < s.length() && i != numRows) {
                    ar.get(i).add(s.charAt(index));
                    i++;
                    index++;
                }
                i -= 2;
                j += 1;
            } else {
                while (index < s.length() && i != 0) {
                    ar.get(i).add(s.charAt(index));
                    i--;
                    j++;
                    index++;
                }
            }
        }

        StringBuilder res = new StringBuilder("");
        for (i = 0; i < ar.size(); i++) {
            for (j = 0; j < ar.get(i).size(); j++) {
                res.append(ar.get(i).get(j));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING", 3);
    }
}
