
/*
Variáveis de Instância vs. Variáveis de Classe (Estáticas)

Em Java, variáveis de instância são associadas a uma instância específica de uma classe, enquanto 
variáveis de classe (estáticas) são associadas à classe em si e são comuns a todas as instâncias.

Neste exemplo, demonstramos o uso de variáveis de instância e de classe.
*/
public class InstanceVsClassVariablesExercise {
    static int classVariable = 100;  // Variável de classe (estática)
    int instanceVariable = 200;     // Variável de instância

    public static void main(String[] args) {
        System.out.println("Class Variable: " + classVariable);

        InstanceVsClassVariablesExercise obj = new InstanceVsClassVariablesExercise();
        System.out.println("Instance Variable: " + obj.instanceVariable);
    }
}
