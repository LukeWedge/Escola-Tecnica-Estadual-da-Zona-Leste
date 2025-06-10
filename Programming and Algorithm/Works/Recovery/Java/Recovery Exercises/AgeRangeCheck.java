public class AgeRangeCheck { // Start of the class
    public static void main(String[] args) { // Main method: program starts here

        int age = 30; // Create an integer variable and assign the value 30 (example age)

        // Check if age is greater than or equal to 18 AND less than or equal to 65
        if (age >= 18 && age <= 65) {
            System.out.println("Age " + age + " is between 18 and 65."); // If true, print message
        } else {
            System.out.println("Age " + age + " is NOT between 18 and 65."); // If false, print this
        }
    }
}
