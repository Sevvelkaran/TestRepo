package StringAssignment;

import java.util.*;

public class Easy_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int length = S.length();

        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
