public class Account2 {

    // private fields
    private double balance;
    private final String name;

    // constructor, called when an object/instance is created
    // should have the same name as the class!!! not void!
    public Account2(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    // access methods, getters
    public double getBalance(){
        return balance; // returns a copy of the value
    }
    public String getName(){
        return name;
    }

    // mutator methods, setters
    public void deposit(double amount){
        if (amount >= 0)
            balance += amount;
    }
    public void withdraw(double amount){
        if (amount >= 0 && amount <= balance)
            balance -= amount;
    }

    // other methods
    @Override
    public String toString(){
        String info = "name: " + name + ", balance: ";
        info += String.format("%.2f", balance);
        return info;
    }

    /***********************************/
    /***********************************/
    /***********************************/
    /***********************************/



    public static void main(String[] args) {
        Account2 acc = new Account2("Ahmad");

        System.out.println(acc.toString());

        acc.deposit(5000.0);
        acc.withdraw(2000.0);

        System.out.println(acc.toString());

        //acc.balance = -1_000_000.0; //you can't break the contract!

        System.out.println(acc.toString());
    }
}
