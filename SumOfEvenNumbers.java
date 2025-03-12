public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the value of n
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();
        
        int sum = 0;

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the number is even using i % 2
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Display the result
        System.out.println("The sum of all even numbers up to " + n + " is: " + sum);
        
        // Close the Scanner
        input.close();
    }
}



