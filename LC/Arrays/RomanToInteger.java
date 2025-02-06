import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    // public static int RomtoInt(String s){
    // HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
    // hm.put('I',1);
    // hm.put('V',5);
    // hm.put('X',10);
    // hm.put('L',50);
    // hm.put('C',100);
    // hm.put('D',500);
    // hm.put('M',1000);
    // int value=0;
    // int i=0;
    // for(i=0;i<s.length()-1;i++){
    // if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
    // value-=hm.get(s.charAt(i));
    // }
    // else{
    // value+=hm.get(s.charAt(i));
    // }
    // }
    // value+=hm.get(s.charAt(i));
    // System.out.println(value);
    // return value;
    // }

    public static int RomtoInt(String s) {

        int value = 0;
        int i = 0;
        for (i = 0; i < s.length() - 1; i++) {
            if(getValue(s.charAt(i))<getValue(s.charAt(i+1))){
                value-=getValue(s.charAt(i));
                continue;
            }
            value+=getValue(s.charAt(i));
        }
        value+=getValue(s.charAt(i));
        System.out.println(value);
        return value;
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String str = "LXIX";
        RomtoInt(str);
    }
}
