public class Main {

    public static void main(String[] args) {
        Account2 acc = new Account2("Ahmad");
        acc.withdraw(2000.0);

        System.out.println(acc.toString());
    }
}
