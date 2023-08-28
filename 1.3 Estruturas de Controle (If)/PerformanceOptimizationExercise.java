
/*
Performance e otimização

Entender como as estruturas `if` são avaliadas em termos de performance e como otimizar condições comuns primeiro.

Neste exemplo, reorganizamos as condições no `if` para otimizar a performance.
*/
public class PerformanceOptimizationExercise {
    public static void main(String[] args) {
        int number = 5;

        // Má prática: condição menos comum primeiro
        if (number > 1000) {
            System.out.println("The number is greater than 1000.");
        } else if (number > 10) {
            System.out.println("The number is greater than 10 but less than or equal to 1000.");
        } else {
            System.out.println("The number is 10 or less.");
        }

        // Boa prática: condição mais comum primeiro
        if (number <= 10) {
            System.out.println("The number is 10 or less.");
        } else if (number <= 1000) {
            System.out.println("The number is greater than 10 but less than or equal to 1000.");
        } else {
            System.out.println("The number is greater than 1000.");
        }
    }
}
