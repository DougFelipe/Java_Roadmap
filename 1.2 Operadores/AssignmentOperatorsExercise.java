
/*
Operadores de Atribuição

Permitem atribuir valores às variáveis. O mais comum é `=`, mas também existem os operadores compostos como `+=`, `-=`, `*=`, etc.

Neste exemplo, atribuímos e modificamos valores de variáveis usando operadores de atribuição.
*/
public class AssignmentOperatorsExercise {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Initial value: " + num);

        num += 5;
        System.out.println("After += 5: " + num);

        num -= 3;
        System.out.println("After -= 3: " + num);

        num *= 2;
        System.out.println("After *= 2: " + num);
    }
}
