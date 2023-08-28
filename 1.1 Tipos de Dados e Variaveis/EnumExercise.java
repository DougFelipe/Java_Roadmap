
/*
Tipos Enumerados (`enum`)

O tipo 'enum' em Java é um tipo especial de classe que representa um grupo de constantes (variáveis 
que não mudam).

Neste exemplo, definimos um tipo 'enum' para representar os dias da semana e usamos esse tipo em um switch.
*/
public class EnumExercise {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch(today) {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            default:
                System.out.println("It's some other day.");
        }
    }
}
