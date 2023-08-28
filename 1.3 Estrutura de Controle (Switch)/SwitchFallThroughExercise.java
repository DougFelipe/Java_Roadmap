
/*
`switch` sem `break`: 'fall-through'

Se não houver um `break` após um `case`, a execução continuará até encontrar um `break` ou até o final do `switch`.

Neste exemplo, avaliamos um mês e imprimimos o número de dias nele.
*/
public class SwitchFallThroughExercise {
    public static void main(String[] args) {
        int month = 2;
        int year = 2020;
        int numDays = 0;
        
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = " + numDays);
    }
}
