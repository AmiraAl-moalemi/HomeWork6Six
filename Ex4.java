import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input word:");
        String word;
        word=in.next();
        for (int i=word.length()-1;i>=0;i--)
        {
            System.out.print(word.charAt(i));
        }
    }
}
