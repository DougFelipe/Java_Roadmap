
/*
Herança e Extensão:
Herança é um dos pilares da OOP e permite que uma classe adquira os membros (atributos e métodos) 
de outra classe. A classe que herda é chamada de subclasse e a classe da qual ela herda é chamada 
de superclasse.

Explicação:
No exemplo abaixo, temos uma superclasse 'Animal' e uma subclasse 'Dog' que herda de 'Animal'.
A subclasse 'Dog' tem acesso aos membros da superclasse 'Animal' e também pode ter seus próprios 
membros adicionais ou sobrescrever os membros da superclasse.
*/

class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

public class Inheritance extends Animal {
    String breed;

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public static void main(String[] args) {
        Inheritance myDog = new Inheritance();
        myDog.name = "Buddy";
        myDog.breed = "Golden Retriever";
        myDog.eat();
        myDog.bark();
    }
}
