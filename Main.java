import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First Number: ");
            int number = scanner.nextInt();
            System.out.print("Second Number: ");
            int number2 = scanner.nextInt();
            System.out.print("[+,-,*,/]: ");
            String opt = scanner.next();
            switch (opt) {
                case "+":
                    System.out.println("Result: " + (number + number2));
                    break;
                case "-":
                    System.out.println("Result: " + (number - number2));
                    break;
                case "*":
                    System.out.println("Result: " + (number * number2));
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("Cannot divide by 0");
                    } //else {
                        //System.out.println("Result: " + (number / number2));
                    //}
                    break;

                default:
                    System.out.println("[ERROR]: Wrong OPT");
                    break;
            }

            System.out.print("Do you want to try again? (y/N): ");
            String tryAgain = scanner.next();
            if (!tryAgain.equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();
    }
}