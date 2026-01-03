class Account{
    private int balance;

    public void setBalance(int balance){
        this.balance=balance;
    }

    public int getBalance(){
        return balance;
    }
}

public class t5 {
    public static void main(String[] args) {
        Account e1=new Account();
        
        e1.setBalance(5500);
        
        System.out.println(e1.getBalance());
    }
}
