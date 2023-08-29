
/*
Métodos Abstratos:
Métodos que são declarados mas não têm implementação. Eles precisam ser implementados em uma subclasse.

Explicação:
Neste exemplo, temos uma classe abstrata 'Animal' com um método abstrato 'sound'. Temos duas subclasses 'Lion' e 'Bird' 
que fornecem a implementação para o método 'sound'.
*/

abstract class AnimalAbstract {
    abstract void sound();
}

class Lion extends AnimalAbstract {
    @Override
    void sound() {
        System.out.println("Lion roars.");
    }
}

class Bird extends AnimalAbstract {
    @Override
    void sound() {
        System.out.println("Bird chirps.");
    }
}

public class AbstractMethodExample {
    public static void main(String[] args) {
        AnimalAbstract animal1 = new Lion();
        animal1.sound();

        AnimalAbstract animal2 = new Bird();
        animal2.sound();
    }
}

