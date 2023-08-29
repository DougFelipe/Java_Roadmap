
/*
Conceito de Herança:
Herança é um dos pilares da orientação a objetos que permite criar uma nova classe com base em uma classe existente. 
A nova classe herda atributos e comportamentos da classe base.

Explicação:
Neste exemplo, a classe 'Animal' é a superclasse, e a classe 'Dog' é a subclasse. A subclasse 'Dog' herda o método 
'sound' da superclasse 'Animal' e o sobrescreve para fornecer sua própria implementação.
*/

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

