
/*
Operador `super`

Usado para chamar construtores e métodos da superclasse em uma hierarquia de herança.

Neste exemplo, usamos o operador `super` para chamar o construtor da superclasse.
*/
class ParentClass {
    int x;

    ParentClass(int x) {
        this.x = x;
    }
}

class ChildClass extends ParentClass {
    ChildClass(int x) {
        super(x);  // Chamando o construtor da superclasse
    }

    void display() {
        System.out.println("Value of x: " + x);
    }
}

public class SuperOperatorExercise {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass(10);
        obj.display();
    }
}
