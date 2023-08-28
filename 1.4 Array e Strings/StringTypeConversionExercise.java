
/*
Conversão de tipos com Strings

Como converter outros tipos de dados para Strings e Strings para outros tipos de dados.

Neste exemplo, demonstramos a conversão de inteiros e floats para Strings e vice-versa.
*/
public class StringTypeConversionExercise {
    public static void main(String[] args) {
        int intValue = 42;
        String intString = Integer.toString(intValue);
        
        String floatString = "3.14";
        float floatValue = Float.parseFloat(floatString);
        
        System.out.println("Converted integer to string: " + intString);
        System.out.println("Converted string to float: " + floatValue);
    }
}
