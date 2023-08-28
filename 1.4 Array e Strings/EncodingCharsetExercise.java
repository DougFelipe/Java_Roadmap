
/*
Conceitos de encoding e charset

Compreensão do encoding em Strings e como ele se relaciona com diferentes charsets.

Neste exemplo, demonstramos a conversão de uma string em bytes usando diferentes charsets.
*/
import java.nio.charset.StandardCharsets;

public class EncodingCharsetExercise {
    public static void main(String[] args) {
        String str = "Hello";
        
        byte[] utf8Bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] isoBytes = str.getBytes(StandardCharsets.ISO_8859_1);
        
        System.out.println("UTF-8 bytes:");
        for (byte b : utf8Bytes) {
            System.out.print(b + " ");
        }
        
        System.out.println("\nISO-8859-1 bytes:");
        for (byte b : isoBytes) {
            System.out.print(b + " ");
        }
    }
}
