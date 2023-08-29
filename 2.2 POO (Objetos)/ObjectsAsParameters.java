
/*
Objetos como Parâmetros:
Os objetos podem ser passados como parâmetros para métodos.

Explicação:
No exemplo abaixo, temos uma classe 'Calculator' com um método 'add'. O método 'add' 
aceita dois objetos da classe 'Number' como parâmetros e retorna a soma de seus valores.
*/

class Number {
    int value;

    Number(int v) {
        value = v;
    }
}

public class ObjectsAsParameters {

    public int add(Number num1, Number num2) {
        return num1.value + num2.value;
    }

    public static void main(String[] args) {
        ObjectsAsParameters calculator = new ObjectsAsParameters();
        Number n1 = new Number(5);
        Number n2 = new Number(3);
        int result = calculator.add(n1, n2);
        System.out.println("Sum: " + result);
    }
}
