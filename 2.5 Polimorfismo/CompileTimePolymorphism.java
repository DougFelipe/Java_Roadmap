
/*
Polimorfismo em Tempo de Compilação:
Também conhecido como polimorfismo estático. Em tempo de compilação, o compilador Java determina o método a ser chamado 
com base na referência da classe.

Explicação:
Neste exemplo, temos uma classe 'Calculator' com dois métodos 'add'. Um método aceita dois inteiros e o outro aceita três. 
Isso é chamado de sobrecarga de método, que é uma forma de polimorfismo em tempo de compilação.
*/

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Sum of 10 and 20: " + calculator.add(10, 20));
        System.out.println("Sum of 10, 20 and 30: " + calculator.add(10, 20, 30));
    }
}

