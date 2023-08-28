
/*
Novas melhorias do `switch` com expressões (Java 12+)

A partir do Java 12, o `switch` pode ser usado como uma expressão, o que permite retornar um valor.

Neste exemplo, usamos o `switch` como uma expressão para determinar o número de dias em um mês.
*/
public class SwitchExpressionsExercise {
    public static void main(String[] args) {
        int month = 2;
        int year = 2020;
        
        int numDays = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
        
        System.out.println("Number of Days = " + numDays);
    }
}
