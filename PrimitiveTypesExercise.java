
/*
Tipos Primitivos

Em Java, há oito tipos primitivos que são a fundação para armazenar dados simples como números inteiros, 
pontos flutuantes, caracteres e valores booleanos.

Neste exemplo, declaramos variáveis para cada tipo primitivo e atribuímos valores a elas.
*/
public class PrimitiveTypesExercise {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 300;
        int intValue = 10000;
        long longValue = 1000000000L;
        float floatValue = 20.5f;
        double doubleValue = 55.5;
        char charValue = 'A';
        boolean booleanValue = true;
        
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + booleanValue);
    }
}
