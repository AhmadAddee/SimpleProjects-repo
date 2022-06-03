public class Account4 {

    // instance members
    private double balance;
    private final String name;

    private static double interest = 0.25; //static member, i.e. class data

    // static methods, can only reference static members
    public static double getInterest(){
        return interest;
    }
    public static void setInterest(double newInterest){
        interest = newInterest;
    }

    // constructors
    public Account4(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public Account4(String name) {
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
        Account4 ahmad = new Account4("Ahmad", 500.0);
        Account4 ibrahim = new Account4("Ibrahim", 1000.0);

        System.out.printf("Current interest: %.2f", Account4.getInterest());
        System.out.printf("\n");
        Account4.setInterest(0.50);
        System.out.printf("Current interest: %.2f", Account4.getInterest());
        System.out.printf("\n");

        System.out.printf("Current interest: %.2f", ahmad.getInterest());
        System.out.printf("\n");
        System.out.printf("Current interest: %.2f", ibrahim.getInterest());
    }
}
