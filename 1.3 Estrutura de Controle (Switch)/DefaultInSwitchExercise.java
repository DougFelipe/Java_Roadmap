
/*
Uso do `default` para tratar casos não especificados

O bloco `default` é executado quando nenhum `case` corresponde à expressão do `switch`.

Neste exemplo, avaliamos um número e imprimimos um dia da semana ou uma mensagem de erro se o número for inválido.
*/
public class DefaultInSwitchExercise {
    public static void main(String[] args) {
        int day = 8;
        String dayString;
        
        switch (day) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;
            default:
                dayString = "Invalid day";
                break;
        }
        System.out.println(dayString);
    }
}
