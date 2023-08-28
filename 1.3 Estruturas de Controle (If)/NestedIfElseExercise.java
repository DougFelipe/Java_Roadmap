
/*
`if-else` aninhados

Uso de estruturas `if-else` dentro de outras estruturas `if-else`.

Neste exemplo, avaliamos condições aninhadas e exibimos mensagens com base nos resultados.
*/
public class NestedIfElseExercise {
    public static void main(String[] args) {
        int number = 15;
        boolean isEven = number % 2 == 0;

        if (isEven) {
            if (number > 10) {
                System.out.println("The number is even and greater than 10.");
            } else {
                System.out.println("The number is even and 10 or less.");
            }
        } else {
            if (number > 10) {
                System.out.println("The number is odd and greater than 10.");
            } else {
                System.out.println("The number is odd and 10 or less.");
            }
        }
    }
}
