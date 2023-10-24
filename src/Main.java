import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner output = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = output.nextInt();

        System.out.println("Enter second number: ");
        int num2 = output.nextInt();

        System.out.println("Enter operator: ");
        String operator = string.nextLine();

        switch (operator) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> System.out.print(num1 / num2);
            default -> System.out.print("Invalid operator");
        }

    }
}