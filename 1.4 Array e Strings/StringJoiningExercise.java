
/*
StringJoiner e String.join

Unindo Strings de maneira eficiente com `StringJoiner` e `String.join`.

Neste exemplo, usamos String.join para unir várias strings em uma única string separada por vírgulas.
*/
public class StringJoiningExercise {
    public static void main(String[] args) {
        String[] elements = {"Java", "Python", "C++"};
        
        String joined = String.join(", ", elements);
        System.out.println("Joined languages: " + joined);
    }
}
