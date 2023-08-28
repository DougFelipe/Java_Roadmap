
/*
`switch` com `enum`

O `enum` é um tipo especial em Java que representa um grupo de constantes. O `switch` pode ser usado com `enum`.

Neste exemplo, avaliamos um `enum` e imprimimos uma mensagem com base no seu valor.
*/
public class SwitchWithEnumExercise {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        
        switch (day) {
            case SUNDAY:
                System.out.println("It's a weekend day!");
                break;
            case SATURDAY:
                System.out.println("It's a weekend day!");
                break;
            default:
                System.out.println("It's a weekday.");
                break;
        }
    }
}
