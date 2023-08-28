
/*
Uso de rótulos (labels) com loops

Permite nomear um loop e usar esse nome em conjunto com `break` ou `continue` para controlar loops aninhados.

Neste exemplo, usamos um rótulo para sair de um loop aninhado quando uma condição específica é atendida.
*/
public class LabelsWithLoopsExercise {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
                System.out.println(i + "," + j);
            }
        }
    }
}
