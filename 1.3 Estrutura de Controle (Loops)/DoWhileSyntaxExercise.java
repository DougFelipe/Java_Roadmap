
/*
Sintaxe do `do-while`

Semelhante ao `while`, mas garante que o bloco de código será executado pelo menos uma vez, pois a condição é avaliada após a execução do bloco.

Neste exemplo, usamos o `do-while` para imprimir números de 1 a 5.
*/
public class DoWhileSyntaxExercise {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
