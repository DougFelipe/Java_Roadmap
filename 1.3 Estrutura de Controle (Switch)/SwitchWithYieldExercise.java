
/*
`switch` com yield para retornar valores (Java 12+)

No Java 12+, o `yield` pode ser usado dentro de um bloco `case` para retornar um valor de um `switch` expressão.

Neste exemplo, usamos o `yield` para retornar o nome do mês com base em um número.
*/
public class SwitchWithYieldExercise {
    public static void main(String[] args) {
        int monthNumber = 4;
        
        String monthName = switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> {
                yield "Invalid month";
            }
        };
        
        System.out.println("The month is: " + monthName);
    }
}
