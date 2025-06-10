public class EvenOrOdd { // Start of the class
    public static void main(String[] args) { // Main method: the program starts here

        int number = 10; // We create an integer variable and assign the value 10

        // We check if the number is divisible by 2 using the modulus operator (%)
        if (number % 2 == 0) { // If the remainder is 0, the number is even
            System.out.println(number + " is even."); // Print that the number is even
        } else { // If the condition is false (remainder is not 0), the number is odd
            System.out.println(number + " is odd."); // Print that the number is odd
        }
    }
}
