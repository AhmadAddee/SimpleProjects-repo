public class Account3 {

    private double balance;
    private final String name;

    // constructors
    public Account3(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public Account3(String name) {
        this(name, 0.0);
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
        if (amount < 0) {
            // unexpected - terminate exception
            throw new IllegalArgumentException();
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount < 0 || amount > balance)
            throw new IllegalArgumentException();
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
        Account3 acc = new Account3("Ahmad", 1000.0);

        System.out.println(acc.toString());

        acc.deposit(5000.0);
        acc.withdraw(2000.0);

        System.out.println(acc.toString());

        acc.withdraw(8000.0); //exekveringen avbryts

        System.out.println(acc.toString());
    }
}
