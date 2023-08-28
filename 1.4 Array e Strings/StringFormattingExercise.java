
/*
Formatando Strings

Uso de `String.format()` e `printf()` para formatar Strings.

Neste exemplo, formatamos números em diferentes formatos usando String.format().
*/
public class StringFormattingExercise {
    public static void main(String[] args) {
        double value = 3.14159;
        
        String formatted = String.format("Formatted value: %.2f", value);
        System.out.println(formatted);
    }
}
