public class Bonuses {
    public static void main(String[] args) {
        int[] values = {10, 2,};
        int[] otherValues = {5, 5, 5, 5, 5};

/*  Test della funzione per il riconoscimento di un numero PARI o
    DISPARI tramite somma dei valori di un array */
        System.out.println("Even or Odd from array test:");
        arrayEvenOrOdd(values);
        arrayEvenOrOdd(otherValues);

//  Test della funzione per il calcolo della SOMMA dei valori di un array
        System.out.println("Sum from array test:");
        advancedSum(values);
        advancedSum(otherValues);

//  Test della funzione per il calcolo del risultato della SOTTRAZIONE dei valori di un array
        System.out.println("Subtraction from array test:");
        advancedeSubtraction(values);
        advancedeSubtraction(otherValues);

//  Test della funzione per il calcolo del risultato della MOLTIPLICAZIONE dei valori di un array
        System.out.println("Multiplication from array test:");
        advancedeMultiplication(values);
        advancedeMultiplication(otherValues);

//  Test della funzione per il calcolo del risultato della MOLTIPLICAZIONE dei valori di un array
        System.out.println("Division from array test:");
        advancedeDivision(values);
        advancedeDivision(otherValues);


    }

    //  BONUS PARI E DISPARI:  funzione calcolo somma array con valutazione se il risultato è pari o dispari
    public static int arrayEvenOrOdd(int[] values) {
//    dichiarazione variabile con valore 0 per l'addizione con i valori degli array
        int sum = 0;
//    ciclo for in cui ad ogni ciclo viene commato il valore corrente dell'array con la variabile sum
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
//    costrutto if else per la gestione dell'output con disponibilità ritorno del valore dell'array
        }
        if (sum % 2 == 0) {
            System.out.println(sum + " Is Even");
            return sum;
        } else {
            System.out.println(sum + " Is Odd");
            return sum;
        }
    }

    //  BONUS ADDIZIONE: funzione addizionne dei valori in un array
    public static int advancedSum(int[] values) {
//    dichiarazione variabile con valore 0 per l'addizione con i valori degli array
        int sum = 0;
//    ciclo for in cui ad ogni ciclo viene sommato il valore corrente dell'array con la variabile sum
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);
        return sum;
    }

    //  BONUS SOTTRAZIONE: funzione sottrazione dei valori in un array
    public static int advancedeSubtraction(int[] values) {
//    dichiarazione variabile con valore posizione 0 dell'array per settare il primo valore di partenza
        int value = values[0];
//    ciclo for in cui ad ogni ciclo viene sottratto il valore corrente dell'array dalla variabile value
        for (int i = 1; i < values.length; i++) {
            value -= values[i];
        }
        System.out.println(value);
        return value;
    }

    //  BONUS MOLTIPLICAZIONE: funzione moltiplicazione dei valori in un array
    public static int advancedeMultiplication(int[] values) {
//    dichiarazione variabile con valore posizione 0 dell array per la  moltiplicazione con il valore corrente dell array
        int value = values[0];
//    ciclo for in cui ad ogni ciclo viene moltiplicato il valore di value con la posizione corrente di i
        for (int i = 1; i < values.length; i++) {
            value *= values[i];
        }
        System.out.println(value);
        return value;
    }

    //  BONUS DIVISIONE: funzione divisione dei valori in un array
    public static int advancedeDivision(int[] values) {
//    dichiarazione variabile con valore posizione 0 dell array per la  divisione con il valore corrente dell array
        int value = values[0];
//    ciclo for in cui ad ogni ciclo viene diviso il valore di value con la posizione corrente di i
        for (int i = 1; i < values.length; i++) {
            value /= values[i];
//    costrutto if else per il controllo della divisione per 0
            if(values[i] == 0){
                throw new RuntimeException("Can't divide by 0");
            }
        }
        System.out.println(value);
        return value;
    }

}