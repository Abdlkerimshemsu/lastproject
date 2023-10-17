import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the current day
        System.out.print("Enter today's date (1-31): ");
        int currentDay = scanner.nextInt();

        checkOccasions(currentDay);

        // Perform arithmetic operations
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int number2 = scanner.nextInt();

        performArithmeticOperations(number1, number2);

        scanner.close();
    }

    public static void checkOccasions(int currentDay) {
        // Define occasions and corresponding days
        String[] occasions = { "Birthday", "Meeting", "familyday" };
        int[] occasionDays = { 10, 20, 30 }; // Assuming these are the days of the month

        // Check if there are any occasions today
        boolean hasOccasion = false;
        for (int i = 0; i < occasions.length; i++) {
            if (currentDay == occasionDays[i]) {
                hasOccasion = true;
                switch (i) {
                    case 0:
                        System.out.println("Reminder: It's your Birthday!");
                        break;
                    case 1:
                        System.out.println("Reminder: You have a Meeting today.");
                        break;
                    case 2:
                        System.out.println("Reminder: familyday!");
                        break;
                }
            }
        }

        if (!hasOccasion) {
            System.out.println("No occasions today.");
        }
    }

    public static void performArithmeticOperations(int number1, int number2) {
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Use relational operators
        System.out.println("Number1 > Number2: " + (number1 > number2));
        System.out.println("Number1 < Number2: " + (number1 < number2));
        System.out.println("Number1 >= Number2: " + (number1 >= number2));
        System.out.println("Number1 <= Number2: " + (number1 <= number2));
        System.out.println("Number1 == Number2: " + (number1 == number2));
        System.out.println("Number1 != Number2: " + (number1 != number2));
    }
}

