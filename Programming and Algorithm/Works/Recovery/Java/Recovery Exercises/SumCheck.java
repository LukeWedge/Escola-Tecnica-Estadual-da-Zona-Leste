public class SumCheck { // Start of the class
    public static void main(String[] args) { // Main method: program starts here

        int num1 = 30; // First integer number
        int num2 = 25; // Second integer number
        int sum = num1 + num2; // Add the two numbers and store the result

        // Check if the sum is greater than 50
        if (sum > 50) {
            System.out.println("The sum is " + sum + " and it is greater than 50."); // If true, print this
        } else {
            System.out.println("The sum is " + sum + " and it is NOT greater than 50."); // If false, print this
        }
    }
}
