
/*
Uso do Polimorfismo com Herança:
Polimorfismo é o conceito pelo qual podemos usar uma única forma de algo de várias maneiras. 
Com a herança, podemos ter um método que funciona de maneira diferente em subclasses.

Explicação:
Neste exemplo, temos uma superclasse 'Shape' e duas subclasses 'Circle' e 'Rectangle'. Todas as três classes têm 
um método 'area'. A forma como este método calcula a área varia entre as classes.
*/

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    
    double area() {
        return 3.14 * radius * radius;
    }
}

class RectanglePolymorphismExample extends Shape {
    double length, width;

    RectanglePolymorphismExample(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new RectanglePolymorphismExample(10, 20);
        
        System.out.println("Area of Circle: " + shape1.area());
        System.out.println("Area of Rectangle: " + shape2.area());
    }
}

