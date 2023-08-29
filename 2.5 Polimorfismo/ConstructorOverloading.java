
/*
Sobrecarga de Construtores:
A capacidade de uma classe de ter vários construtores com parâmetros diferentes é conhecida como sobrecarga de construtores.

Explicação:
Neste exemplo, temos uma classe 'Box' que possui três construtores sobrecarregados. Cada construtor inicializa os atributos 
da classe de maneira diferente.
*/

class Box {
    double width;
    double height;
    double depth;

    // Constructor used when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions are specified
    Box() {
        width = height = depth = 0;
    }

    // Constructor used when a cube is created
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box cube = new Box(7);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of cube: " + cube.volume());
    }
}

