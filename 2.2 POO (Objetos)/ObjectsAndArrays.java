
/*
Objetos e Arrays:
Arrays podem armazenar objetos e criar arrays de objetos.

Explicação:
No exemplo abaixo, temos uma classe 'Fruit'. Criamos um array de objetos 'Fruit' 
e inicializamos cada elemento do array com um objeto 'Fruit'.
*/

class Fruit {
    String name;

    Fruit(String n) {
        name = n;
    }

    void display() {
        System.out.println("Fruit: " + name);
    }
}

public class ObjectsAndArrays {

    public static void main(String[] args) {
        // Criando um array de objetos Fruit
        Fruit[] fruits = new Fruit[3];

        fruits[0] = new Fruit("Apple");
        fruits[1] = new Fruit("Banana");
        fruits[2] = new Fruit("Cherry");

        for (Fruit fruit : fruits) {
            fruit.display();
        }
    }
}
