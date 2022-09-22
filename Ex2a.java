public class Ex2a {
    public static void main(String[] args) {
        int sum=0;
        for (int n=3;n<100;n++){
            if (n%2==0){
                sum=sum+n;
            }
        }
        System.out.println("the sum all numbers between 2 and 100 :"+sum);
    }
}
