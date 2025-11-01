package Daily;

public class LaserBeams {
    public int numberOfBeams(String[] bank) {
        int arr[]=new int[bank.length];
        int k=0;
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1') count++;
            }
            if(count>0) arr[k++]=count;
        }

        int lasers=0;
        for(int i=1;i<k;i++){
            lasers+=arr[i]*arr[i-1];
        }

        return lasers;
    }
}
