package StringAssignment;

import java.util.Scanner;

public class Hard_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "|©️#$%^&*()-+";

        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (numbers.indexOf(ch) >= 0) {
                hasDigit = true;
            } else if (lowerCase.indexOf(ch) >= 0) {
                hasLower = true;
            } else if (upperCase.indexOf(ch) >= 0) {
                hasUpper = true;
            } else if (specialCharacters.indexOf(ch) >= 0) {
                hasSpecial = true;
            }
        }

        int missingConditions = 0;
        if (!hasDigit) missingConditions++;
        if (!hasLower) missingConditions++;
        if (!hasUpper) missingConditions++;
        if (!hasSpecial) missingConditions++;

        int length = Math.max(0, 6 - password.length());

        if (password.length() >= 6 && hasDigit && hasLower && hasUpper && hasSpecial) {
            System.out.println("Password strength: Strong");
        } else if (password.length() >= 6 && hasDigit && hasLower && hasUpper) {
            System.out.println("Password strength: Moderate");
        } else {
            System.out.println("Password strength: Weak");
        }

    }
}

