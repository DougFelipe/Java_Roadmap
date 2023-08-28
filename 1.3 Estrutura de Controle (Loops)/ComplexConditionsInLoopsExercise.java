
/*
Condições complexas dentro de loops

Avaliar múltiplas condições dentro de loops e tomar decisões com base em várias variáveis.

Neste exemplo, filtramos números com base em múltiplas condições.
*/
public class ComplexConditionsInLoopsExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int num : numbers) {
            if (num > 5 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
