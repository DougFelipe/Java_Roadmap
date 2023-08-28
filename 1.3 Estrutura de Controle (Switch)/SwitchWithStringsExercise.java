
/*
Introdução ao `switch` com Strings (Java 7+)

A partir do Java 7, é possível usar Strings na expressão do `switch`.

Neste exemplo, avaliamos uma string e imprimimos uma mensagem com base nela.
*/
public class SwitchWithStringsExercise {
    public static void main(String[] args) {
        String day = "Monday";
        
        switch (day) {
            case "Sunday":
                System.out.println("It's a weekend day!");
                break;
            case "Saturday":
                System.out.println("It's a weekend day!");
                break;
            default:
                System.out.println("It's a weekday.");
                break;
        }
    }
}
