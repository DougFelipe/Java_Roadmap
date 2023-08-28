
/*
Casting e Conversão de Tipos

O casting é o processo de converter um tipo em outro. Em Java, podemos fazer casting entre tipos primitivos 
e também entre tipos de referência.

Neste exemplo, realizamos casting entre diferentes tipos primitivos.
*/
public class TypeCastingExercise {
    public static void main(String[] args) {
        double doubleValue = 10.5;
        int intValue = (int) doubleValue;
        
        System.out.println("Double value: " + doubleValue);
        System.out.println("Int value after casting: " + intValue);
    }
}
