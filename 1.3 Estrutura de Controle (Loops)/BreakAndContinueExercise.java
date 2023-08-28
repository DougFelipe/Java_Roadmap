
/*
Uso do `break` e `continue`

O comando `break` interrompe o loop imediatamente, enquanto o `continue` pula para a próxima iteração do loop.

Neste exemplo, usamos `break` para sair do loop quando i é 3 e `continue` para pular a iteração quando i é 2.
*/
public class BreakAndContinueExercise {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
