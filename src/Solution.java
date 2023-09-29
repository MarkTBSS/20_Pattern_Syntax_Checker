//import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "3\n" +
                            "([A-Z])(.+)\n" +
                            "[AZ[a-z](a-z)\n" +
                            "batcatpat(nat";
        Scanner scanner = new Scanner(mockInput);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i < n; i++) { 
            String a = scanner.nextLine();
            try {
                Pattern pattern = Pattern.compile(a);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
}
