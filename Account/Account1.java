public class Account1 {

    /** Försök 1; några problem med denna lösning:
     * - datamedlemmarna initieras inte korrekt när objektet skapas
     * - det går att bryta mot kotraktet, balance > 0, pga datamedlemmen är
     *   tillgänglig utanför klassen.
     * */
    // fields / data members
    double balance;
    String name;

    // member functions / methods
    void deposit(double amount){
        if (amount >= 0)
            balance += amount;
    }

    void withdraw(double amount){
        if (amount >= 0 && amount <= balance)
            balance -= amount;
    }

    @Override
    public String toString(){
        return name + ", " + balance;
    }

    /***********************************/
    /**AND HERE I'M*/
    /***********************************/
    /***********************************/


    public static void main(String[] args) {
        Account1 acc = new Account1();

        //String info = acc.name + ", " + acc.balance;
        System.out.println(acc.toString());

        acc.name = "Ahmad";
        acc.deposit(5000.0);
        acc.withdraw(2000.0);

        //info = acc.name + ", " + acc.balance;
        System.out.println(acc.toString());

        acc.balance = -1_000_000.0; //breaks the contract!

        //info = acc.name + ", " + acc.balance;
        System.out.println(acc.toString());
    }

}
