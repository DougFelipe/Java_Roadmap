
/*
Operadores de Atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis. O operador '=' é o operador 
de atribuição mais simples, mas Java também suporta operadores de atribuição compostos como '+=', '-=', '*=', etc.

Neste exemplo, demonstramos o uso de vários operadores de atribuição.
*/
public class AssignmentOperatorsExercise {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Initial value of x: " + x);
        
        x += 5;
        System.out.println("After x += 5: " + x);
        
        x -= 3;
        System.out.println("After x -= 3: " + x);
        
        x *= 2;
        System.out.println("After x *= 2: " + x);
    }
}
