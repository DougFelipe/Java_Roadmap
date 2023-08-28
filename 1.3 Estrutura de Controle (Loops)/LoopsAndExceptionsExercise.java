
/*
Loops e exceções

Tratamento de exceções dentro de loops e como interromper um loop em caso de erro.

Neste exemplo, tratamos uma exceção potencial dentro de um loop.
*/
public class LoopsAndExceptionsExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 0};
        
        for (int num : numbers) {
            try {
                System.out.println(10 / num);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        }
    }
}
