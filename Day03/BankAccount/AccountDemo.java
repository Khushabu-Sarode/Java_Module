public class AccountDemo {
    public static void main(String[] args) {
        Account a1;
        a1 = new Account(101,10000);
        Account a2 = new Account(325,120000);
        System.err.println("interest :" + a1.CalInterest());
        Account.update(7.87f);
        System.out.println("interest :" + a1.CalInterest());
 
        a1.display();
        a2.display();

    }
}
