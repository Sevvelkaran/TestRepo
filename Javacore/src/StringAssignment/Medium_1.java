package StringAssignment;

import java.util.Scanner;

public class Medium_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message:");
        String input = sc.nextLine();
        
        
        String[] words = input.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (i == 2) {
                System.out.println("... Pls wait ");
            }
            System.out.print(words[i] + " ");
        }
    }
}

