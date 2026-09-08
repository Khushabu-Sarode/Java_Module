public class Account {
    private int accno;
    private int balance;

    private static float interest_rate;

    static {
        interest_rate = 7.25f;
    }

    Account(){
        accno = balance = 0;
    }

    Account(int a,int b){
        accno = a;
        balance = b;
    }

    public double CalInterest(){
        return balance * (interest_rate / 100);
    }

    public static void update(float newrate){
        interest_rate = newrate;
    }

    public void display(){
      System.out.println("balance :: " + balance + " " + "total interest :: "+  CalInterest());
    }

}
