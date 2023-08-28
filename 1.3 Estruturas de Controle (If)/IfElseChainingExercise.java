
/*
Encadeamento de `if-else`

Avaliar múltiplas condições em sequência usando um encadeamento de estruturas `if-else`.

Neste exemplo, avaliamos várias condições em sequência e exibimos mensagens com base no resultado.
*/
public class IfElseChainingExercise {
    public static void main(String[] args) {
        int number = 5;

        if (number > 10) {
            System.out.println("The number is greater than 10.");
        } else if (number > 5) {
            System.out.println("The number is greater than 5 but less than or equal to 10.");
        } else {
            System.out.println("The number is 5 or less.");
        }
    }
}
