import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, this is a calculator!");
        System.out.println("Enter an operation (Ex. 1+2=) and press enter!");
        String operation = input.nextLine();
        String type = Calculator.recognizeOperation(operation);
        double result = Calculator.executeOperation(operation, type);
        System.out.println("The result of the operation " + operation + " is " + result);
        String.valueOf(Calculator.evenOrOdd(result));
      
    }
}