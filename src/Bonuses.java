public class Bonuses {
    public static void main(String[] args) {
        int[] values = {10, 2,};
        int[] otherValues = {5, 5, 5, 5, 5};

        //  Test della funzione per il riconoscimento di un numero PARI o DISPARI tramite somma dei valori di un array
        System.out.println("Even or Odd from array test:");
        arrayEvenOrOdd(values);
        arrayEvenOrOdd(otherValues);

        //  Test della funzione per il calcolo della SOMMA dei valori di un array
        System.out.println("Sum from array test:");
        advancedSum(values);
        advancedSum(otherValues);

        //  Test della funzione per il calcolo del risultato della SOTTRAZIONE dei valori di un array
        System.out.println("Subtraction from array test:");
        advancedSubtraction(values);
        advancedSubtraction(otherValues);

        //  Test della funzione per il calcolo del risultato della MOLTIPLICAZIONE dei valori di un array
        System.out.println("Multiplication from array test:");
        advancedMultiplication(values);
        advancedMultiplication(otherValues);

        //  Test della funzione per il calcolo del risultato della MOLTIPLICAZIONE dei valori di un array
        System.out.println("Division from array test:");
        advancedDivision(values);
        advancedDivision(otherValues);


    }

    //  BONUS PARI E DISPARI:  funzione calcolo somma array con valutazione se il risultato è pari o dispari
    public static void arrayEvenOrOdd(int[] values) {

        int sum = 0;                                    //    dichiarazione variabile con valore 0 per l'addizione con i valori degli array

        for (int value : values) {                      //    ciclo for in cui ad ogni ciclo viene commato il valore corrente dell'array con la variabile sum
            sum += value;
        }
        if (sum % 2 == 0) {                             //    costrutto if else per la gestione dell'output con disponibilità ritorno del valore dell'array
            System.out.println(sum + " Is Even");
        } else {
            System.out.println(sum + " Is Odd");
        }
    }

    //  BONUS ADDIZIONE: funzione addizionne dei valori in un array
    public static void advancedSum(int[] values) {

        int sum = 0;                                    //    dichiarazione variabile con valore 0 per l'addizione con i valori degli array

        for (int value : values) {                      //    ciclo for in cui ad ogni ciclo viene sommato il valore corrente dell'array con la variabile sum
            sum += value;
        }
        System.out.println(sum);
    }

    //  BONUS SOTTRAZIONE: funzione sottrazione dei valori in un array
    public static void advancedSubtraction(int[] values) {

        int value = values[0];                          //    dichiarazione variabile con valore posizione 0 dell'array per settare il primo valore di partenza

        for (int i = 1; i < values.length; i++) {       //    ciclo for in cui ad ogni ciclo viene sottratto il valore corrente dell'array dalla variabile value
            value -= values[i];
        }
        System.out.println(value);
    }

    //  BONUS MOLTIPLICAZIONE: funzione moltiplicazione dei valori in un array
    public static void advancedMultiplication(int[] values) {

        int value = values[0];                          //    dichiarazione variabile con valore posizione 0 dell array per la  moltiplicazione con il valore dell array

        for (int i = 1; i < values.length; i++) {       //    ciclo for in cui ad ogni ciclo viene moltiplicato il valore di value con la posizione corrente di i
            value *= values[i];
        }
        System.out.println(value);
    }

    //  BONUS DIVISIONE: funzione divisione dei valori in un array
    public static void advancedDivision(int[] values) {

        int value = values[0];                           //    dichiarazione variabile con valore posizione 0 dell array per la  divisione con il valore corrente dell array

        for (int i = 1; i < values.length; i++) {        //    ciclo for in cui ad ogni ciclo viene diviso il valore di value con la posizione corrente di i
            value /= values[i];
            if(values[i] == 0) {                         //    costrutto if per il controllo della divisione per 0
                throw new RuntimeException("Can't divide by 0");
            }
        }
        System.out.println(value);
    }

}