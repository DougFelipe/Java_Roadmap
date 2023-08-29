
/*
Sobrescrita de Métodos:
Sobrescrita de métodos permite que uma subclasse forneça uma implementação específica 
para um método que já é fornecido por sua classe pai.

Explicação:
No exemplo abaixo, a classe 'Animal' tem um método 'sound'. A classe 'Cat' é uma subclasse 
de 'Animal' e sobrescreve o método 'sound' para fornecer sua própria implementação.
*/

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class MethodOverriding extends Animal {

    // Sobrescrevendo o método 'sound'
    void sound() {
        System.out.println("Cat says: Meow");
    }

    public static void main(String[] args) {
        Animal myCat = new MethodOverriding();
        myCat.sound();
    }
}
