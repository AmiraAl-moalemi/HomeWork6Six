public class Ex1 { private double balance,rate;
    private  int year;
    public Ex1(double balance,double rate)
    {
        this.balance=balance;
        this.rate=rate;
        year=0;
    }
    public void waitForBalance(double target)
    {
        while (balance<target) {
            year++;
            double interest=balance*rate/100;
            balance=balance+interest;}
    }public int getYear() {
        return year;
    }public double getBalance() {
        return balance;
    }
    public void weatForyear(int numberofyear) {
        for (int i = 0; i <= numberofyear; i++) {
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
        year = year + numberofyear;
    }
}


