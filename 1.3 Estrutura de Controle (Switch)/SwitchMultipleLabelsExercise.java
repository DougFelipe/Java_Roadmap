
/*
`switch` com múltiplos labels para um único bloco

Um único bloco `case` pode ter vários labels, permitindo que várias entradas correspondam ao mesmo bloco.

Neste exemplo, avaliamos um dia e verificamos se é um dia útil ou de fim de semana.
*/
public class SwitchMultipleLabelsExercise {
    public static void main(String[] args) {
        int day = 6;
        
        switch (day) {
            case 1, 7 -> System.out.println("It's a weekend day!");
            case 2, 3, 4, 5, 6 -> System.out.println("It's a weekday.");
            default -> System.out.println("Invalid day.");
        }
    }
}
