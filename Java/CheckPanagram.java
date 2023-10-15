import java.util.Scanner;

public class CheckPanagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        String input = scanner.nextLine().toLowerCase(); 

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to track the presence of each letter
        boolean[] alphabet = new boolean[26];
        int totalLetters = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    totalLetters++;
                }
            }
        }

        return totalLetters == 26; // A pangram should have all 26 letters.
    }
}
