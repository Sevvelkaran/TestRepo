package StringAssignment;

import java.util.*;

public class Medium_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fn = sc.nextLine().trim();
        System.out.println("Enter your last name");
        String ln = sc.nextLine().trim();
       

        String firstPart;
        if (fn.length() >= 3) {
            firstPart = fn.substring(0, 3);
        } else {
            firstPart = fn;
        }

        String lastPart;
        if (ln.length() >= 3) {
            lastPart = ln.substring(ln.length() - 3);
        } else {
            lastPart = ln;
        }

        int totalLength = fn.length() + ln.length();
        System.out.println(firstPart + lastPart + totalLength);
    }
}
