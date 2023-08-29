
/*
Interfaces e Polimorfismo:
Em Java, uma classe pode implementar várias interfaces, o que é uma forma de alcançar o polimorfismo.

Explicação:
Neste exemplo, temos uma interface 'Flyable' e uma classe 'Airplane' que implementa essa interface. A interface define 
um contrato que a classe 'Airplane' deve seguir.
*/

interface Flyable {
    void fly();
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane flies in the sky.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Flyable flyable = new Airplane();
        flyable.fly();
    }
}

