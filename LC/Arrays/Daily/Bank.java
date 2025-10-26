package Daily;

public class Bank {
    public long[] balance;
    public Bank(long[] balance) {
        this.balance=balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1<1 || account1>balance.length || account2<1 || account2>balance.length) return false;
        if(balance[account1-1]<money) return false;
        balance[account1-1]=balance[account1-1]-money;
        balance[account2-1]=balance[account2-1]+money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account<1 || account>balance.length || money<0) return false;
        balance[account-1]=balance[account-1]+money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account<1 || account>balance.length) return false;
        if(balance[account-1]<money) return false;
        balance[account-1]=balance[account-1]-money;
        return true;
    }
    public static void main(String[] args) {
        
    }
}
