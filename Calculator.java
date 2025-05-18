import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("Available operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        
        while (true) {
            System.out.print("\nSelect an operation (1-5): ");
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting calculator...");
                break;
            }
            
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select 1-5.");
                continue;
            }
            
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            String operation = "";
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operation = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "*";
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                        continue;
                    }
                    result = num1 / num2;
                    operation = "/";
                    break;
            }
            
            System.out.printf("\nResult: %.2f %s %.2f = %.2f\n", num1, operation, num2, result);
        }
        
        scanner.close();
    }
}