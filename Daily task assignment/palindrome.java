import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        int i = 0;
        String s = "";
        while(str.length() > i)
        {
            char ch = str.charAt(i);
            s = ch + s;
            i++;
        }
        if(s.equals(str))
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a Palindrome");

    }
}
