
/*
Operador `instanceof`

Usado para verificar se um objeto é uma instância de uma classe específica ou implementa uma interface específica.

Neste exemplo, verificamos se uma variável é uma instância de uma determinada classe.
*/
public class InstanceofOperatorExercise {
    public static void main(String[] args) {
        String text = "Hello";

        boolean isString = text instanceof String;
        System.out.println("Is text a String? " + isString);
    }
}
