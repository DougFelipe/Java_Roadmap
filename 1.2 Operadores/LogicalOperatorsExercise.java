
/*
Operadores Lógicos

Permitem combinar expressões booleanas. Os mais comuns são AND (`&&`), OR (`||`) e NOT (`!`).

Neste exemplo, combinamos expressões booleanas usando operadores lógicos.
*/
public class LogicalOperatorsExercise {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
    }
}
