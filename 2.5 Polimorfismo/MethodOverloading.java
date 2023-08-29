
/*
Sobrecarga de Métodos:
Permite que uma classe tenha mais de um método com o mesmo nome, mas com diferentes listas de parâmetros.

Explicação:
Neste exemplo, temos uma classe 'Overload' que possui vários métodos sobrecarregados chamados 'test'. Cada método tem 
uma assinatura única.
*/

class Overload {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Overload obj = new Overload();
        double result;

        obj.test();
        obj.test(10);
        obj.test(10, 20);
        result = obj.test(123.25);
        System.out.println("Result of obj.test(123.25): " + result);
    }
}

