import java.util.Scanner;

public class palindromeTester {

public static void main(String[]args) {
        Scanner scan= new Scanner(System.in);

        String a; //first string variable
        String b; //second string variable
        String c; //third string variable
        String d; //fourth string variable

        System.out.println("Enter the first string in all capitals \n"); //user enters the first string
        a = scan.nextLine();
        palindrome word1 = new palindrome(a);
        System.out.println(word1.checkType());
        System.out.println("Enter the second string in all capitals \n"); //user enters the second string
        b = scan.nextLine();
        palindrome word2 = new palindrome(b);
        System.out.println(word2.checkType());
        System.out.println("Enter the third string in all capitals \n"); //user enters the third string
        c = scan.nextLine();
        palindrome word3 = new palindrome(c);
        System.out.println(word3.checkType());
        System.out.println("Enter the last string in all capitals \n"); //user enters the last or fourth string
        d = scan.nextLine();
        palindrome word4 = new palindrome(d);
        System.out.println(word4.checkType());


        }
}
