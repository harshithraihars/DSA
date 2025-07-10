package Theory;
public class DynamicCircularQue extends CircularQue{
    @Override
    public boolean Insert(int item){
        if(isFull()){
            int temp[]=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+1)%data.length];
            }
            this.front=0;
            this.end=data.length;
            data=temp;
            return true;
        }
        data[end++]=item;
        end%=data.length;
        return true;
    }
    public static void main(String[] args) {
        
    }
}
