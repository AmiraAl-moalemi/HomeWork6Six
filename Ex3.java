import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input word:");
        String word;
        word=in.next();
        for (int i=0;i<word.length();i++)
        {
            System.out.println(word.charAt(i));
        }
    }
}
