
/*
Classes Abstratas:
Uma classe que é declarada usando a palavra-chave `abstract` é conhecida como classe abstrata. Não pode ser instanciada, mas 
pode ser subclassificada.

Explicação:
Neste exemplo, temos uma classe abstrata 'Shape' com um método abstrato 'draw'. Temos duas subclasses 'Rectangle' e 'Circle' 
que fornecem a implementação para o método 'draw'.
*/

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        shape1.draw();

        Shape shape2 = new Circle();
        shape2.draw();
    }
}

