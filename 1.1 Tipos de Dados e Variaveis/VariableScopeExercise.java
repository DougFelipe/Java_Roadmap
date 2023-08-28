
/*
Escopo de Variáveis

O escopo de uma variável refere-se à parte do código onde uma variável pode ser acessada. 
Em Java, as variáveis podem ter escopo local, de classe (estático) ou de instância.

Neste exemplo, demonstramos o uso de variáveis com diferentes escopos.
*/
public class VariableScopeExercise {
    static int classVariable = 10; // Variável de classe (estática)
    int instanceVariable = 20;    // Variável de instância

    public static void main(String[] args) {
        int localVariable = 30;  // Variável local
        System.out.println("Class Variable: " + classVariable);
        System.out.println("Local Variable in main method: " + localVariable);

        VariableScopeExercise obj = new VariableScopeExercise();
        System.out.println("Instance Variable: " + obj.instanceVariable);
    }
}
