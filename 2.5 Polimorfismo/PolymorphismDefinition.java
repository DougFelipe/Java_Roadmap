
/*
Definição de Polimorfismo:
Polimorfismo refere-se à capacidade de uma variável, função ou objeto ter múltiplas formas. Em Java, é realizado principalmente 
usando herança e interfaces.

Explicação:
Neste exemplo, temos uma superclasse 'Animal' e duas subclasses 'Dog' e 'Cat'. Ambas as subclasses sobrescrevem o método 
'sound' da superclasse. O polimorfismo permite que chamemos esse método usando uma referência da superclasse, mas a implementação 
real é determinada em tempo de execução.
*/

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDefinition {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
}

