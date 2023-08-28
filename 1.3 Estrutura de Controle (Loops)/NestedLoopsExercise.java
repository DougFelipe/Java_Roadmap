
/*
Loops aninhados

Uso de loops dentro de outros loops, comumente usado em matrizes e listas aninhadas.

Neste exemplo, usamos loops aninhados para imprimir uma matriz 3x3.
*/
public class NestedLoopsExercise {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }
    }
}
