
/*
Classes Abstratas:
Uma classe abstrata é uma classe que não pode ser instanciada e pode conter métodos abstratos. 
Métodos abstratos são métodos que são declarados na classe abstrata, mas não têm implementação. 
Qualquer subclasse que estenda a classe abstrata deve fornecer uma implementação para todos os 
métodos abstratos da classe pai.

Explicação:
No exemplo abaixo, temos uma classe abstrata 'Shape' com um método abstrato 'area'. 
A classe 'Circle' estende 'Shape' e fornece uma implementação para o método 'area'.
*/

abstract class Shape {
    abstract double area();
}

public class AbstractClasses extends Shape {
    double radius;

    AbstractClasses(double r) {
        radius = r;
    }

    // Implementação do método abstrato 'area'
    double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        AbstractClasses circle = new AbstractClasses(5.0);
        System.out.println("Area of circle: " + circle.area());
    }
}
