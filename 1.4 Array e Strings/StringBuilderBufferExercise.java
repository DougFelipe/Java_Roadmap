
/*
StringBuilder e StringBuffer

Conceito e uso das classes StringBuilder e StringBuffer para manipulação eficiente de Strings.

Neste exemplo, demonstramos o uso de StringBuilder para construir uma string de forma eficiente.
*/
public class StringBuilderBufferExercise {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        
        System.out.println("StringBuilder result: " + sb.toString());
    }
}
