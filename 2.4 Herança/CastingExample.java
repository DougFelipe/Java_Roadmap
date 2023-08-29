
/*
Cast entre Superclasse e Subclasse:
Em Java, podemos converter um objeto de uma superclasse para uma subclasse e vice-versa. No entanto, é importante garantir 
que o objeto seja de fato uma instância da classe para a qual está sendo convertido.

Explicação:
Neste exemplo, criamos um objeto da subclasse 'Laptop' e o atribuímos a uma variável de referência da superclasse 'Computer'. 
Em seguida, fazemos um cast desse objeto de volta para 'Laptop'.
*/

class Computer {
    void compute() {
        System.out.println("Computing...");
    }
}

class Laptop extends Computer {
    void fold() {
        System.out.println("Folding the laptop.");
    }
}

class CastingExample {
    public static void main(String[] args) {
        Computer computer = new Laptop();  // Upcasting
        computer.compute();

        // Downcasting
        if (computer instanceof Laptop) {
            Laptop laptop = (Laptop) computer;
            laptop.fold();
        }
    }
}

