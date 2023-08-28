
/*
Operador Ternário

Uma forma compacta de avaliar uma expressão booleana e retornar um valor com base nessa avaliação. Sua forma é `condição ? valorSeVerdadeiro : valorSeFalso`.

Neste exemplo, usamos o operador ternário para determinar qual número é o maior entre dois.
*/
public class TernaryOperatorExercise {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int max = (a > b) ? a : b;
        System.out.println("The maximum number is: " + max);
    }
}
