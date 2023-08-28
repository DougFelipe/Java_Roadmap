
/*
Operador `this`

Referencia a instância atual de um objeto.

Neste exemplo, usamos o operador `this` para referenciar a instância atual de um objeto dentro de um método.
*/
class MyClass {
    int x;

    void setX(int x) {
        this.x = x;  // 'this' refere-se à instância atual do objeto
    }

    int getX() {
        return this.x;
    }
}

public class ThisOperatorExercise {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.setX(15);

        System.out.println("Value of x: " + obj.getX());
    }
}
