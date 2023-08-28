
/*
Operadores de Type Cast

Permitem converter explicitamente de um tipo de dados para outro, como `(int)`, `(double)`, etc.

Neste exemplo, convertemos um double em um int usando type casting.
*/
public class TypeCastOperatorsExercise {
    public static void main(String[] args) {
        double num = 10.5;
        int roundedNum = (int) num;

        System.out.println("Original number: " + num);
        System.out.println("After type casting: " + roundedNum);
    }
}
