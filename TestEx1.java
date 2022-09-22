public class TestEx1 {
    public static void main(String[] args) {
        Ex1 year=new Ex1(500000,20);
        year.waitForBalance(1000000);
        System.out.println(" number of years it takes for this to one million: "+year.getYear());
    }
}
