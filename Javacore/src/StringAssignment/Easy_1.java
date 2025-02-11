package StringAssignment;

public class Easy_1 {
    public static void main(String[] args) {
        String text = "INDIA";
        int shift = 2;
        StringBuilder encrypted = new StringBuilder();
        
        for (char ch : text.toCharArray()) {
            encrypted.append((char) (ch + shift));
        }
        
        System.out.println("Encrypted: " + encrypted.toString());
        
                StringBuilder decrypted = new StringBuilder();
        for (char ch : encrypted.toString().toCharArray()) {
            decrypted.append((char) (ch - shift));
        }
        
        System.out.println("Decrypted: " + decrypted.toString());
    }
}
