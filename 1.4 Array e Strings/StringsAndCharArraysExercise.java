
/*
Strings e char arrays

Como converter Strings em char arrays e vice-versa.

Neste exemplo, convertemos uma string em um array de caracteres e, em seguida, o array de volta em uma string.
*/
public class StringsAndCharArraysExercise {
    public static void main(String[] args) {
        String str = "Java";
        char[] charArray = str.toCharArray();
        
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        
        String newStr = new String(charArray);
        System.out.println("\nConverted char array to string: " + newStr);
    }
}
