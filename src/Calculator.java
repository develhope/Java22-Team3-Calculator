public class Calculator {

    public static String recognizeOperation(String operation) {

        String type = "";

        if (operation.contains("+")) {
            type = "SUM";
        } else if (operation.contains("-")){
            type = "DIFFERENCE";
        } else if (operation.contains("*")) {
            type = "MULTIPLICATION";
        } else if (operation.contains("/")) {
            type = "DIVISION";
        } else if (operation.contains("^")) {
            type = "EXPONENT";
        } else if (operation.contains("=")) {
            type = "EVEN_OR_ODD";
        } else {
            type = "UNKNOWN";
        }

        return type;
    }

    public static double executeOperation(String operation, String type) {

        double result = 0;

        String[] operator = operation.split("[\\+\\-\\*\\/\\^=]");

        double a = Double.parseDouble(operator[0]);
        double b = Double.parseDouble(operator[1]);

        switch (type) {
            case "SUM":
                result = sum(a, b);
                break;
            case "DIFFERENCE":
                result = difference(a, b);
                break;
            case "MULTIPLICATION":
                result = multiplication(a, b);
                break;
            case "DIVISION":
                result = division(a, b);
                break;
            case "EXPONENT":
                result = exponent(a, b);
                break;
            case "EVEN_OR_ODD":
                result = evenOrOdd(a);
            default:
                System.out.println("Invalid operation");
                break;
        }

        return result;
    }
    private static double multiplication(double a, double b){

        return a * b;
    }
    private static double division(double a, double b){
        if (b != 0){
            return a / b;
        }else{
            System.out.println("cannot divide by 0");
        }
        return 0;
    }
    private static double sum(double a, double b) {
        return a + b;
    }
    private static double difference(double a, double b){
        return a - b;
    }
    private static double exponent(double a, double b){
        return Math.pow(a, b);
    }
    public static double evenOrOdd(double value) {
        if (value % 2 == 0) {
            System.out.println(value + " Is even");
        } else {
            System.out.println(value + " Is odd");
        }
        return value;
    }
}