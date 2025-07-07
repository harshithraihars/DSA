public class A {
   

        public static int compareVersion(String version1, String version2) {
        int v1start=version1.indexOf('.')+1;
        int v2start=version2.indexOf('.')+1;
        while(v1start<version1.length() || v2start<version2.length()){
            int v1end=version1.indexOf('.',v1start);
            if(v1end==-1) v1end=version1.length();

            int v2end=version2.indexOf('.',v2start);
            if(v2end==-1) v2end=version2.length();

            String v1string= version1.substring(v1start,v1end);
            String v2string= version2.substring(v2start,v2end);

            int value1=v1string.isEmpty()?0:Integer.parseInt(v1string);
            int value2=v2string.isEmpty()?0:Integer.parseInt(v2string);
            if(value1>value2) return 1;
            if(value1<value2) return -1;
            v1start=v1end;
            v2start=v2end;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0", "1.0.0.0"));
    }
}