package StringAssignment;
import java.util.*;
public class Hard_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("1.Sender 2.Receiver. Enter your choice");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        String result = "";

        switch (choice) {
            case 1:
                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    if (Character.isLetter(ch)) {
                        char base = Character.isUpperCase(ch) ? 'A' : 'a';
                        result += (char) ((ch - base + key) % 26 + base);
                    } else {
                        result += ch;
                    }
                }
                System.out.println("The encrypted text ▷: " + result);
                break;
            case 2:
                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    if (Character.isLetter(ch)) {
                        char base = Character.isUpperCase(ch) ? 'A' : 'a';
                        result += (char) ((ch - base - key + 26) % 26 + base);
                    } else {
                        result += ch;
                    }
                }
                System.out.println("The decrypted text is: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

	}

}
