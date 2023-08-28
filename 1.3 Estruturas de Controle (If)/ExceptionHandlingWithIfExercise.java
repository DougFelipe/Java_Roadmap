
/*
Tratamento de exceções com `if`

Usar `if` para verificar condições que poderiam causar exceções e lidar com elas antes que ocorram.

Neste exemplo, verificamos se um número é zero antes de tentar dividir por ele.
*/
public class ExceptionHandlingWithIfExercise {
    public static void main(String[] args) {
        int number = 10;
        int divisor = 0;

        if (divisor != 0) {
            System.out.println("Result: " + (number / divisor));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
