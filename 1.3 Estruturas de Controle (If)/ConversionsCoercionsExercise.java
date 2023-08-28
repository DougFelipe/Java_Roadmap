
/*
Conversões e coerções

Cuidados ao usar conversões e coerções de tipo dentro de uma expressão `if`.

Neste exemplo, mostramos como a coerção automática pode levar a resultados inesperados.
*/
public class ConversionsCoercionsExercise {
    public static void main(String[] args) {
        double value = 1.0;
        
        if (value == 1) {
            System.out.println("The value is 1.0.");
        } else {
            System.out.println("The value is not 1.0.");
        }
    }
}
