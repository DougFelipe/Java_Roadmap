
/*
Comparação de Tipos Primitivos vs. Tipos de Referência

Em Java, tipos primitivos são comparados usando operadores de igualdade como '=='. No entanto, 
para comparar objetos (tipos de referência), o método 'equals()' é geralmente utilizado.

Neste exemplo, demonstramos a comparação de tipos primitivos e objetos.
*/
public class ComparisonExercise {
    public static void main(String[] args) {
        // Comparando tipos primitivos
        int num1 = 100;
        int num2 = 100;
        System.out.println("Is num1 == num2? " + (num1 == num2));

        // Comparando objetos
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("Is str1 equals str2? " + str1.equals(str2));
    }
}
