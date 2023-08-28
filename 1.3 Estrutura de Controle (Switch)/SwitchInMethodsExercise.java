
/*
Uso do `switch` em métodos para retornar valores

O `switch` pode ser usado dentro de métodos para retornar valores com base em uma avaliação.

Neste exemplo, temos um método que retorna o nome do mês com base em um número.
*/
public class SwitchInMethodsExercise {
    public static void main(String[] args) {
        int monthNumber = 4;
        String monthName = getMonthName(monthNumber);
        System.out.println("The month is: " + monthName);
    }
    
    public static String getMonthName(int monthNumber) {
        String month;
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month";
                break;
        }
        return month;
    }
}
