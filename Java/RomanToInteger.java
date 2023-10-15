import java.util.*;

public class RomanToInteger {
    public static int romanToInteger(String romanNumeral) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char numeral = romanNumeral.charAt(i);
            int value = romanMap.get(numeral);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a Roman numeral (or type 'exit' to quit): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("EXIT")) {
                System.out.println("Goodbye!");
                break;                     // Exit the program
            }

            int integerVal = romanToInteger(input);
            System.out.println("The integer value of " + input + " is " + integerVal);
        }
    }
}
