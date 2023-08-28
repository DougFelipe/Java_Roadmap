
/*
Declaração e Uso de Variáveis `null`

O valor 'null' em Java é usado para representar a ausência de um valor ou objeto. É o valor padrão para 
tipos de referência.

Neste exemplo, declaramos uma variável de referência e atribuímos o valor 'null' a ela.
*/
public class NullVariablesExercise {
    public static void main(String[] args) {
        String name = null;

        if(name == null) {
            System.out.println("The name variable is null.");
        } else {
            System.out.println("The name variable has a value: " + name);
        }
    }
}
