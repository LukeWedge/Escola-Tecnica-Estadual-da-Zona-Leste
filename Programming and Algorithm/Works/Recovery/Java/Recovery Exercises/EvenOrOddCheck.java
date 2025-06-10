public class EvenOrOddCheck { // Start of the class
    public static void main(String[] args) { // Main method: program starts here

        int number = 5; // Create an integer variable and assign the value 5

        if (number % 2 == 0) { // Check if the number divided by 2 has no remainder (even)
            System.out.println(number + " is even."); // If true, print that the number is even
        } else { // If the condition is false (remainder is not 0)
            System.out.println(number + " is odd."); // Print that the number is odd
        }
    }
}
