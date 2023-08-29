
/*
Uso de `instanceof` com Polimorfismo:
A palavra-chave `instanceof` é usada para testar se um objeto é uma instância de uma classe, subclasse ou interface.

Explicação:
Neste exemplo, temos uma superclasse 'Fruit' e duas subclasses 'Apple' e 'Orange'. Usamos o operador `instanceof` 
para verificar o tipo real do objeto durante a execução.
*/

class Fruit {
    void display() {
        System.out.println("It's a fruit.");
    }
}

class Apple extends Fruit {
    @Override
    void display() {
        System.out.println("It's an apple.");
    }
}

class Orange extends Fruit {
    @Override
    void display() {
        System.out.println("It's an orange.");
    }
}

public class InstanceofUsage {
    public static void main(String[] args) {
        Fruit myFruit = new Apple();
        
        if (myFruit instanceof Apple) {
            myFruit.display();
        }

        myFruit = new Orange();
        
        if (myFruit instanceof Orange) {
            myFruit.display();
        }
    }
}

