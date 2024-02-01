public class EvenOrOdd {
    public static void main(String[] args) {
//      Test della funzione per il riconoscimento di un numero pari o dispari
        int value = 5;
        int seconValue = 6;

        evenOrOdd(value);
        evenOrOdd(seconValue);

    }

    public static int evenOrOdd(int value) {
        if (value % 2 == 0) {
            System.out.println(value + " Is even");
        } else {
            System.out.println(value + " Is odd");
        }
        return value;
    }
}