
/*
Operador `new`

Usado para criar uma instância de um objeto ou para alocar memória.

Neste exemplo, usamos o operador `new` para criar uma instância de uma classe e alocar memória para um array.
*/
public class NewOperatorExercise {
    public static void main(String[] args) {
        Object obj = new Object();
        int[] arr = new int[10];

        System.out.println("Object created: " + obj);
        System.out.println("Array length: " + arr.length);
    }
}
