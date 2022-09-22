import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input word:");
        String word;
        word=in.next();
        // String  text="harry";
        int count =0;
        for (int i=0;i<word.length();i++) {
            if (word.charAt(i) == 'u'||word.charAt(i) == 'a'||word.charAt(i) == 'e'
                    ||word.charAt(i) == 'i'||word.charAt(i) == 'y'||word.charAt(i) == 'o') {
               count++ ;}}
            System.out.println("vowels= "+count);
        }}