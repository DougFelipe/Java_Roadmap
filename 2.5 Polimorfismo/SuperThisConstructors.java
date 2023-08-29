
/*
Uso de `super` e `this` para chamar construtores sobrecarregados:
Em Java, a palavra-chave `super` é usada para chamar o construtor da superclasse, enquanto a palavra-chave `this` é 
usada para chamar um construtor sobrecarregado na mesma classe.

Explicação:
Neste exemplo, temos uma superclasse 'Parent' e uma subclasse 'Child'. A subclasse usa `super` para chamar o construtor 
da superclasse e `this` para chamar um construtor sobrecarregado na mesma classe.
*/

class Parent {
    Parent() {
        System.out.println("Constructor of Parent class.");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Constructor of Child class with no parameters.");
    }

    Child(int x) {
        this();
        System.out.println("Constructor of Child class with parameter: " + x);
    }
}

public class SuperThisConstructors {
    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println("------------------");
        Child child2 = new Child(10);
    }
}

