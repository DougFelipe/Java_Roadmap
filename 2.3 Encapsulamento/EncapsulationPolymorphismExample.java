
/*
Encapsulamento e Polimorfismo:
O encapsulamento permite que os detalhes internos de uma classe sejam ocultados, enquanto o polimorfismo 
permite que sejamos flexíveis na forma como interagimos com objetos de diferentes classes.

Explicação:
No exemplo abaixo, temos uma superclasse 'Animal' e duas subclasses 'Dog' e 'Cat'. Usando polimorfismo, 
podemos referenciar objetos das subclasses usando uma referência da superclasse. 
Os detalhes internos de cada classe (como a implementação do método sound) são encapsulados.
*/

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class EncapsulationPolymorphismExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.sound();
        cat.sound();
    }
}

