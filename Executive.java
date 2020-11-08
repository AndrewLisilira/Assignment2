package Andy;

public class Executive extends Account{ 

    public Executive() {      
        super();
    }

    public Executive(int accountNumber, String accountName, String regNumber, String branch, double balance) {  
        super(balance, accountNumber,accountName,branch);
    }


    public void setBalance(double balance) {
        
       this.balance = balance;
    }

    @Override
    public void deposit(double amount){
    balance +=amount;
   }
    @Override
    public void withdraw(double amount) {
       balance -= amount;
    }

    @Override
    public double getBalance(){
	return balance;
}
    @Override
    public int getAccountNumber(){
	return accountNumber;
}
    

    @Override
    public String getAccountName(){
        return accountName;
}

    @Override
   public String getBranch(){
       return branch;
} 

 
}