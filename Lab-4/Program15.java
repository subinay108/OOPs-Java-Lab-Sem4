// Design a class to represent a bank account using constructor(name, id, initial balance) in methods(deposit, withdraw, display)

class BankAccount{
    private String name;
    private int id;
    private double balance;
    public BankAccount(String name, int id, double initialBalance){
        this.name = name;
        this.id = id;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount "+ amount + " deposited successfully");
            System.out.println("Current Balance: " + balance);
        }else{
            System.out.println(amount + "This amount can't be deposited");
        }
    }

    public void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
            System.out.println("Amount "+ amount + " withdrawn successfully");
            System.out.println("Current Balance: " + balance);
        }else{
            System.out.println("Insufficient balance! Please Enter a lower amount.");
        }
    }

    public void display(){
        System.out.println("Bank Account Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Current Balance: " + balance);
    }

}

public class Program15 {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount("Subinay Panda", 23, 500.0);
        customer.display();
        
        // Deposit money
        customer.deposit(400);

        // Try to withdraw money with greater amount than current balance
        customer.withdraw(2000);

        // Withdraw money
        customer.withdraw(200);
        
    }
}

